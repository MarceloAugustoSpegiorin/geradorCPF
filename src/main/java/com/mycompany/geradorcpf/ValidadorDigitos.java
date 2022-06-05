package com.mycompany.geradorcpf;

import java.util.ArrayList;

public class ValidadorDigitos {

    public ArrayList<Integer> ValidadorDigitos(ArrayList<Integer> Digitos) {
        int peso = 10;
        int somaDigitosComPeso = 0;
        for (int i = 0; i < 2; i++) {

            if (i == 1) {
                peso = 11;
            }
            somaDigitosComPeso = 0;
            for (int Digito : Digitos) {
                somaDigitosComPeso = somaDigitosComPeso + (Digito * peso);
                peso--;
            }

            int restodaDivisao = (somaDigitosComPeso % 11);
            int digitosGerado;

            if (restodaDivisao < 2) {
                digitosGerado = 0;
            } else {
                digitosGerado = 11 - restodaDivisao;

            }
            Digitos.add(digitosGerado);
        }
        return Digitos;

    }

}
