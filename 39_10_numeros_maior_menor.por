programa {
  funcao inicio() {
    inteiro numeros[10], maior, menor
    para(inteiro i = 0; i < 10; i++){
      escreva("Digite o numero ", i + 1, "\n")
      leia(numeros[i])
      se(i == 0){
        maior = numeros[i]
        menor = numeros[i]
      }
      se(numeros[i] > maior){
        maior = numeros[i]
      }
      se(numeros[i] < menor){
        menor = numeros[i]
      }
    }
    escreva("O maior numero e ", maior, "\n")
    escreva("O menor numero e ", menor, "\n")
  }
}
