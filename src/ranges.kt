fun main(args: Array<String>) {
    //Example Ranges
    var r1 = 1..5
    //contain number 1,2,3,4,5

    var r2 = 5 downTo 1
    //contain number 5,4,3,2,1

    val r3 = 5 downTo 1 step 2
    //contain number 5,3,1

    var r4 = 'a'..'z'
    //contain values string "a" - "z"

    var countDown = 10.downTo(1)
    // contain 10,9,8,7,....1

    var moveUp = 1.rangeTo(10)
    //contain  1,2,3,....10

}