package gestion;
import zooAnimales.*;

import java.util.ArrayList;


public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales;


    public Zona(){

    }

    public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales){
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = animales;
    }

    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
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
