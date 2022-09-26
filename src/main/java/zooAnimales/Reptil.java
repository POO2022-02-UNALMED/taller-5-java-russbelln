package zooAnimales;

import gestion.*;

import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
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

    public Reptil( String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super( nombre, edad, habitat, genero);
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

    public static Reptil crearIguana(String nombre, int edad, String genero){
        iguanas+=1;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);

    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        serpientes+=1;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);

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
