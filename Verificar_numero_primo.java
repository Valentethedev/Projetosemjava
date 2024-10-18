//vetor de 9 posicoes
// entrada de usuario
//primo ou nao primo mais posicao
// divisivel apenas por 1 e por ele mesmo
//o numero n e primo e esta na posiçao i
package com.mycompany.verificar_numero_primo;
import java.util.Scanner;
public class Verificar_numero_primo {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int vetor[] = new int [9];
       for(int i = 0; i<= vetor.length - 1; i++){
           System.out.println("Digite o numero " + (i + 1) + " do vetor");
           vetor[i] = entrada.nextInt();
       }
       for(int i = 0; i <= vetor.length - 1; i++){
           if(vetor[i] == 2 || vetor[i] == 3 || vetor[i] == 5 || vetor[i] == 7){
               System.out.println("O numero " + (i + 1) + " do vetor e " + vetor[i]+ " e primo");
           }else if(vetor[i] % 2 != 0 && vetor[i] % 3 != 0 && vetor[i] % 5 != 0 && vetor[i] % 7 != 0){
               System.out.println("O numero " + (i + 1) + " do vetor e " + vetor[i]+ " e primo");
           }
       }
    }
}
