fun max(first: Int, second: Int) = if (first > second) first else second

fun max(first: Int,second: Int,third: Int): Int {
    return if (first > second)
        if (first > third) first else third else
        if (second > third) second else third
}

fun main() {
    val rsl = max(1, 2)
    println("max from 1 and 2 is $rsl")
}
