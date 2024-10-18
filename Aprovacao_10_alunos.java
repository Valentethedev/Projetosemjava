// Entrada
    //Gabarito da prova
    // numeros dos alunos = 10
    // respostas
//processamento
    //8 questoes
    // questao = 1 ponto
        //se acertar, + 1 ponto
            //Contador questao
        //Se errar, + 0 pontos
    //Media = 6
    //Contador de aprovados
//Saida
    //Numero e nota de cada aluno
    //Porcentagem de aprovaçao
    
package com.mycompany.aprovacao_10_alunos;
import java.util.Scanner;
public class Aprovacao_10_alunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] gabarito = new String[8];
        int[] alunos = new int[10];
        String[] respostas = new String [8];
        int acertos, aprovados, b;
        acertos = 0;
        aprovados = 0;
        for(b = 0; b < gabarito.length; b++){
            System.out.println("Digite a resposta correta da questao " + (b + 1));
            gabarito[b] = entrada.next();
            
        }
        for(int j = 0; j < alunos.length; j++){
            acertos = 0;
            for(int i = 0; i < respostas.length; i++){
                System.out.println("Digite a resposta " + (i + 1) + " do aluno " + (j + 1));
                respostas[i] = entrada.next();
                if(respostas[i].equals(gabarito[i])){
                    acertos ++;
                    }
                 }
            if(acertos >= 6) {
                System.out.println("O aluno " + (j + 1) + " tirou nota " + acertos + " e esta aprovado");
                aprovados ++;
                }else{
                    System.out.println("O aluno " + (j + 1) + " tirou nota " + acertos + " e esta reprovado");
                    } 
               
        }
        System.out.println("Foram aprovados " + aprovados + " alunos");
        }
                }
            
              
        
   


