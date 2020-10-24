package com.company;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> Ex1(List<Integer> lista_de_note) {
        List<Integer> note_insuficiente = new ArrayList<>();
            for(int i:lista_de_note){
                if(i < 40)
                    note_insuficiente.add(i);
            }
            return note_insuficiente;
    }
    public static int Ex2(List<Integer> lista_de_note){
       int suma = 0;
        for(int i:lista_de_note){
            suma=+i;
        }
        return suma/lista_de_note.size();
    }
    public static List<Integer> Ex3(List<Integer> lista_de_note){
        List<Integer> note_rotunjite = new ArrayList<>();
        for(int nota:lista_de_note) {
            if(nota > 40) {
                if ((nota % 10) % 5 == 0)
                    note_rotunjite.add(nota);
                if ((nota % 10) < 3) {
                    nota = nota - (nota % 10);
                    note_rotunjite.add(nota);
                } else {
                    if ((nota % 10) >= 3 && (nota % 10) < 5) {
                        nota = nota + (5 - (nota % 10));
                        note_rotunjite.add(nota);
                    }
                }
                if ((nota % 10) < 8 && (nota % 10) > 5) {
                    nota = nota - ((nota % 10) - 5);
                    note_rotunjite.add(nota);
                } else {
                    if ((nota % 10) >= 8) {
                        nota = nota + (10 - (nota % 10));
                        note_rotunjite.add(nota);
                    }
                }
            }
        }
        return note_rotunjite;
    }
    public static int Ex4(List<Integer> lista_de_note){
        List<Integer> note_rotunjite2 = new ArrayList<>();
        note_rotunjite2 = Ex3(lista_de_note);
        int maxim = 39;
        for(int nota:note_rotunjite2) {
            if (nota > maxim)
                maxim = nota;
        }
            return maxim;
    }

}

