// O programa recebe o valor de cada produto e faz a soma, o valor dado por maria e quanto maria recebera de troco
package com.mycompany.caixa;
import java.util.Scanner;//Importar scanner
public class Caixa{ // Criar classe
    public static void main(String[] args){ // Criar void
        Scanner s = new Scanner(System.in);//Criar o scanner
        int p1, p2, p3, sp, v, t; //Declaracao de variaveis p1 = produto 1, p2 = produto 2, p3 = produto 3,  sp = soma de produtos, v= valor dado, t= troco
        System.out.println("Digite o valor do produto 1"); // //Instrução para o usuario digitar o valor do produto 1
        p1 = s.nextInt();// Captura o preço 1
        System.out.println("Digite o valor do produto 2"); //Instrução para o usuario digitar o valor do produto 2
        p2 = s.nextInt();// Captura o preço 2
        System.out.println("Digite o valor do produto 3"); //Instrução para o usuario digitar o valor do produto 3
        p3 = s.nextInt(); // Captura o preço 3
        sp = p1 + p2 + p3; //Soma o preço dos produtos
        System.out.println("Digite o valor pago"); //Instrução para o usuario digitar o valor pago
        v = s.nextInt(); //Captura o valor pago pelo usuario
        t = v - sp; //Calcula o troco
        System.out.println("O valor a ser pago e " + sp); //Mostra o valor a ser pago
        System.out.println("O valor a ser retornado de troco e " + t); //Mostra o troco
    }
}
//ANOTAÇOES
//Importar scanner
// Criar classeá
// Criar void
//Criar o scanner
//Criar variavel int preco produto1
// Criar variavel int preco produto 2
// Criar variavel int preco produto 3
// Criar variavel int soma dos produtos
//Criar variavel int valor dado por maria
//Criar variavel int troco
//Solicitar ao usuario digitar preço 1, 2 e 3
//Capturar os valores
//somar os valores
//solicitar ao usuario o valor dado
//capturar o valor dado
//calcular o troco
//exibir total e troco no terminal