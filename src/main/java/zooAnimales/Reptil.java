package zooAnimales;

import gestion.*;

import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(){Reptil.listado.add(this);}

    public Reptil( String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola){
        super( nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        Reptil.listado.add(this);


    }

    public static  int cantidadReptiles(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "reptar";
    }

    public int crearIguana(String nombre, int edad, String genero, Zona zona){
        iguanas+=1;
        new Reptil(nombre, edad, "humedal", genero, zona, "verde", 3);
        return cantidadReptiles();
    }

    public int crearSerpiente(String nombre, int edad, String genero, Zona zona){
        serpientes+=1;
        new Reptil(nombre, edad, "jungla", genero, zona, "blanco", 1);
        return cantidadReptiles();
    }

    public static ArrayList<Reptil> getListado(){
        return listado;
    }

    public void setListado(ArrayList<Reptil> listado){
        Reptil.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
}