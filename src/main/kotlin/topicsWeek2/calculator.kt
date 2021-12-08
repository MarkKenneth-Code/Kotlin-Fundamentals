fun calculator() {
    println("Enter first number")
    val firstNumber = readLine()!!.toDouble()

    println("Enter second number")
    val secondNumber = readLine()!!.toDouble()

    println("Enter operator")
    val operator = readLine()!!

    when (operator) {
        "+"-> println(firstNumber+secondNumber)
        "-"-> println(firstNumber-secondNumber)
        "*"-> println(firstNumber*secondNumber)
        "/"-> println(firstNumber/secondNumber)
        else -> println("Invalid Operator")
    }
}