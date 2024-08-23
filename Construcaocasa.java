//O programa recebe o valor da da largura e altura de 3 comodos, calcula a area de cada um e calcula a area total somando as areas
package com.mycompany.construcaocasa;
import java.util.Scanner;
class Construcaocasa{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float lc1, cc1, ac1, lc2, cc2, ac2, lc3, cc3, ac3, sa; // Declaracao das variaveis lc1 = Largura comodo 1, cc1 = Comprimento comodo 1, ac1 = area comodo 1, lc2 = Largura comodo 2, cc2 = Comprimento comodo 2, ac2 = area comodo 2 lc3 = Largura comodo 3, cc3 = Comprimento comodo 3, ac3 = area comodo 3, sc = soma das areas dos comodos
        System.out.println("Digite a largura do comodo 1"); //instrucao para o usuario digitar a largura do comodo 1
        lc1 = s.nextFloat(); //Capturar largura comodo 1
        System.out.println("Digite o comprimento do comodo 1"); //instrucao para o usuario digitar o comprimento do comodo 1
        cc1 = s.nextFloat(); //Capturar comprimento comodo 1
        System.out.println("Digite a largura do comodo 2"); //instrucao para o usuario digitar a largura do comodo 2
        lc2 = s.nextFloat(); //Capturar largura comodo 2
        System.out.println("Digite o comprimento do comodo 2"); //instrucao para o usuario digitar o comprimento do comodo 2
        cc2 = s.nextFloat(); //Capturar comprimento comodo 2
        System.out.println("Digite o comprimento do comodo 3"); //instrucao para o usuario digitar a largura do comodo 3
        lc3 = s.nextFloat(); //Capturar largura comodo 3
        System.out.println("Digite o comprimento do comodo 3"); //instrucao para o usuario digitar o comprimento do comodo 3
        cc3 = s.nextFloat(); //Capturar comprimento comodo 3
        ac1 = lc1 * cc1; //Area comodo 1
        ac2 = lc2 * cc2; //Area comodo 2
        ac3 = lc3 * cc3; //Area comodo 3
        sa = ac1 + ac2 + ac3; //Soma das areas
        System.out.println("A area do comodo 1 e " + ac1); //area do comodo 1 no terminal
        System.out.println("A area do comodo 2 e " + ac2); //area do comodo 2 no terminal
        System.out.println("A area do comodo 3 e " + ac3); //area do comodo 3 no terminal
        System.out.println("A soma das areas e " + sa); // soma das areas no terminal
    }
}

//Anotacoes
////Importar scanner
// Criar classe
// Criar void
//Criar o scanner
//Criar a variavel largura comodo 1
// Criar a variavel comprimento comodo 1
//Criar a variavel area comodo 1
//Criar a variavel largura comodo 2
// Criar a variavel comprimento comodo 2
//Criar a variavel area comodo 2
//Criar a variavel largura comodo 3
// Criar a variavel comprimento comodo 3
//Criar a variavel area comodo 3
//Criar a variavel soma das areas
//Criar instrucao para o usuario digitar a largura do comodo 1
//Capturar largura comodo 1
//Criar instrucao para o usuario digitar o  comprimento comodo 2
//Capturar comprimento do comodo 2
//Criar instrucao para o usuario digitar a largura do comodo 2
//Capturar largura comodo 2
//Criar instrucao para o usuario digitar o  comprimento comodo 3
//Capturar comprimento do comodo 3
//Calcular area do comodo 1
//Calcular area do comodo 2
//Calcular area do comodo 3
//Somar area dos comodos 1 2 3
//// Mostrar area do comodo 1 no terminal
// Mostrar area do comodo 2 no terminal
// Mostrar area do comodo 3 no terminal
// Mostrar soma das areas no terminal


