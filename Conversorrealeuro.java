// O programa recebe um valor em real e converte para euro
package com.mycompany.conversorrealeuro;
import java.util.Scanner; //Importar scanner
class Conversorrealeuro{ // Criar classe
    public static void main(String[] args){ // Criar void
        Scanner s = new Scanner(System.in); //Criar o scanner
        float r, ce, e; //Declaraçao de variaveis r = valor em real, ce= cotacao em euro e e = valor convertido
        ce = (float)6.22;//Cotacao atual do euro
        System.out.println("Digite o valor em real");//Instrucao para o usuario digitar o valor em real
        r = s.nextFloat(); //Capturar valor em real
        e = r/ce; //Calcular valor em euro
        System.out.println("O valor em euro e" + e);
    }
    
}

//Anotacoes
//Importar scanner
// Criar classe
// Criar void
//Criar o scanner
//Criar variavel real
//Criar variavel cotacao euro
//cotacao euro recebe 6.22
//Criar variavel euro
//Criar instruçao para o usuario receber o valor em real
//Capturar valor digitado pelo usuario
//Calcular valor em euro

