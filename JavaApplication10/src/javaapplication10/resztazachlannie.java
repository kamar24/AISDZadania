/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resztamontecarloblad;

import java.util.Scanner;

public class resztazachlannie {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        double zl, gr; 
        double r;
        Scanner wejscie = new Scanner(System.in);
        System.out.println("zl:?");
        zl=wejscie.nextInt();
        System.out.println("gr:?");
        gr=wejscie.nextInt();
        double [] reszta= new double [100];
        int b=0;
        int c;
        int i=0;
        
        final double[] M = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        final double[] ILOSC = {1,2,3,4,5,6,7,8,9};
        
        r = zl * 100 + gr;
        while (r > 0) {
                       
            if (r >= M[i] && ILOSC[i] > 0 ) {
                r = r - M[i];
                ILOSC[i] = ILOSC[i]-1;
                reszta[b]=M[i]/100;
                b++;
        }
            else if(i<9){i++;}
            else if(i>8){
                break ;
            }
}
        if(i<9){
             System.out.print("Reszta do wydania:");
            for(c=0;c<b;c++){
                System.out.print(reszta[c]+", ");
            }
        }else{System.out.println("blad, nie da się wydac calosci");}
 }
}