fun main() {
    println("Input First Number: ")
    var firstNumber = readLine()!!.toInt()

    println("Input Second Number: ")
    var secondNumber = readLine()!!.toInt()

    println("Input Third Number: ")
    var thirdNumber = readLine()!!.toInt()

    if (firstNumber >= secondNumber && firstNumber >= thirdNumber){
        println("$firstNumber it the largest number")
    } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
        println("$secondNumber is the largest number")
    } else {
        println("$thirdNumber is the largest number")
    }
}

