package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(){
        Ave.listado.add(this);
    }

    public Ave( String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super( nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        Ave.listado.add(this);

    }

    public Ave( String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
        super( nombre, edad, habitat, genero, zona);
        this.colorPlumas = colorPlumas;
        Ave.listado.add(this);

    }

    public static int cantidadAves(){
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "volar";
    }

    public static int crearHalcon(String nombre, int edad, String genero){
        halcones += 1;
        new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        return cantidadAves();
    }

    public static int crearAguila(String nombre, int edad, String genero, Zona zona){
        aguilas+=1;
        new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo");
        return cantidadAves();

    }

    public static ArrayList<Ave> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}
