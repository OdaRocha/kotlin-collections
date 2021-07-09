import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {

    val salaries = Array<BigDecimal>(5) { BigDecimal.ZERO }

    salaries[0] = "100".toBigDecimal()
    salaries[1] = "1300.01".toBigDecimal()
    salaries[2] = "222123.23".toBigDecimal()

    println("Salarios: ${salaries.contentToString()}")
// ---------------------------------------------------------------------------------------------------------------------
    val newSalaries = bigDecimalArrayOf("12.1", "1", "8432.32", "983.99", "23.32")

    println("Novos salarios: ${newSalaries.contentToString()}")

    val raise = "1.1".toBigDecimal()

    val increasedWages = newSalaries.map { wage ->
        val value = if (wage > "1000".toBigDecimal()) {
            wage + "500".toBigDecimal()
        } else {
            wage * raise
        }
        value.setScale(2, RoundingMode.UP)
    }.toTypedArray()

    println("Salarios com aumento: ${increasedWages.contentToString()}")
// ---------------------------------------------------------------------------------------------------------------------
    val newSalaries2 = bigDecimalArrayOf("12.10", "100", "8432.32", "983.99", "23.32")
    val sum = newSalaries2.sum()
    println("Somatoria: $sum")

}

private fun Array<BigDecimal>.sum(): BigDecimal {
    return this.reduce { accumulator, value ->
        accumulator.add(value).setScale(2, RoundingMode.UP)
    }
}

fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    return Array(values.size) {
        values[it].toBigDecimal().setScale(2, RoundingMode.UP)
    }
}

