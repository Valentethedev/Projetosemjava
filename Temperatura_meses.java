// maior temperatura 
// menor temperatura
// Temperatura informada pelo usuario
package com.mycompany.temperatura_meses;
import java.util.Scanner;
public class Temperatura_meses {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int temperatura[] = new int[12];
        int maior_temperatura = 0, menor_temperatura = Integer.MAX_VALUE;
        String mes_maior_temperatura = "", mes_menor_temperatura = "";
        for(int i = 0; i < temperatura.length; i++){
            System.out.println("Digite a temperatura do mes " + (i + 1));
            temperatura[i] = entrada.nextInt();
            if(temperatura[i] > maior_temperatura){
                maior_temperatura = temperatura[i];
            }
            if(temperatura[i] < menor_temperatura){
                menor_temperatura = temperatura[i];
                }
              
        }
        
        System.out.println("A maior temperatura foi " + maior_temperatura);
        System.out.println("A menor temperatura foi " + menor_temperatura);
    }
}
