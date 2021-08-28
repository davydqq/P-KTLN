package Inheritance

open class Person{
    var name: String = "Undefined"
    fun printName(){
        println(name)
    }
}

class Employee: Person{
    constructor() : super(){
    }
}