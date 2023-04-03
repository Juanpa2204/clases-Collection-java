package com.alura.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nombre;
    private int tiempo;
    private List<Clase> claseList = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Curso(String nombre, int tiempo, List<Clase> claseList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.claseList = claseList;
    }

    public List<Clase> getClaseList() {
        return claseList;
    }

    public void addClase(Clase clase){
        this.claseList.add(clase);
    }

    public void setClaseList(List<Clase> claseList) {
        this.claseList = claseList;
    }

    @Override
    public String toString(){
        return this.nombre;
    }

}
