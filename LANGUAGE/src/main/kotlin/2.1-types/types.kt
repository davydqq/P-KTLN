
fun valFunc(){
    val age: Int // VAL IMMUTABLE
    age = 23
    // age = 56 // ERROR
}

fun varFunc(){
    var age: Int
    age = 23
    age = 56
}

fun declarationVariables(){
    var v1: Int = 5
    var v2 = 5
}

fun numericalDefault(){
    val a: Byte = -1
    val b: Short = 2
    var c: Int = -240
    val d: Long = 300000
}

fun numericalBytes(){
    val a: UByte = 10U
    val b: UShort = 45U
    val c: UInt = 250U
    val d: ULong = 3000U
}

fun lowLevelDeclarationNumerical(){
    val a: Int = 0b0101    // 5
    val b: Int = 0b1011     // 11
}

fun floatDouble(){
    val height: Double = 1.78
    val pi: Float = 3.14F

    val exp: Double = 23e3
    val mExp: Double = 23e-3
}

fun boolSymbolsString(){

    var a: Boolean = true
    val b: Boolean = false

    val a1: Char = 'A'
    val b1: Char = 'B'
    val c1: Char = 'T'
    
    val name: String = "KOTLIN"

    val text: String = """
                    SALT II was a series of talks between United States
                    and Soviet negotiators from 1972 to 1979.
                    It was a continuation of the SALT I talks.
                """

    val firstName = "Tom"
    val lastName = "Smith"
    val welcome = "Hello, $firstName $lastName"
}

fun anyCheck() {
    var name: Any = "Tom"
    println(name)   // Tom
    name = 6758
    println(name)   // 6758
}