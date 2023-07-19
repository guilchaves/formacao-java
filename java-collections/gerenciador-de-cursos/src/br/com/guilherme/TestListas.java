package br.com.guilherme;

import java.util.ArrayList;
import java.util.Collections;

public class TestListas {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

//        for (String aula : aulas) {
//            System.out.println(aulas);
//        }

        aulas.add("Aumentando nosso conhecimento");
        Collections.sort(aulas);
        aulas.forEach(aula -> System.out.println(aula));
    }
}