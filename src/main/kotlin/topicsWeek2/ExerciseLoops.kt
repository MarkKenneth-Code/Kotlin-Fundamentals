fun main() {

//    val number = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
//
//    number.forEach{
//        if(it % 3 == 0 && it % 5 == 0){
//            println("Ping Pong")
//        } else if (it % 3 == 0) {
//            println("Ping")
//        } else if (it % 5 == 0) {
//            println("Pong")
//        } else {
//            println("x")
//        }
//    }

    // get max value per list
//    val grades = listOf(
//        listOf(94,82,85),
//        listOf(83,99,97),
//        listOf(76,89,90)
//    )
//
//    grades.forEach{ println(it.maxOrNull())
//    }

    //perfect numbers
    val numbers = (1..1000).toList()
    val perfectNumber = numbers.filter { number ->
        var temp = 0
        for (i in 1..number / 2) {
            if (number % i == 0) {
                temp += i
            }
        }
        temp==number
    }
    print(perfectNumber)
}
//fun perfectNumbers(num: Int): Boolean {
//    var temp = 0
//
//    for (i in 1..num / 2) {
//
//        if (num % i == 0) {
//            temp += i
//            break
//        }
//        temp == number
//    }
//    return true
//}


