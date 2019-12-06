fun max(first: Int, second: Int) = if (first > second) first else second

fun max(first: Int,second: Int,third: Int): Int {
    return max(max(first, second),max(second,third))
}

fun main() {
    val rsl = max(-1, 2, 6)
    println("max from -1 and 2 and 6 is $rsl")
}
