// 2 vetores
// x[] + y[] = z[]
package com.mycompany.mesclando_vetores;
import java.util.Scanner;
public class Mesclando_vetores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x [] = new int [5];
        int y [] = new int [5];
        int z [] = new int [10];
        for(int i = 0; i <= x.length - 1; i++){
            System.out.println("Digite o valor " + i + " do vetor x");
            x[i] = entrada.nextInt();
        }
        for(int i = 0; i <= y.length - 1; i++){
            System.out.println("Digite o valor " + i + " do vetor y");
            y[i] = entrada.nextInt();
        }
        for(int i = 0; i <= 9; i ++){
           z[i] = x[i]; 
           System.out.println(z[i]);
           z[i] = y[i];
           System.out.println(z[i]);
       }
        
    }
}
