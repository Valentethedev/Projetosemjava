programa {
  funcao inicio() {   
    real temperaturas[48], soma = 0, maior, menor, acima_de_19 = 0, abaixo_de_16 = 0
    para(inteiro i = 0; i < 48; i++){
      escreva("Digite a temperatura na hora ", i + 1, "\n")
      leia(temperaturas[i])
      se(i == 0){
        maior = temperaturas[i]
        menor = temperaturas[i]
      }
      se(temperaturas[i] > maior){
        maior = temperaturas[i]
      }
      se(temperaturas[i] < menor){
        menor = temperaturas[i]
      }
      soma = soma + temperaturas[i]
      se(temperaturas[i] > 19){
        acima_de_19 = acima_de_19 + 1
      }
      se(temperaturas[i]< 16){
        abaixo_de_16 = abaixo_de_16 + 1
      }
    }
    escreva("A temperatura media do periodo e ", soma/48, "\n")
    escreva("A maior temperatura registrada no periodo e ", maior, "\n")
    escreva("A menor temperatura registrada no periodo e ", menor, "\n")
    escreva("A temperatura ficou acima de 19 em ", acima_de_19, " horas do periodo observado \n")
    escreva("A temperatura ficou abaixo de 16 em ", abaixo_de_16, " horas do periodo observado \n")
  }
}
