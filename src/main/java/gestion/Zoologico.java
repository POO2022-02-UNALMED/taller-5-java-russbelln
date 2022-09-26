package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico(){

    }
    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas){
        this(nombre, ubicacion);
        this.zonas = zonas;
    }

    public void agregarZonas(Zona zona){
        this.zonas.add(zona);
    }

    public int cantidadTotalAnimales(){
        int contador = 0;
        for (Zona zon: zonas) {
            contador+= zon.cantidadAnimales();
        }
        return contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZonas() {
        return this.zonas;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }


}
