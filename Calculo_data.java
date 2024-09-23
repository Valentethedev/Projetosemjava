//Entrada de dado do usuario (Data inicio e data fim)
    //Dia mes ano inicio
    //Dia mes ano fim
    //ano (verificar se e bissexto) (28 dias em fev caso nao seja, 29 caso seja)
    //Mes (numero de 1 a 12)
    //Dias (verificar se o mes tem 30 ou 31 dias)
//Processamento
    //Calcular numero de dias faltantes do mes inicial
        //Condicional para decidir qual mes inicia
            //Decidir se o mes tem 30, 31, 29 ou 28 dias
    //Ano completo 
        //Loop gerando sequencia
        // Data 1 = 2022
        //Data 2 = 2024
        //Loop teria que retornar 2023
        //Data inicio +1, data fim - 1
            //Verificar se o ano e bissexto, se bissexto, ano == 366, se nao ano == 365
        //Calculo dias faltantes mes diferenca_dias_mes = dias_faltantes_mes_inicio - dia_inicio
        //Calcular os meses faltantes para o ano inicial acabar
        //Calculo de meses decorridos no ano final
       //22/09/2024-22/09/2025
        //10/2024, 11/2024, 12/2024, 1-9/2025
        //dia_fim + total
    //Ano incompleto
        //Loop gerando sequencia de meses
            //Calculo meses faltantes
            //22/09/2024-17/11/2024
                //22/09/2024-22/09/2026
                //2025 = 365
            // mesmo ano diferença 0
                //Diferença entre mes inicial e mes final
    //Verificar quantidade de anos entre as 2 datas
        //Se for maior que 1, verificar se o ano e bissexto
            //
    //Verificar se o ano de inicio ou de fim sao bissextos
    //Verificar o numero de anos (1 ano se n bissexto tem 365 dias, se bissexto tem 366)
    //
    //Subtrair o numero de dias
    
package com.mycompany.calculo_data;
import java.util.Scanner;
public class Calculo_data {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int ano_inicio, mes_inicio, dia_inicio, ano_fim, mes_fim, dia_fim, dias_faltantes_mes_inicio = 0, diferenca_dias_mes = 0, total = 0,
                meses_faltantes_ano_inicio = 0, meses_faltantes_ano_fim = 0, jan = 1, diferenca_meses = 0; 
        System.out.println("Digite o ano da data inicial ");
        ano_inicio = data.nextInt();
        System.out.println("Digite o mes da data inicial ");
        mes_inicio = data.nextInt();
        System.out.println("Digite o dia da data inicial ");
        dia_inicio = data.nextInt();
        System.out.println("Digite o ano da data final ");
        ano_fim = data.nextInt();
        System.out.println("Digite o mes da data final");
        mes_fim = data.nextInt();
        System.out.println("Digite o dia da data inicial final");
        dia_fim = data.nextInt();
        if(ano_fim - ano_inicio >= 1){
            while(ano_fim - 1 > ano_inicio){
                ano_inicio ++;
                if(ano_inicio % 4 == 0 && ano_inicio % 100 != 0){
                    total = total + 366;
                }else{
                    total = total + 365;
                }
            }
            System.out.println(total);
            meses_faltantes_ano_inicio = 12 - mes_inicio;
            if(meses_faltantes_ano_inicio - mes_inicio >= 1){
                while(meses_faltantes_ano_inicio > mes_inicio){
                    mes_inicio ++;
                    switch(mes_inicio){
                        case 1:
                            total = total + 31;
                            break;
                        case 2:
                            if(ano_inicio % 4 == 0 && ano_inicio % 100 != 0){
                                total = total + 29;
                            }else{
                                total = total + 28;
                            }
                            break;
                        case 3:
                            total = total + 31;
                            break;
                        case 4:
                            total = total + 30;
                            break;
                        case 5:
                            total = total + 31;
                            break;
                        case 6: 
                            total = total + 30;
                            break;
                        case 7:
                            total = total + 31;
                            break;
                        case 8: 
                            total = total + 31;
                            break;
                        case 9:
                           total = total + 30;
                            break;
                        case 10:
                            total = total + 31;
                            break;
                        case 11: 
                            total = total + 30;
                            break;
                        case 12:
                            total = total + 31;
                            break;
                        default:
                            System.out.println("Mes invalido");
        }
            switch(mes_inicio){
                case 1:
                    dias_faltantes_mes_inicio = 31 - dia_inicio;
                    total = total + dias_faltantes_mes_inicio;
                    break;
                case 2:
                    if(ano_inicio % 4 == 0 && ano_inicio % 100 != 0){
                        dias_faltantes_mes_inicio = 29 - dia_inicio;
                        total =+ dias_faltantes_mes_inicio;
                    }else{
                        dias_faltantes_mes_inicio = 28 - dia_inicio;
                        total =total + dias_faltantes_mes_inicio;
                    } 
                    break;
                case 3:
                    dias_faltantes_mes_inicio = 31- dia_inicio;
                    total =total + dias_faltantes_mes_inicio;
                    break;
                case 4:
                    dias_faltantes_mes_inicio = 30- dia_inicio;
                    total =total + dias_faltantes_mes_inicio;
                    break;
                case 5:
                    dias_faltantes_mes_inicio = 31- dia_inicio;
                    total = total + dias_faltantes_mes_inicio;
                    break;
                case 6: 
                    dias_faltantes_mes_inicio = 30- dia_inicio;
                    total = total + dias_faltantes_mes_inicio;
                    break;
                case 7:
                    dias_faltantes_mes_inicio = 31- dia_inicio;
                    total = total + dias_faltantes_mes_inicio;
                    break;
                case 8: 
                    dias_faltantes_mes_inicio = 31- dia_inicio;
                    total = total + dias_faltantes_mes_inicio;
                    break;
                case 9:
                    dias_faltantes_mes_inicio = 30- dia_inicio;
                    total = total + dias_faltantes_mes_inicio;
                    break;
                case 10:
                    dias_faltantes_mes_inicio = 31- dia_inicio;
                    total = total + dias_faltantes_mes_inicio;
                    break;
                case 11: 
                    dias_faltantes_mes_inicio = 30- dia_inicio;
                    total = total + dias_faltantes_mes_inicio;
                    break;
                case 12:
                    dias_faltantes_mes_inicio = 31- dia_inicio;
                    total = total + dias_faltantes_mes_inicio;
                    break;
                default:
                    System.out.println("Mes invalido");       
                }
                    
            
            }
        while(jan < mes_fim){
                    mes_fim --;
                    switch (mes_fim){
                        case 1:
                            total = 31 + total;
                            break;
                        case 2:
                            if (ano_inicio % 4 == 0 && ano_inicio % 100 != 0) {
                                total = 29 + total;
                            } else {
                                total = 28 + total;
                            }
                            break;
                        case 3:
                            total = 31 + total;
                            break;
                        case 4:
                            total = 30 + total;
                            break;
                        case 5:
                            total = 31 + total;
                            break;
                        case 6:
                            total = 30 + total;
                            break;
                        case 7:
                            total = 31 + total;
                            break;
                        case 8:
                            total = 31 + total;
                            break;
                        case 9:
                            total = 30 + total;
                            break;
                        case 10:
                            total = 31 + total;
                            break;
                        case 11:
                            total = 30 + total;
                            break;
                        case 12:
                            total = 31 + total;
                            break;
                        default:
                            System.out.println("Mes invalido");
                }
        }
        total = total + dia_fim;
        System.out.println(total);
            }

        }else if(ano_fim == ano_inicio && mes_fim - mes_inicio > 1){
           diferenca_meses = mes_fim - mes_inicio;
           while(mes_fim > mes_inicio){
               // 06/2024-08/2024 8-6 = 2 
               mes_fim --;
               switch (mes_fim) {
                   case 1:
                       total = 31 + total;
                       break;
                   case 2:
                       if (ano_inicio % 4 == 0 && ano_inicio % 100 != 0) {
                           total = 29 + total;
                       } else {
                           total = 28 + total;
                       }
                       break;
                   case 3:
                       total = 31 + total;
                       break;
                   case 4:
                       total = 30 + total;
                       break;
                   case 5:
                       total = 31 + total;
                       break;
                   case 6:
                       total = 30 + total;
                       break;
                   case 7:
                       total = 31 + total;
                       break;
                   case 8:
                       total = 31 + total;
                       break;
                   case 9:
                       total = 30 + total;
                       break;
                   case 10:
                       total = 31 + total;
                       break;
                   case 11:
                       total = 30 + total;
                       break;
                   case 12:
                       total = 31 + total;
                       break;
                   default:
                       System.out.println("Mes invalido");
               }
               
           }
           System.out.println(total);
        }else if(ano_fim == ano_inicio && mes_fim - mes_inicio > 1){
           diferenca_meses = mes_fim - mes_inicio;
           while(mes_fim > mes_inicio){
               // 06/2024-08/2024 8-6 = 2 
               mes_fim --;
               switch (mes_fim) {
                   case 1:
                       total = 31 + total;
                       break;
                   case 2:
                       if (ano_inicio % 4 == 0 && ano_inicio % 100 != 0) {
                           total = 29 + total;
                       } else {
                           total = 28 + total;
                       }
                       break;
                   case 3:
                       total = 31 + total;
                       break;
                   case 4:
                       total = 30 + total;
                       break;
                   case 5:
                       total = 31 + total;
                       break;
                   case 6:
                       total = 30 + total;
                       break;
                   case 7:
                       total = 31 + total;
                       break;
                   case 8:
                       total = 31 + total;
                       break;
                   case 9:
                       total = 30 + total;
                       break;
                   case 10:
                       total = 31 + total;
                       break;
                   case 11:
                       total = 30 + total;
                       break;
                   case 12:
                       total = 31 + total;
                       break;
                   default:
                       System.out.println("Mes invalido");
               }
               switch (mes_inicio) {
                   case 1:
                       dias_faltantes_mes_inicio = 31 - dia_inicio;
                       total = total + dias_faltantes_mes_inicio;
                       break;
                   case 2:
                       if (ano_inicio % 4 == 0 && ano_inicio % 100 != 0) {
                           dias_faltantes_mes_inicio = 29 - dia_inicio;
                           total = +dias_faltantes_mes_inicio;
                       } else {
                           dias_faltantes_mes_inicio = 28 - dia_inicio;
                           total = total + dias_faltantes_mes_inicio;
                       }
                       break;
                   case 3:
                       dias_faltantes_mes_inicio = 31 - dia_inicio;
                       total = total + dias_faltantes_mes_inicio;
                       break;
                   case 4:
                       dias_faltantes_mes_inicio = 30 - dia_inicio;
                       total = total + dias_faltantes_mes_inicio;
                       break;
                   case 5:
                       dias_faltantes_mes_inicio = 31 - dia_inicio;
                       total = total + dias_faltantes_mes_inicio;
                       break;
                   case 6:
                       dias_faltantes_mes_inicio = 30 - dia_inicio;
                       total = total + dias_faltantes_mes_inicio;
                       break;
                   case 7:
                       dias_faltantes_mes_inicio = 31 - dia_inicio;
                       total = total + dias_faltantes_mes_inicio;
                       break;
                   case 8:
                       dias_faltantes_mes_inicio = 31 - dia_inicio;
                       total = total + dias_faltantes_mes_inicio;
                       break;
                   case 9:
                       dias_faltantes_mes_inicio = 30 - dia_inicio;
                       total = total + dias_faltantes_mes_inicio;
                       break;
                   case 10:
                       dias_faltantes_mes_inicio = 31 - dia_inicio;
                       total = total + dias_faltantes_mes_inicio;
                       break;
                   case 11:
                       dias_faltantes_mes_inicio = 30 - dia_inicio;
                       total = total + dias_faltantes_mes_inicio;
                       break;
                   case 12:
                       dias_faltantes_mes_inicio = 31 - dia_inicio;
                       total = total + dias_faltantes_mes_inicio;
                       break;
                   default:
                       System.out.println("Mes invalido");
               }
               total = total + dia_fim;
               System.out.println(total);
//
           }
                }else if(ano_fim == ano_inicio && mes_fim - mes_inicio == 1){
                    switch (mes_inicio) {
                        case 1:
                            dias_faltantes_mes_inicio = 31 - dia_inicio;
                            total = total + dias_faltantes_mes_inicio;
                            break;
                        case 2:
                            if (ano_inicio % 4 == 0 && ano_inicio % 100 != 0) {
                                dias_faltantes_mes_inicio = 29 - dia_inicio;
                                total = +dias_faltantes_mes_inicio;
                            } else {
                                dias_faltantes_mes_inicio = 28 - dia_inicio;
                                total = total + dias_faltantes_mes_inicio;
                            }
                            break;
                        case 3:
                            dias_faltantes_mes_inicio = 31 - dia_inicio;
                            total = total + dias_faltantes_mes_inicio;
                            break;
                        case 4:
                            dias_faltantes_mes_inicio = 30 - dia_inicio;
                            total = total + dias_faltantes_mes_inicio;
                            break;
                        case 5:
                            dias_faltantes_mes_inicio = 31 - dia_inicio;
                            total = total + dias_faltantes_mes_inicio;
                            break;
                        case 6:
                            dias_faltantes_mes_inicio = 30 - dia_inicio;
                            total = total + dias_faltantes_mes_inicio;
                            break;
                        case 7:
                            dias_faltantes_mes_inicio = 31 - dia_inicio;
                            total = total + dias_faltantes_mes_inicio;
                            break;
                        case 8:
                            dias_faltantes_mes_inicio = 31 - dia_inicio;
                            total = total + dias_faltantes_mes_inicio;
                            break;
                        case 9:
                            dias_faltantes_mes_inicio = 30 - dia_inicio;
                            total = total + dias_faltantes_mes_inicio;
                            break;
                        case 10:
                            dias_faltantes_mes_inicio = 31 - dia_inicio;
                            total = total + dias_faltantes_mes_inicio;
                            break;
                        case 11:
                            dias_faltantes_mes_inicio = 30 - dia_inicio;
                            total = total + dias_faltantes_mes_inicio;
                            break;
                        case 12:
                            dias_faltantes_mes_inicio = 31 - dia_inicio;
                            total = total + dias_faltantes_mes_inicio;
                            break;
                        default:
                            System.out.println("Mes invalido");
            }
                    total = total + dia_fim;
                    System.out.println(total);

                }else{
            total = dia_fim - dia_inicio;
            System.out.println(total);
        }        
        
        
    }
}
