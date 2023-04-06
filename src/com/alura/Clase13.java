package com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Clase13 {

    public static void main(String[] args) {
        String alumno1 = "Luis Miguel";
        String alumno2 = "Pepito los palotes";
        String alumno3 = "Juan Carlos";
        String alumno4 = "pedro Pedrito";
        String alumno5 = "Gustavo sanchez";
        String alumno6 = "Marcia Maria";
        String alumno7 = "Marcia Maria";
        String alumno8 = "Gustavo sanchez";

        Collection<String> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);

//        listaAlumnos.forEach(alumno->{
//            System.out.println(alumno);
//        });

        boolean valida = listaAlumnos.contains("pedro Pedrito");

        String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
        listaAlumnos.removeIf(alumno -> "pedro Pedrito".equalsIgnoreCase(alumno));
        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });
        // System.out.println(max.length());


    }
}
