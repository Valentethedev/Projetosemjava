//Sequencia de 1-1000 Loop for
    //Condicional para verificar se e multiplo de tal numero
    //Multiplos de 2 = x/2 % 0
        // Print iteravel e multiplo de 2
    // Multiplos de 3 x/3 % 0
        // Print iteravel e multiplo de 3
    // Multiplos de 5 
        // Print iteravel e multiplo de 5
package com.mycompany.multiplos;
public class Multiplos {
    public static void main(String[] args){
        int multiplos2 = 0, multiplos3 = 0, multiplos5 = 0;
        for(int i = 1; i <= 1000; i++){
            if(i % 2 == 0){
                multiplos2++;
            }else if(i % 3 == 0){
                multiplos3++;
                
            }else{
                multiplos5++;
            }
    }
        System.out.println("Entre 1 e 1000 ha " + multiplos2 + " multiplos de 2");
        System.out.println("Entre 1 e 1000 ha " + multiplos3 + " multiplos de 3");
        System.out.println("Entre 1 e 1000 ha " + multiplos5 + " multiplos de 5");
    }
}
