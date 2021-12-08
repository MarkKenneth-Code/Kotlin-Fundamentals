fun main(){
    println("Enter Password: ")
    var password = readLine()!!.lowercase()

    val passwordFormat = "\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@\$!%*?&])[A-Za-z\\d@\$!%*?&]{8,16}\$\"".toRegex()

    if (!passwordFormat.matches(password)) {
        println("Must Contain 1 lower case, 1 upper case, 1 character")
    } else {
        println("valid password")
    }
}

