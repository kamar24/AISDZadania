/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw05_11;
import java.io.*;
import java.util.*;
/**
 *
 * @author student
 */
public class ResztaMonteCarlo {
    public static void main(String args[]) {
        Scanner wejscie = new Scanner(System.in);
        String tekst;
        Random losuj = new Random();
        final int[] MONETY = {1000,2000,5000,500, 200, 100, 50, 20, 10, 5, 2, 1};
        final int LIMIT_WYDANYCH_MONET = 100;
        final int LICZBA_LOSOWAN = 100;
        int minLiczbaWydanychMonet = LIMIT_WYDANYCH_MONET;
        int[] wydaneMonety = new int[LIMIT_WYDANYCH_MONET];
        int[] minWydaneMonety = new int[LIMIT_WYDANYCH_MONET];
        int moneta, zl, gr, r;
        System.out.println("Podaj reszte..");
        System.out.print("zlotych: ");
        tekst = wejscie.next();
        zl = Integer.parseInt(tekst);
        System.out.print("groszy: ");
        tekst = wejscie.next();
        gr = Integer.parseInt(tekst);
        for (int i = 0; i < LICZBA_LOSOWAN; i++) {
            r = zl * 100 + gr;
            int liczbaWydanychMonet = 0;
            while (r > 0 && liczbaWydanychMonet < LIMIT_WYDANYCH_MONET) {
                moneta = MONETY[losuj.nextInt(MONETY.length)];
                if (r >= moneta) {
                    wydaneMonety[liczbaWydanychMonet] = moneta;
                    r -= moneta;
                    liczbaWydanychMonet++;
                }
            }
            if (minLiczbaWydanychMonet > liczbaWydanychMonet) {
                minLiczbaWydanychMonet = liczbaWydanychMonet;
                for (int j = 0; j < liczbaWydanychMonet; j++) {
                    minWydaneMonety[j] = wydaneMonety[j];
                }
            }
        }
        if (minLiczbaWydanychMonet < LIMIT_WYDANYCH_MONET) {
            System.out.print("Reszta: ");
            for (int i = 0; i < minLiczbaWydanychMonet; i++) {
                System.out.print(minWydaneMonety[i] / 100.0 + " ");
            }
        } else {
            System.out.println("Nie znaleziono rozwiązania");
        }
        System.out.println();
    }
}

