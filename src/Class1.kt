import java.util.Scanner

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    println("Írd be, hogy 1, ha szöveget akarsz megfordítani, vagy írd be, hogy 2," +
            " ha a prímszámok érdekelnek.")
    var functionNumber: Int = scanner.nextInt()

    when (functionNumber) {
        1 -> {
            runReverseText(scanner)
        }
        2 -> {
            runPrimeNumberPrinter(scanner)
        }
        else -> {

        }
    }
}

fun runPrimeNumberPrinter(scanner: Scanner) {
    println("Adjá már meg egy egész számot te hurkafej")
    var primeLimit = scanner.nextInt()
    for (i in 2..primeLimit) {
        if (isPrime(i)) {
            println(i)
        }
    }
}

fun isPrime(number: Int): Boolean {
    var square = Math.sqrt(number.toDouble()).toInt()
    for (i in 2..square) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}


fun runReverseText(scanner: Scanner) {
    while (true) {
        var text = scanner.nextLine()
        var reversedText = text.reversed()
        println(reversedText)
        if (text.equals("exit")) {
            return
        }
    }
}
