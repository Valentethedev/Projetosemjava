//O usuario digita as notas do crush ou da crush de 0 a 10 nos quesitos Altura, beleza e carisma. 
//Se a pessoa tiver mais de 7 em todos os quesitos, o programa imprime bora
//Se a pessoa tiver mais de 7 em ao menos 2 quesitos, o programa imprime so vai
//Se a pessoa tiver mais de 7 em 1 so quesito o programa imprime Fé em deus
//Se a pessoa tiver mais de 7 em 0 quesitos o programa imprime misericória
package com.mycompany.tinder;
import java.util.Scanner; //Importar scanner
public class Tinder {// Criar classe
    public static void main(String[] args) {// Criar void
        Scanner entrada_de_notas = new Scanner(System.in);//Criar scanner
        int nota_altura, nota_beleza, nota_carisma;//Declarar variaveis para as notas
        System.out.println("Digite a nota da altura do crush");//Instrução para o usuario digitar nota de altura
        nota_altura = entrada_de_notas.nextInt();//Programa captura nota de altura
        System.out.println("Digite a nota da beleza do crush");//Instrução para o usuario digitar nota de beleza
        nota_beleza = entrada_de_notas.nextInt();//Programa captura nota de beleza
        System.out.println("Digite a nota de carisma do crush");//Instrução para o usuario digitar nota de carisma
        nota_carisma = entrada_de_notas.nextInt();//Programa captura nota de carisma
        if(nota_beleza > 7 && nota_carisma > 7 && nota_altura > 7){ //Se as 3 notas forem maiores que 7
            System.out.println("Bora");//Sistema imprime bora
        }else if(nota_beleza > 7 && (nota_carisma > 7 || nota_altura > 7)||
                (nota_carisma > 7 && (nota_beleza > 7 || nota_altura > 7)||
                (nota_altura > 7 && (nota_beleza > 7 ||  nota_carisma> 7)))){//Se ao menos 2 notas forem maiores que 7
            System.out.println("So vai");//Sistema imprime so vai
        }else if(nota_beleza > 7 || nota_carisma > 7 || nota_altura> 7){//Se ao menos 1 nota for igual a 7
            System.out.println("Fe em Deus");//Sistema iŕmprime fe em deus
        }else{//se nao
            System.out.println("Misericordia");//Sistema imprime misericordia
        }   
    }
}
//Anotacoes
//Importar scanner
// Criar classe
// Criar void
//Criar scanner
// Declarar variavel int altura
// Declarar variavel int beleza
// Declarar variavel int carisma
//Instrução para o usuario digitar nota de altura
//Programa captura nota de altura
//Instrução para o usuario digitar nota de beleza
//Programa captura nota de beleza
//Instrução para o usuario digitar nota de carisma
//Programa captura nota de carisma
//Condicional para verificar nota da pessoa
    //Se a nota de beleza && nota de carisma && nota de altura forem > 7
        //Imprimir bora
    //Se a nota de beleza && (nota de carisma || nota de altura)> 7 || nota de carisma && (nota de beleza || nota de altura)> 7|| nota de altura && (nota de beleza || nota de carisma)> 7
        //Imprimir so vai
    //Se a nota de beleza || nota de carisma || nota de altura > 7 
        //Imprimir fé em deus
    //Se nao, imprimir misericórdia