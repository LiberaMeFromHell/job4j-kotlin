fun drawX(size: Int) {
    for (ordinate in 0 .. size) {
        if (size < 0) throw Throwable()
        for (abscissa in 0 .. size) {
            if (abscissa == ordinate)
                print("X")
            else if (abscissa == (size - ordinate))
                print("X")
            else (print(" "))

        }
        println()
    }

}

fun main(args: Array<String>) {
    drawX(8)
}