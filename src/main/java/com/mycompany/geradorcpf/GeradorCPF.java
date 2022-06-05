package com.mycompany.geradorcpf;

import java.util.ArrayList;

public class GeradorCPF {

    static ArrayList<Integer> listasNumAleatorios = new ArrayList<>();

    public static int geraNumAleatorio() {
        int numero = (int) (Math.random() * 10);
        return numero;
    }

    public static void main(String[] args) {

        for (int i = 0; i <= 8; i++) {
            listasNumAleatorios.add(geraNumAleatorio());
        }
        ValidadorDigitos validador = new ValidadorDigitos();
        validador.ValidadorDigitos(listasNumAleatorios);
        System.out.println(listasNumAleatorios.toString());
    }
}
