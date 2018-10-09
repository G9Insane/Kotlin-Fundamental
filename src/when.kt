//example when control statement
fun main(args: Array<String>) {
    // When as expression

    val x = 100
    var str: String = when (x) {
        1 -> "x is 1"
        2 -> "x is 2"
        else -> {
            "x value unknown"
        }
    }
    println(str)
}