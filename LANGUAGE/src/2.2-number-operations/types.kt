// Operations 

fun shl(){
    val z = 3 shl 2     // z = 11 << 2 = 1100 
    println(z)          // z = 12
    val d = 0b11 shl 2
    println(d)          // d = 12
}

fun shr(){
    val z = 12 shr 2     // z = 1100 >> 2 = 11
    println(z)          // z = 3
    val d = 0b1100 shr 2
    println(d)          // d = 3
}

fun ushr(){
    val z = 12 ushr 2     // z = 1100 >> 2 = 11
    println(z)          // z = 3
}

fun and(){
    val x = 5   // 101
    val y = 6   // 110
    val z = x and y     // z = 101 & 110 = 100
    println(z)          // z = 4
    
    val d = 0b101 and 0b110
    println(d)          // d = 4
}

fun or(){
    val x = 5   // 101
    val y = 6   // 110
    val z = x or y     // z = 101 | 110 = 111
    println(z)         // z = 7
    
    val d = 0b101 or 0b110
    println(d)          // d = 7
}

fun xor(){
    val x = 5   // 101
    val y = 6   // 110
    val z = x xor y     // z = 101 ^ 110 = 011
    println(z)         // z = 3
    
    val d = 0b101 xor 0b110
    println(d)          // d = 3
}

fun inv(){
    val b = 11  // 1011
    val c = b.inv()
    println(c)      // -12
}

fun inFunc(){
    val a = 5
    val b = a in 1..6       // true - число 5 входит в последовательность от 1 до 6
}

fun notIn(){
    val a = 5
    val b = a !in 1..7
}