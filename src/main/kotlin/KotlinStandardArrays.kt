fun main(args: Array<String>) {

    val numbers = intArrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    val biggest = numbers.maxOrNull()
    println("Maior Valor: $biggest")

    val lowest = numbers.minOrNull()
    println("Menor Valor: $lowest")

    val average = numbers.average()
    println("Media: $average")

    val allBiggerThanNine = numbers.all { it > 9 }
    println("Todos valores maiores que 9: $allBiggerThanNine")

    val anyBiggerThanNine = numbers.any { it > 60 }
    println("Algum valor maior que 60: $anyBiggerThanNine")

    val numbersBiggerThan30 = numbers.filter { it > 30 }
    println("Valores maiores que 30: $numbersBiggerThan30")

    val firstBiggerThan30 = numbers.find { it > 30 }
    println("Primeiro valor maior que 30: $firstBiggerThan30")

}
