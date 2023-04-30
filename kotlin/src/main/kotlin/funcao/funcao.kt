package funcao

fun main(){

    helloWorld()
    hello("murilo")
    val soma = sun(10,5)
    println(soma)
    val subtracao = sub(20, 10)
    println(subtracao)
    hello2()
    println( hello2())

}

fun helloWorld() {
    println("hello world")
}

fun hello(nome: String){
    println("hello, $nome")
}

fun sun(a:Int, b: Int): Int{
    return (a + b);
}

fun sub(a:Int, b: Int) = (a - b) //funcao de uma linha (nela não é preciso declarar o tipo de retorno)

fun hello2() = println("hello, world")


