/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metropepolegada;
import java.util.Scanner;
/**
 *
 * @author arturvalente
 */
public class Metropepolegada {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float alturametros, pes, polegadas, resultadopes, resultadopolegadas;
        pes = (float) 3.048;
        polegadas = (float) 0.254;
        System.out.println("Digite a altura em metros");
        alturametros = s.nextFloat();
        resultadopes = pes * alturametros;
        resultadopolegadas = polegadas * alturametros;
        System.out.println("A altura em pes e " + resultadopes);
        System.out.println("A altura em polegadas e " + resultadopolegadas);
    }
}
