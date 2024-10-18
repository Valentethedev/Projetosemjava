//Entrada
    //Habitante
        //Sexo
            //M
            //F
        //Cor dos olhos
            //Azul
            //Verde
            //Preto
        //Cor dos cabelos
            //Loiro
            //Castanho
            //Preto
        //Idade
//Processamento
    //Maior idade
        //Maior idade = 0
        //Se idade > maior_idade, maior idade = idade
     //Menor idade
        //Se a idade < menor_idade
        //menor_idade = idade
    //Sexo feminino 18-35 anos olho verde, cabelo loiro
//Saida
    //Maior idade
    //Menor idade
    //Sexo feminino 18-35 anos olho verde, cabelo loiro
package com.mycompany.pesquisa;
import java.util.Scanner;
public class Pesquisa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade = 0, maior_idade = Integer.MIN_VALUE, menor_idade = Integer.MAX_VALUE, idade_olho_cabelo = 0;
        int sexo, cor_dos_olhos, cor_dos_cabelos;
        
        while(idade >= 0){
            System.out.println("Digite o sexo do habitante \n 1- masculino \n 2- feminino");
            sexo = entrada.nextInt();
            System.out.println("Digite a cor do olho do habitante \n 1- azul \n 2- verde \n 3- castanho");
            cor_dos_olhos = entrada.nextInt();
            System.out.println("Digite a cor do cabelo do habitante \n 1- loiro \n 2- castanho \n 3- preto ");
            cor_dos_cabelos = entrada.nextInt();
            System.out.println("Digite a idade do habitante");
            idade = entrada.nextInt();
            if(idade >= 0){
                if(idade > maior_idade){
                    maior_idade = idade;
                }else if(idade < menor_idade){
                    menor_idade = idade;
                }
            }
            if(sexo == 2 && (idade >= 18 && idade <= 35) && cor_dos_olhos == 2 && cor_dos_cabelos == 1){
                idade_olho_cabelo ++;
        }
            
        }
        System.out.println("A maior idade e " + maior_idade);
        System.out.println("A menor idade e " + menor_idade);
        System.out.println("A quantidade de pessoas que atendem aos requisitos "
                + "\n idade, cor do olho e cor do cabelo e " + idade_olho_cabelo);
    }
}
