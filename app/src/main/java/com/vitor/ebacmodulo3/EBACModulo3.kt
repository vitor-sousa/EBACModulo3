package com.vitor.ebacmodulo3

class EBACModulo3 {
}

fun main() {

/*
    Crie uma variável mutável do tipo inteiro
    Inicialize com o valor inicial de 6.
    Altere o valor dela para 5.
    Imprima o valor
*/
    var inteiro1: Int = 6
    inteiro1 = 5
    println(inteiro1)




/*
    Crie uma variável imutável do tipo inteiro
    Inicialize com valor de 6
    Altere o valor para 7
    Imprima o valor
    O que aconteceu?
 */
    val inteiro2: Int = 6
    //inteiro2 = 7
    println(inteiro2)





/*
    Crie um condicional que testa se uma variável
    é par, se for ela de imprimir na tela "O número é
    par" senão deve imprimir "O número é impar"
    Teste primeiro utilizando a variável par e verifique o resultado
    Faço o mesmo teste agora usando a variável impar
*/
    val numero = 2
    println(if(numero % 2 == 0) "O número é par" else "O número é impar")

    val numero2 = 3
    println(if(numero2 % 2 == 0) "O número é par" else "O número é impar")





/*
    Refaça o exemplo anterior utilizando o
    comando when para testar o valor da variável
*/
    val valor = 47
    when {
        valor % 2 == 0 -> println("O número é par")
        else -> println("O número é impar")
    }





/*
    Crie um array de inteiro de tamanho 40
    Escreve um código que escreva os número de 1 a 39
    neste array utilizando o comando for
 */
    val arrayInteiros: IntArray = IntArray (40)
    for (i in arrayInteiros.indices){
        arrayInteiros[i] = i + 1
    }





/*
    Crie uma lista de inteiros.
    Escreva na lista os números de 1 a 99 utilizando o comando for
 */
    val listaInteiros: MutableList<Int> = mutableListOf()
    for (j in 1..99){
        listaInteiros.add(j)
    }




/*
    Utilizando a lista anterior, faça:
    Crie uma variável do tipo inteiro de nome soma e inicialize ela com o valor 0
    Crie um código que percorre a lista que criamos anteriormente e
    que a cada interação, acrescente o valor da posição atual a variável soma
 */
    var soma: Int = 0
    for (valor in listaInteiros) {
        soma += valor
    }

}