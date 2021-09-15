
class Person constructor(_name: String){
    var name: String = _name
    init{
        name = _name
    }
    
    var age: Int = 18

    fun sayHello() {
        println("Hello, my name is $name")
    }
 
    fun go(location: String) {
        println("$name goes to $location")
    }
 
    fun personToString() : String {
        return "Name: $name  Age: $age"
    }
}

fun main(){
    val bob: Person = Person("")  // создаем объект
    println(bob.name)       // Undefined
    println(bob.age)        // 18
 
    bob.name = "Bob"
    bob.age = 25
 
    println(bob.name)       // Bob
    println(bob.age)        // 25
}