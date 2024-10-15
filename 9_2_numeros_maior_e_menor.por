programa {
  funcao inicio() {
    inteiro numeros[2]
    para(inteiro i = 0; i < 2; i++){
      escreva("Digite o numero ", i + 1, "\n")
      leia(numeros[i])
    }
    se(numeros[0] > numeros[1]){
      escreva("O numero ", numeros[0], " e maior e o numero ", numeros[1], " e o menor")
    }senao{
      escreva("O numero ", numeros[1], " e maior e o numero ", numeros[0], " e o menor")
    }
  }
}
