package com.mycompany.vetor_resultante;
import java.util.Scanner;
public class Vetor_resultante {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor_1[] = new int[8];
        int vetor_2 [] = new int[8];
        int resultante[] = new int[8];
        for(int i = 0; i <= vetor_1.length-1; i++){
            System.out.println("Digite o valor " + (i + 1) + " do vetor 1");
            vetor_1[i] = entrada.nextInt();
        }
        for(int i = 0; i <= vetor_2.length-1; i++){
            System.out.println("Digite o valor " + (i + 1) + " do vetor 2");
            vetor_2[i] = entrada.nextInt();
        }
        for(int i = 0; i <= resultante.length - 1; i++){
            resultante[i] = vetor_1[i] + vetor_2[i];
            System.out.println("O vetor resultante e " + resultante[i]);
        }
    }
}
