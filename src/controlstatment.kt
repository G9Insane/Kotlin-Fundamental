//example if and when expression

fun main(args: Array<String>) {
    val a = 1
    val b = 5

    var maxValue: Int = if (a > b) {
        print("a greater")
        a
    } else {
        print("n greater")
        b
    }
    print(maxValue)
}