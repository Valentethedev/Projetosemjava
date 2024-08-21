/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.saldo;
import java.util.Scanner;
/**
 *
 * @author arturvalente
 */
public class Saldo {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float sb, c1, c2, c3, c4, sl, saldo, ttlc, aliquota;
        aliquota = (float) 0.14;
        System.out.println("Digite o salario bruto");
        sb = s.nextFloat();
        System.out.println("Digite o valor da conta 1");
        c1 = s.nextFloat();
        System.out.println("Digite o valor da conta 2");
        c2 = s.nextFloat();
        System.out.println("Digite o valor da conta 3");
        c3 = s.nextFloat();
        System.out.println("Digite o valor da conta 4");
        c4 = s.nextFloat();
        ttlc = c1 + c2 + c3 + c4;
        sl = sb - (sb * aliquota);
        saldo = sl - ttlc;
        System.out.println("O salario bruto e " + sb);
        System.out.println("O salario liquido e " + sl);
        System.out.println("O total das contas e " + ttlc);
        System.out.println("O saldo e " + saldo);
        
        
    }
}
