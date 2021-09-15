

fun cycle(){
    for(n in 1..9){
        print("${n * n} \t")
    }
}

fun sequnce(){
    val range = 1..5
    val rangeStrings =  "a".."d"
    val range3 =  5 downTo 1    // 5 4 3 2 1
    val range4 = 10 downTo 1 step 3     // 10 7 4 1
}

fun sequenceUntil(){
    val range1 = 1 until 9          // 1 2 3 4 5 6 7 8
    val range2 = 1 until 9 step 2   // 1 3 5 7
}

fun cycleSequnce(){
    val range1 = 5 downTo 1 
    for(c in range1) print(c)   // 54321
    println()
    
    val range2 = 'a'..'d'
    for(c in range2) print(c)   // abcd
    println()
    
    for(c in 1..9) print(c)     // 123456789
    println()
    
    for(c in 1 until 9) print(c)    // 12345678
    println()
    
    for(c in 1..9 step 2) print(c)  // 13579
}