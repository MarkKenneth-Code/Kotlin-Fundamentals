import java.time.LocalDate
import java.util.*

fun main() {
    println("What is your name?")
    val yourName = readLine()
    println("What is your Birth Month?")
    val yourBirthMonth = readLine()!!.toInt()
    println("What is your Birth Day?")
    val yourBirthDay = readLine()!!.toInt()
    println("What is your Birth Year?")
    val yourBirthYear = readLine()!!.toInt()

    val birthDate = LocalDate.of(yourBirthYear, yourBirthMonth, yourBirthDay)
    val currentAge = birthDate.until(LocalDate.now())


//    val today = Calendar.getInstance().get(Calendar.YEAR);
//    var age = today - yourBirthYear!!

    println("Your name is $yourName, age is ${currentAge.years} years old")
}