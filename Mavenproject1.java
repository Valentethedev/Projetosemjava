package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[6];
        int soma_pares = 0, contador_impar = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o numero " + (i + 1));
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Os numeros pares sao ");
        for(int i = 0; i< numeros.length; i++){
            if(numeros[i] % 2 == 0){
                soma_pares =+ numeros[i];
                System.out.println("numero " + numeros[i] + " na posicao " + (i + 1));
            }
        }
        System.out.println("Soma dos pares = " + soma_pares);
        System.out.println("Os numeros impares sao ");
        for(int i = 0; i< numeros.length; i++){
            if(numeros[i] % 2 != 0){
                contador_impar++;
                System.out.println("numero " + numeros[i] + " na posicao " + (i + 1));
                
                
            }
        }
        System.out.println("Quantidade de impares = " + contador_impar);
        }
    }

