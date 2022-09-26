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
        super();
    }


    public Pez( String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas ){
        super( nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
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

    public static Pez crearSalmon(String nombre, int edad, String genero){
        salmones +=1;
        return new Pez(nombre, edad, "oceano", genero, "rojo", 6);

    }
    public static Pez crearBacalao(String nombre, int edad, String genero){
        bacalaos +=1;
        return new Pez(nombre, edad, "oceano", genero, "gris", 6);

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
