package com.alura;

import com.alura.modelo.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Clase9 {

    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>(){
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {

        Curso curso1 = new Curso("Ruby", 30);
        Curso curso3 = new Curso("Java", 20);
        Curso curso4 = new Curso("Php", 50);
        Curso curso2 = new Curso("JavaScript", 10);


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);

        cursos.sort(Comparator.comparing(Curso::getNombre));
        Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());

        int tiempo = 0;
        for (Curso curso: cursos) {
            tiempo += curso.getTiempo();
        }

        int mayor = 0;
        for (Curso curso: cursos) {
            if (curso.getTiempo()>mayor)
            mayor = curso.getTiempo();
        }

        int suma = 0;
        for (Curso curso: cursos) {
            if (!curso.getNombre().equalsIgnoreCase("Ruby")) {
                suma += curso.getTiempo();
            }
        }


        System.out.println(suma);

        List<Curso> cursoList = cursos.stream().filter(curso-> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());

        System.out.println(cursos.stream().filter(curso-> !curso.getNombre().equalsIgnoreCase("Ruby")).mapToInt(Curso::getTiempo).sum());
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
    }
}
