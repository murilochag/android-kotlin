package funcao

fun main() {

    val str = "programação Kotlin."

    println("tamanho string: ${str.length}")

    println("posição(index) 0 da string: ${str[0]}")

    println(str.startsWith("pro"))
    println(str.endsWith("abc"))

    println(str.substring(2,4))

    println(str.replace("Kotlin.", "Kolin é show!"))

    println(str.lowercase())
    println(str.uppercase())

    println("           meu nome é       ".trim())
}