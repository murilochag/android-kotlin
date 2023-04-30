package funcao

fun main() {

    println( transformarAno(2))
    println(contarString("murilo"))
    println(calcCubo(4))
    println(mlhToKm(5))
    println(trocarLetras("Murilo das Chagas de Carvalho"))

}
// escreva uma função que seja capaz de receber a quantidade de anos para e transforar em meses dias horas minutos e segundos
fun transformarAno(anos: Int): String{
    val mes = anos * 12
    val dias = anos * 365
    val horas = anos * 8766
    val munutos = anos * 525960
    val segundos = anos * 31536000
    val resposta : String = "${anos} tem:\n" +
            "${mes} meses, \n" +
            "${dias} dias\n" +
            "${horas} horas \n" +
            "${munutos} minutos \n" +
            "${segundos} segundos"
    return resposta
}

// escreva uma funçao que receba uma string e seja capaz de devolver seu numero de caracteres
fun contarString(st: String): Int {
    return st.length
}

// escreva uma funcao capaz de calcular o cubo do numero inteiro
fun calcCubo(num: Int): Int{
    return (num*num)*num

}

// escreva uma funcao capaz de receber milhas e transformar em quilometros
fun mlhToKm(mlh: Int): Double {
    return mlh * 1.6
}

// escreva um progtama que seja capaz de receber uma string e fazer a troca de todas as letras "a" ou "A" por X
fun trocarLetras(text: String): String {
    return text.lowercase().replace("a","x")
}


// transformaes as funcoes 2,3 e 4 em funcoes de apenas uma linha
//2
fun contarStringOl(st: String) = st.length
//3
fun calcCuboOl(num: Int) = ((num*num)*num)
//4
fun mlhToKmOl(mlh: Int) = mlh * 1.6

