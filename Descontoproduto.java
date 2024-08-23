// O produto recebe o valor do produto e calcula o desconto de 15%
package com.mycompany.descontoproduto;
import java.util.Scanner; //Importar scanner
class Descontoproduto{ // Criar classe
    public static void main(String[] args){ // Criar void
        Scanner s = new Scanner(System.in); //Criar o scanner
        float pp, d, pf; //Declaracao de variaveis
        d = (float)0.15; //porcentagem do desconto
        System.out.println("Digite o valor do produto"); //Instrucao para o usuario digitar o valor do produto
        pp = s.nextFloat(); //capturar valor do produto
        pf = pp - (pp * d); //Calcular o desconto
        System.out.println("O valor do produto com desconto e " + pf); //mostrar desconto no terminal
    }
}
//ANOTACOES
////Importar scanner
// Criar classe
// Criar void
//Criar o scanner
// Criar variavel preco produto
//Criar variavel desconto
// Criar variavel preco final
//Desconto recebe 0.15
//Instrucao para o usuario digitar o valor do produto
//Capturar o valor do produto
//Calcular o desconto
// Mostrar o desconto no terminal