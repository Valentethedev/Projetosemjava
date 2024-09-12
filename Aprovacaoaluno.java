// O programa recebe a frequência e a nota de um aluno e diz se ele foi aprovado, reprovado ou em recuperaçao
// Para o aluno ser aprovado, sua nota minima deve ser 7 e sua frequencia deve ser 75% (0.75)
// Se a nota do aluno for maior ou igual a 4 e menor que 7 e a frequencia minima for 75%(0.75), o aluno está em recuperacao
// Se a nota do aluno for menor que 4 ou a frequencia for menor que 75%(0.75) o aluno está
package com.mycompany.aprovacaoaluno; 
import java.util.Scanner; //Importar scanner
public class Aprovacaoaluno { //criar classe
    public static void main(String[] args) { //criar void
        Scanner entrada_nota_frequencia = new Scanner(System.in); //Criar scanner
        float nota, frequencia; //declaraçao de variaveis nota e frequencia como float
        System.out.println("Digite a nota do aluno"); //Instruçaco para o usuario digitar nota do aluno
        nota = entrada_nota_frequencia.nextFloat(); // Programa captura nota do aluno
        System.out.println("Digite a frequencia do aluno em decimal"); //Instruçaco para o usuario digitar frequencia do aluno
        frequencia = entrada_nota_frequencia.nextFloat(); //Programa captura frequencia do aluno
        if(nota >= 7 && frequencia >= 0.75){// Se nota do aluno >= 7 e frequencia >= 0.75
            System.out.println("Aluno aprovado com nota " + nota + 
                    " e frequencia " + frequencia); //Instruçao executada caso condiçao seja atendida
        }// O programa imprimira "Aluno aprovado com nota x e frequencia y" no terminal
        else if(nota >= 4 && nota < 7 && frequencia >= 0.75){//Se nota do aluno >= 4 e menor que 7 e frequencia >= 0.75
            System.out.println("Aluno em recuperacao com nota " + nota + 
                    " e frequencia " + frequencia);//Instruçao executada caso condiçao seja atendida
        }// O programa imprimira "Aluno em recuperaçao com nota x e frequencia y" no terminal
        else if(nota < 4 || frequencia < 0.75){//Se nota do aluno < 4 ou frequencia < 0.75
            System.out.println("Aluno reprovado com nota " + nota + 
                    " e frequencia " + frequencia);//Instruçao executada caso condiçao seja atendida
        }// O programa imprimira "Aluno reprovado com nota x e frequencia y" no terminal
   }
}
//Anotacoes
//Importar scanner
// Criar classe
// Criar void
//Criar o scanner entrada_nota_frequencia = new Scanner(System.in)
// Criar variavel float para receber nota
// Criar variavel float para receber frequencia
// Criar instruçao para o usuario digitar nota
// Capturar valor digitado pelo usuario
// Criar instruçao para o usuario digitar frequencia
//Capturar valor digitado pelo usuario
//Criar condicional
//Se a variavel nota >= 7 && frequencia > 0.75, exibir aprovado no terminal
// Se a variavel nota >= 4 && nota < 7 && frequencia > 0.75, exibir em recuperaçao no terminal
// Se a variavel nota for < 4 || frequencia <0.75, exibir reprovado