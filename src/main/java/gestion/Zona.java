package gestion;
import zooAnimales.*;

import java.util.ArrayList;


public class Zona {
    private String nombre;
    private  Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<Animal>();


    public Zona(){}

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
        zoo.agregarZonas(this);
    }

    public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales){
        this(nombre, zoo);
        this.animales = animales;
        zoo.agregarZonas(this);
    }

    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
        animal.setZona(this);
    }

    public int cantidadAnimales(){
        return animales.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }
}
