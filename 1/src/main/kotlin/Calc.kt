
fun add(first : Int, second : Int) : Int {
    return first + second
}

fun subtract(first : Int, second : Int) : Int {
    return first - second
}

fun multiply(first: Int, second: Int) : Int {
    return first * second
}

fun divide(dividend: Int, divider: Int): Int {
    return dividend/divider
}

fun main(args: Array<String>) {
    val plus = add(1, 1)
    println("1 + 1 = $plus")

    val minus = subtract(1, 1)
    println("1 - 1 = $minus")

    val multiply = multiply(5,2)
    println("5 * 2 = $multiply")

    val divide = divide(12,3)
    println("12 / 3 = $divide")
}