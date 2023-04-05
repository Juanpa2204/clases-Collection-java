package com.alura;

import com.alura.modelo.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Clase10 {

    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>(){
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {

        Curso curso1 = new Curso("historia", 30);
        Curso curso2 = new Curso("quimica", 10);
        Curso curso3 = new Curso("aritmetica", 20);
        Curso curso4 = new Curso("geometria", 50);
        Curso curso5 = new Curso("fisica", 60);
        Curso curso6 = new Curso("quimica", 80);
        Curso curso7 = new Curso("fisica", 70);
        Curso curso8 = new Curso("educacion fisica", 30);


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);
        cursos.add(curso7);
        cursos.add(curso8);

        List<Curso> cursoList = cursos.stream().filter(curso-> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());

        System.out.println(cursos.stream().filter(curso-> !curso.getNombre().equalsIgnoreCase("historia")).mapToInt(Curso::getTiempo).sum());
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());

        Map<String, List<Curso>> groupCurs = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
        groupCurs.forEach((key,value)-> System.out.println(key+ " - " + value.size()));

        System.out.println( cursos.parallelStream().mapToInt(Curso::getTiempo).sum());

    }
}
