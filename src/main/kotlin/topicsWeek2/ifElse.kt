
fun main() {
    println("Enter Name")
    var name = readLine()!!

    println("Enter Age")
    var age = readLine()!!.toInt()

    try {
        if (age <= 0){
            println("Age cannot be negative")
        }
          else if(age <= 18){
                println("Underage $age" )
            } else if (age == 17) {
                println("Need a guardian $age")
            } else {
                println("You are allowed to use the app")
        }
    } catch (e:Exception) {
        println("That is an invalid input")
    }


    println(name)
}