// Matriz 12 x 4
// Linhas sao os meses
// Colunas sao semanas dos meses
//mes por extenso
//Entrada
    //Faturamento nas semanas
//Processamento
    //Soma das semanas
    //Soma do total vendido no ano
//Saida
    //Soma das semanas
    // Soma do total vendido no ano
package com.mycompany.vendas_ano;
import java.util.Scanner;
public class Vendas_ano {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int controle_de_vendas[][] = new int [12][4];
        int soma_das_semanas[] = new int[12];
        int total_vendas = 0;
        
        for(int j = 0; j < 12; j++){
            for (int i = 0; i <  4; i++) {
                System.out.println("Digite o valor vendido no mes " + (j+1) + " semana " +(i + 1));
                controle_de_vendas[j][i] = entrada.nextInt();
                
            }
        }
        for(int j = 0; j < 12; j++){
            for (int i = 0; i <  4; i++) {
                System.out.println("O valor vendido no mes " + (j + 1) + " semana " + (i + 1) + " foi " 
                        + controle_de_vendas[j][i]);
                soma_das_semanas[j] += controle_de_vendas[j][i];
                
            }
            switch(j){
                case 0:
                    System.out.println("O valor total vendido em janeiro e " + soma_das_semanas[j]);
                    break;
                case 1:
                    System.out.println("O valor total vendido em fevereiro e " + soma_das_semanas[j]);
                    break;
                case 2:
                    System.out.println("O valor total vendido em marco e " + soma_das_semanas[j]);
                    break;
                case 3:
                    System.out.println("O valor total vendido em abril e " + soma_das_semanas[j]);
                    break;
                case 4:
                    System.out.println("O valor total vendido em maio e " + soma_das_semanas[j]);
                    break;
                case 5:
                    System.out.println("O valor total vendido em junho e " + soma_das_semanas[j]);
                    break;
                case 6:
                    System.out.println("O valor total vendido em julho e " + soma_das_semanas[j]);
                    break;
                case 7:
                    System.out.println("O valor total vendido em agosto e " + soma_das_semanas[j]);
                    break;
                case 8:
                    System.out.println("O valor total vendido em setembro e " + soma_das_semanas[j]);
                    break;
                case 9:
                    System.out.println("O valor total vendido em outubro e " + soma_das_semanas[j]);
                    break;
                case 10:
                    System.out.println("O valor total vendido em novembro e " + soma_das_semanas[j]);
                    break;
                case 11:
                    System.out.println("O valor total vendido em dezembro e " + soma_das_semanas[j]);
                    break;
            }
            total_vendas += soma_das_semanas[j];
            
        }
        System.out.println("O total de vendas foi " + total_vendas);
    }
}
