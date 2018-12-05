/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resztamontecarloblad;

import java.util.Scanner;

public class resztamontecarloblad {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        int zl, gr, r, i = 0;  
       
        Scanner wejscie = new Scanner(System.in);
        System.out.println("zl:?");
        zl=wejscie.nextInt();
        System.out.println("gr:?");
        gr=wejscie.nextInt();
                
        
        final int[] M = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        final int[] ILOSC = {1,2,3,2,1,31,23,35,0}; //Dokładnych iosci nie pamiętam xD
        
        //zl = 7;
       // gr = 53;// tu wpisujecie kwote, tez nie pamietam ile dokladnie ale gdzies kolo tego
        r = zl * 100 + gr;
        while (r > 0) {
                       
            if (r >= M[i] && ILOSC[i] > 0 ) {
                System.out.print(M[i] / 100.0 + " ");
                r = r - M[i];
                ILOSC[i] = ILOSC[i]-1;
              }
            else if(i<8){i++;}
            else if(i>7){
             System.out.println("blad, nie da się wydac calosci");
                break ;
            }
}}}