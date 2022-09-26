package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Anfibio extends  Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(){
        super();
        Anfibio.listado.add(this);
    }

    public Anfibio( String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super( nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        Anfibio.listado.add(this);
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

    public static Anfibio crearRana( String nombre, int edad, String genero){
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }

    public static Anfibio crearSalamandra( String nombre, int edad, String genero){
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);

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
