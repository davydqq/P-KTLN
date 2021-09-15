
// DEFAULT
fun hello(){
    println("Hello")
}

// FUNCTIONS WITH PARAMETERS
fun showMessage(message: String){
    println(message)
}

fun displayUser(name: String, age: Int){
    println("Name: $name   Age: $age")
}

// DEFAULT ARGUMENTS
fun displayUser(name: String, age: Int = 18, position: String="unemployed"){
    println("Name: $name   Age: $age  Position: $position")
}

// varargs c#(params)
fun printStrings(vararg strings: String){
    for(str in strings)
        println(str)
}

// overload
fun printUserGroup(count:Int, vararg users: String){
    println("Count: $count")
    for(user in users)
        println(user)
}

fun printUserGroup(group: String, vararg users: String, count:Int){
    println("Group: $group")
    println("Count: $count")
    for(user in users)
        println(user)
}

// SPREAD OPERATOR
fun changeNumbers(vararg numbers: Int, koef: Int){
    for(number in numbers)
        println(number * koef)
}

fun changeNumbers(){
    val nums = intArrayOf(1, 2, 3, 4)
    changeNumbers(*nums, koef=2)
}

// RETURN 
fun sum(x:Int, y:Int): Int{
     
    return x + y
}

// UNIT = VOID
fun hello2() : Unit{
    println("Hello")
}

// ONE ROW FUNCTION
fun square(x: Int) = x * x

// LOCAL FUNCTIONS
fun compareAge(age1: Int, age2: Int){
 
    fun ageIsValid(age: Int): Boolean{
        return age > 0 && age < 111
    }

    fun ageIsValid2(age: Int) = age > 0 && age < 111

    if( !ageIsValid(age1) || !ageIsValid2(age2)) {
        println("Invalid age")
        return
    }
 
    when {
        age1 == age2 -> println("age1 == age2")
        age1 > age2 -> println("age1 > age2")
        age1 < age2 -> println("age1 < age2")
    }
}


// FUNCTION TYPE

// 1
fun hello3() {
    println("Hello Kotlin")
}
fun callHello3(){
    val message: () -> Unit 
    message = ::hello
    message()
}

// 2
fun sum3(a: Int, b: Int): Int{
    return a + b
}
fun callSum3(){
    val operation: (Int, Int) -> Int = ::sum
    val result = operation(3, 5)
    println(result) // 8
}

// Higher order functions 
fun displayMessage(mes: () -> Unit){
    mes()
}
fun morning(){
    println("Good Morning")
}
fun evening(){
    println("Good Evening")
}
fun calldisplayMessage() {
    displayMessage(::morning)
    displayMessage(::evening)
}


// anonymous functions
fun anonymous(){

    // 1
    val message = fun() = println("Hello")
    message()

    // 2
    val sum = fun(x: Int, y: Int): Int = x + y 
    val result = sum(5, 4)
    println(result)     // 9
}

// lambda functions
fun lambdaFunctions(){

    val hello = { println("Hello Kotlin") }
    hello()

    val hello2: () -> Unit = { println("Hello Kotlin") }
    hello2()

    run { println("Hello Kotlin") };
    { println("Hello Kotlin") }()

    val printer = { message: String -> println(message) }
    printer("Hello")

    val sum = {x:Int, y:Int -> x + y}
    val a = sum(2, 3)   // 5
    val b = sum(4, 5)   // 9
}

// trailing lambda
fun doOperation(x: Int, y: Int, op: (Int, Int) ->Int){
 
    val result = op(x, y)
    println(result)
}

fun calldoOperation(){
    doOperation(3, 4, {a, b -> a * b}) // 12
    doOperation(3, 4) {a, b -> a * b} // 12
}