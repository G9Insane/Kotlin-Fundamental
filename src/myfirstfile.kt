fun main(args: Array<String>) {

    var personObj = Person()
    personObj.name = "G9INsane"
    personObj.display()
}

class Person {
    var name:String = ""
    fun display(){
        print(name)
    }
}