package zooAnimales;
import gestion.*;

import java.util.ArrayList;

public class Pez extends Animal{
    private static ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(){
        Pez.listado.add(this);
    }

    public Pez( String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas ){
        super( nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        Pez.listado.add(this);


    }

    public static int cantidadPeces(){
        return listado.size();
    }
    @Override
    public String movimiento(){
        return "nadar";
    }

    public int crearSalmon(String nombre, int edad, String genero, Zona zona){
        salmones +=1;
        new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6);
        return cantidadPeces();
    }
    public int crearBacalao(String nombre, int edad, String genero, Zona zona){
        bacalaos +=1;
        new Pez(nombre, edad, "oceano", genero, zona, "gris", 6);
        return cantidadPeces();
    }

    public static ArrayList<Pez> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Pez> listado) {
        Pez.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}
