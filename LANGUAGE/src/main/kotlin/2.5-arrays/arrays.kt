fun initWay1(){
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val n = numbers[1]  // получаем второй элемент  n=2
    numbers[2] = 7      // переустанавливаем третий элемент
    println("numbers[2] = ${numbers[2]}") // numbers[2] = 7
}

fun initWay2(){
    val numbers = Array(3, {5}) // [5, 5, 5]
}

fun initWay3(){
    var i = 1;
    val numbers = Array(3, { i++ * 2}) // [2, 4, 6]
}

fun iterationWay1(){
    val people = arrayOf("Tom", "Sam", "Bob")
    for(person in people){
        print("$person \t")
    }
}

fun iterationWay2(){
    val people = arrayOf("Tom", "Sam", "Bob")
    var i = 0
    while( i in people.indices){
        println(people[i])
        i++;
    }
}

fun isInArray(){
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(4 in numbers)       // true
    println(2 !in numbers)      // false
}

fun declarationArrayByType(){
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val doubles: DoubleArray = doubleArrayOf(2.4, 4.5, 1.2)

    val numbers1 = IntArray(3, {5})
    val doubles1 = DoubleArray(3, {1.5})
}

fun twoDimesionArray(){
    val table: Array<Array<Int>> = Array(3, { Array(5, {0}) })
    val table2 = Array(3, { Array(3, {0}) })
    table2[0] = arrayOf(1, 2, 3)    
    table2[1] = arrayOf(4, 5, 6)    
    table2[2] = arrayOf(7, 8, 9)  

    val table3: Array<Array<Int>> = Array(3, { Array(3, {0}) })
    table3[0] = arrayOf(1, 2, 3)
    table3[1] = arrayOf(4, 5, 6)
    table3[2] = arrayOf(7, 8, 9)
    for(row in table3){
 
        for(cell in row){
            print("$cell \t")
        }
        println()
    }
}