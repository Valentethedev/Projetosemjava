//Modao faz pedir mais uma dose
// Valor aumenta a cada dose
// Dose + dose * 10%
//Entrada
    //Valor da dose
    //Valor da conta
    //Usuario deseja ouvir mais um modao?
//Processamento
    //Se o usuario desejar ouvir um modao, conta = conta + dose + dose * 10%
    //Se nao, mostrar o valor da conta
//Saida
    //Valor da conta

package com.mycompany.lista03_7;
import java.util.Scanner;
public class Lista03_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float dose, conta, taxa_de_servico;
        int opcao;
        String conta_formatada, taxa_de_servico_formatada;
        System.out.println("Digite o valor da conta");
        conta = entrada.nextFloat();
        System.out.println("Digite o valor da dose");
        dose = entrada.nextFloat();
        System.out.println("Digite a opcao \n 1 - Ouvir modao \n 2 - Nao ouvir modao");
        opcao = entrada.nextInt();
        taxa_de_servico = dose * (float)0.1;
        while(opcao == 1){
            System.out.println("Digite a opcao \n 1 - Ouvir modao \n 2 - Nao ouvir modao");
            opcao = entrada.nextInt();
            conta = conta + dose + taxa_de_servico;
            conta_formatada = String.format("%.2f", conta);
            System.out.println("O valor da conta e " + conta_formatada);
        }
        conta_formatada = String.format("%.2f", conta);
        taxa_de_servico_formatada = String.format("%.2f", taxa_de_servico);
        System.out.println("O valor da taxa e " + taxa_de_servico);
        System.out.println("O valor da conta e " + conta_formatada);
    }
}
