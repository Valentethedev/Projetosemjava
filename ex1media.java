/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author arturvalente
 */
public class ex1media {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        float n1, n2, n3, media;
        System.out.println("Digite a nota 1");
        n1 = n.nextFloat();
        System.out.println("Digite a nota 2");
        n2 = n.nextFloat();
        System.out.println("Digite a nota 3");
        n3 = n.nextFloat();
        media = (n1 + n2 + n3)/3;
        System.out.println("A media e "+ media);
    }
    
}