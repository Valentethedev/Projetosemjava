// Valor inteiro X
// usuario informa 5 
// Decremento e 4
// Decremento e 3
// Decremento e 2
// Decremento e 1
// 5 * 4 = 20 20 * 3 = 60 *2 = 120 120 * 1 = 120
// 4 * 3 * 2
// Estrutura 20 * 
// while decremento != 
// fatorial de x = x * (x-1) * (x-2) * (x-3)
// Variavel de decrementaçao recebendo x-1
//Resultado fora do loop
// Se o decremento > 0, decremento * fatorial
//
package com.mycompany.fatorial;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero_usuario, resultado;
        resultado = 1;
        System.out.println("Digite um numero");
        numero_usuario = entrada.nextInt();
        if(numero_usuario > 0){
            for(int i = 1;i <= numero_usuario; i++){
            resultado *= i; 
        } System.out.println(resultado);
        }else{
            System.out.println("Numero invalido");
        }
        
    } 
}
