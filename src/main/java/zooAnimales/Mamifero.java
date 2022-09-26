package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado;
    public  static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(){
        Mamifero.listado.add(this);
    }

    public Mamifero( String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super( nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        Mamifero.listado.add(this);

    }

    public Mamifero( String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
        super( nombre, edad, habitat, genero, zona);
        this.pelaje = pelaje;
        this.patas = patas;
        Mamifero.listado.add(this);

    }

    public static  int cantidadMamiferos(){
        return listado.size();
    }

    public int crearCaballo(String nombre, int edad, String genero){
        caballos+=1;
        new Mamifero(nombre, edad, "pradera", genero, true, 4 );
        return cantidadMamiferos();
    }


    public  int crearLeon(String nombre, int edad, String genero){
        leones+=1;
        new Mamifero(nombre, edad,"selva", genero, true, 4 );
        return cantidadMamiferos();
    }

    public static ArrayList<Mamifero> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Mamifero> listado) {
        Mamifero.listado = listado;
    }

    public boolean getPelaje() {
        return this.pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
