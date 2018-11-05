/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad22_10;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Lukasz
 */
public class Zgadywanie_liczby  {
    
        public static void main(String[] args) {
        Random random = new Random();
        int liczba = random.nextInt(1000);
        Scanner pobierz = new Scanner(System.in);
        System.out.println("Losuj liczbe");
        int zgaduj = pobierz.nextInt();
        if (zgaduj == liczba) {
            System.out.println("tak udalo sie");
        }
        if (zgaduj < liczba) {
            System.out.println("za malo");
        }
        if (zgaduj > liczba) {
            System.out.println("Za duzo");
        }
        while (zgaduj != liczba) {
            zgaduj = pobierz.nextInt();
            if (zgaduj == liczba) {
                System.out.println("tak udalo sie");
            }
            if (zgaduj < liczba) {
                System.out.println("za malo");
            }
            if (zgaduj > liczba) {
                System.out.println("Za duzo");
            }
        }
        }
}
 
    


