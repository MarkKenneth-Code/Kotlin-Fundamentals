fun main() {
//    val numbers = listOf(1,2,3,4,5)
//
//    //foreach
//    numbers.forEach{
//        println(it)
//    }
//
//    //map will return a new collection
//    val newNumbers = numbers.map {
//        it * 4
//        it * 2
//    }
//    println(newNumbers)
//
//    // filter -> will return a new collection, filtering the values
//    //based on our condition
//
//    val evenNumber = numbers.filter {
//        it % 2 == 0
//    }
//    println(evenNumber)
    val number = 4
    println(isEven(number))

    val number2 = 3
    println(isEven(number))
}

//function to check number whether a number is odd or even
        //argument na tinatanggap
fun isEven (num: Int):Boolean {
  return num % 2 == 0
}