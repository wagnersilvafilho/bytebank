fun main() {
    println("Bem-vindo ao bytebank!")
    var i = 0
    while (i < 5){
    //for (i in 5 downTo 1) {
        //if (i == 4){
        //   continue
        //}
        val titular: String = "Wagner $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0
        //saldo = 100 + 2.0
        //saldo += 200
        //saldo = -1000.0
        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println()
        i++
        }
    //testaCondicoes(saldo);
}

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}