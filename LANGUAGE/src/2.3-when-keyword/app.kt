fun when1(){
    val isEnabled = true
    when(isEnabled){
        false -> println("isEnabled off")
        true -> println("isEnabled on")
    }
}

fun when2Else(){
    val a = 30
    when(a){
        10 -> println("a = 10")
        20 -> println("a = 20")
        else -> println("else")
    }
}

fun whenManyInstruction(){
    var a = 10
    when(a){
        10 -> {
            println("a = 10")
            a *= 2
        }
        20 -> {
            println("a = 20")
            a *= 5
        }
        else -> { println("неопределенное значение")}
    }
    println(a)
}

fun whenMultiplyValues(){
    val a = 10
    when(a){
        10, 20 -> println("a = 10 или a = 20")
        else -> println("неопределенное значение")
    }
}

fun whenInValue(){
    val a = 10
    when(a){
        in 10..19 -> println("a в диапазоне от 10 до 19")
        in 20..29 -> println("a в диапазоне от 20 до 29")
        !in 10..20 -> println("a вне диапазона от 10 до 20")
        else -> println("неопределенное значение")
    }
}

fun whenDynamic1(){
    val a = 10
    val b = 5
    val c = 3
    when(a){
        b - c -> println("a = b - c")
        b + 5 -> println("a = b + 5")
        else -> println("неопределенное значение")
    }
}

fun whenDynamic2(){
    val a = 10
    val b = 20
    when(a + b){
        10 -> println("a + b = 10")
        20 -> println("a + b = 20")
        30 -> println("a + b = 30")
        else -> println("Undefined")
    }
}

fun whenDynamic3(){
    val a = 10
    val b = 26
    when(val c = a + b){
        10 -> println("a + b = 10")
        20 -> println("a + b = 20")
        else -> println("c = $c")
    }
}

fun whenAsIfElse(){
    val a = 15
    val b = 6
    when {
        (b > 10) -> println("b больше 10")
        (a > 10) -> println("a больше 10")
        else -> println("и a, и b меньше или равны 10")
    }
}

fun returnFromWhen(){
    val sum = 1000
    val rate = when(sum){
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 20
    }
    println(rate)       // 15
}

fun main() {
    when2Else();
}