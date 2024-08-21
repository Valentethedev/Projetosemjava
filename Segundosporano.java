
package com.mycompany.segundosporano;
import java.util.Scanner;
public class Segundosporano {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int anos, segundosporano, resultado;
    segundosporano = 31536000;
    System.out.println("Digite a quantidade de anos");
    anos = s.nextInt();
    resultado = anos * segundosporano;
    System.out.print("Na quantidade de anos " + anos );
    System.out.print(" existem " + resultado);
    System.out.print(" segundos ");
    }
}
