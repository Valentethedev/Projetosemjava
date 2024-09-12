// O programa recebe 2 numeros e mostra a soma, dizendo se e par ou imopar e mostra a diferenca, dizendo se e positiva ou negativa
package com.mycompany.somadiferenca;
import java.util.Scanner;//Importar scanner
public class Somadiferenca {//criar classe
    public static void main(String[] args) {//criar void
        Scanner numero1_2_in = new Scanner(System.in);//Criar scanner
        int soma = 0, subtracao = 0, numero1, numero2; // Declarar variaveis int numeros array soma e subtracao
        System.out.println("Digite o numero 1"); // Instruçao para o usuario digitar o numero 1
        numero1 = numero1_2_in.nextInt(); // Captura o numero 1 com scanner
        System.out.println("Digite o numero 2"); // Instruçao para o usuario digitar o numero 2
        numero2 = numero1_2_in.nextInt(); // Captura o numero 2 com scanner
        soma = numero1 + numero2; //Programa soma os 2 numeros
        subtracao = numero1 - numero2; //Programa subtrai os 2 numeros
        if(soma % 2 == 0){ //Se o resto da divisao da soma/2 for 0
        System.out.println("A soma " + soma + " e par"); //Imprime no terminal a soma e que o numero é par
        } else{//Se não
        System.out.println("A soma " + soma + " e impar");//Imprime no terminal a soma e que o numero é impar
        }
        if(subtracao > 0){//Se a diferença for maior que  0
        System.out.println("A diferença " + subtracao + 
                " e positiva"); //Imprime no terminal a diferença e que o numero é positivo
        }else if(subtracao < 0){//Se 0 for maior que a diferença
        System.out.println("A diferença " + subtracao + 
                " e negativa"); //Imprime no terminal a diferença e que o numero é negativo
        }else{// Se não
            System.out.println("A diferença e " + subtracao); //Imprime no terminal a diferença
        }
    }
}
//Anotacoes
//Importar scanner
// Criar classe
// Criar void
//Criar scanner
// Declarar variaveis int numero1, numero2 soma e subtracao
// Criar loop for com range 2 para o usuario digitar numero 1 e numero 2
// Criar instruçao para o usuario digitar numero 1
// Capturar numero 1
// Criar instruçao para o usuario digitar numero 2
// Capturar numero 2
//Encerrar loop
// Somar os 2 numeros
//Condicional para verificar se e par ou impar verificando divisibilidade por 2
    //Se soma % 2 == 0
        // Imprimir a soma soma e par
    //Se soma % 2 =! 0    
        // Imprir a soma soma  e impar caso seja impar
//Condicional para verificar se a diferenca e positiva, negativa e se os numeros sao iguais
    //se subtracao e > 0
        // A diferenca e positiva
    // Se subtracao e < 0 
        //A diferenca e negativa
    // Se a subtracao e = 0
        // Numeros iguais
