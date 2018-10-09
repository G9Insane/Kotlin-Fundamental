fun main(args: Array<String>) {
    val name = "G9Insane" //
    display(name) //call function display with param

    val personObj = Person()
    personObj.display(name)
    personObj.name = name

    println("Call Variable Inside Class ${personObj.name}")
}

fun display(name: String) { //basic function
    println(name)
}

class Person { //basic class with function
    var name:String = ""
    fun display(name: String){
        println(name)
    }
}