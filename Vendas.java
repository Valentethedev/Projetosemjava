package com.mycompany.vendas;
import java.util.Scanner;
public class Vendas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor_objetos[] = new double [10];
        double quantidade_vendida[] = new double[10];
        double preco_total[] = new double[10];
        double faturamento = 0;
        double comissao = 0.05;
        double salario = 0;
        double maior_quantidade_vendida = 0;
        double posicao_maior_quantidade_vendida = 0;
        
        for(int i = 0; i < valor_objetos.length; i++){
           System.out.println("Digite o valor do produto " + (i + 1));
           valor_objetos[i] = entrada.nextDouble();
           System.out.println("Digite a quantidade vendida do produto " + (i + 1));
           quantidade_vendida[i] = entrada.nextDouble();
        }
        for(int i = 0; i < valor_objetos.length; i++){
            preco_total[i] = quantidade_vendida[i] * valor_objetos[i];
            faturamento =+ preco_total[i];
            System.out.println("O produto " + (i + 1) + " teve a quantidade vendida " + quantidade_vendida[i] + 
                    " e faturou o valor de " + preco_total[i]);
            if(maior_quantidade_vendida < quantidade_vendida[i]){
                maior_quantidade_vendida = quantidade_vendida[i];
                posicao_maior_quantidade_vendida = i + 1;
            }
        }
        salario = faturamento * comissao;
        System.out.println("O faturamento total e " + faturamento);
        System.out.println("O produto mais vendido e o produto " + posicao_maior_quantidade_vendida + 
                " com " + maior_quantidade_vendida + " unidades");
    }
}
