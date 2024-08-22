//O programa abaixo recebe uma temperatura em celsius e transforma em fahrenheit
package com.mycompany.celsius.fahrenheit;
import java.util.Scanner; //importação do scanner java
public class CelsiusFahrenheit{ //Criaçao de classe
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float c, f; // Declaração de variáveis c = celsius f = fahrenheit
        System.out.println("Digite uma temperatura em graus celsius"); //Instrução para o usuario digitar a temperatura em celsius
        c = s.nextFloat(); //Capturar entrada da temperatura em celsius
        f = (float)1.8 * c + 32; //Conversao para celsius
        System.out.println("A temperatura em fahrenheit e " + f); //Impressao da temperatura em fahrenheit no terminal
    }
}
// ANOTAÇOES
//Importar scanner
//criar classe
//criar o static void
//Inicializar scanner
//Criar variável float c
//Criar variável float f
//Comando para o usuário digitar temperatura em celsius 
//Capturar temperatura em celsius
//fahrenheit recebe 1.8 + C + 32
//Imprimir temperatura em fahrenheit
