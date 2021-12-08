import java.time.Year

fun main() {
    val year = 1901
    var century = false

        if (year % 100 == 0) {
            century = year % 400 == 0
        } else
            century = true

    println(if (century) "$year increased" else "$year still")

//    var number1 = 12
//    var number2 = 15
//    var result: Double
//
//
//    number1 -= number1
//    number2 *= number2
//
//    println("number1 + number1 = $number1")
//    println("number2 + number2 = $number2")

    //arithmetic
//    val numByte = 1
//    val numShort = 2
//    val numFloat = 4
//    val numDouble = 1.23F
//    var numLong = 7
//
//    val result = numLong + numShort
//    val result2 = numLong - numShort
//    val result3 = numLong / numShort
//    val result4 = numLong * numShort
//    val result5 = numLong % numShort
//
//    println(result)
//    println(result2)
//    println(result3)
//    println(result4)
//    println(result5)
//
//    println(++numLong)

}

