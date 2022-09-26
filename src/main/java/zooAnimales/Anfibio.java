package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Anfibio extends  Animal{
    private static ArrayList<Anfibio> listado;
    public int ranas;
    public int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(){

    }

    public Anfibio( String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
        super( nombre, edad, habitat, genero, zona);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        Anfibio.listado.add(this);

    }

    public static int cantidadAnfibios(){
        return listado.size();
    }
    @Override
    public String movimiento(){
        return "saltar";
    }

    public int crearRana( String nombre, int edad, String genero, Zona zona){
        new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true);
        return cantidadAnfibios();

    }

    public int crearSalamandra( String nombre, int edad, String genero, Zona zona){
        new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo", false);
        return cantidadAnfibios();

    }

    public ArrayList<Anfibio> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Anfibio> listado) {
        this.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
}
