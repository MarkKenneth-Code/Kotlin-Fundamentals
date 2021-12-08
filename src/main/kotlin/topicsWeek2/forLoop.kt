fun main(){
//    for (item in ) {
//
//    }

//    val fruits = mapOf<Int, String>(1 to "Banana", 2 to "Apple",
//    + 3 to "Orange"
//    )
//
//    for (item in fruits) {
//        println(item.value)
//    }
//
//    val users = arrayListOf<String>("Mark", "Kenneth")
//    val age = arrayListOf<Int>(45, 13)
//
//    for (count in 0..users.lastIndex ){
//        val username = users[count]
//        val ages = users[count]
//
//        println("$username is $age")
//    }

    var exitCode: Int = -1
    var totalHumans = 0

    do{
        println("How many people entered")
        var userInput = readLine()!!.toInt()
        if(userInput != exitCode){
            totalHumans += userInput
            println("*** $totalHumans ***")
        }else{
            println("Total Humans Entered: $totalHumans")
            println("Thank you for using human counter")
        }

    }while (userInput != exitCode)
}

