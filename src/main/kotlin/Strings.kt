fun main(){
    val firstName = "mark Kenneth"
    val lastName = "Dela Cruz"
    val middleName = "Tabjan"
    val product = 100
    val amount = 10
    val sampleText = "Kenneth"
    var reduceText = sampleText.drop(1).dropLast(1)
    println(reduceText)

    println("Hello, ${firstName[0].uppercase()} " +
            "you must pay ${product * amount}")

//    println("My fullname is $firstName $lastName ${middleName.first()}")
//    println(myMessage)
    //getting characters
//    println(myMessage.substring(16))
//    println(myMessage.drop(3))
//    println(myMessage.elementAt(3))
//    println(myMessage.contains("Justin"))
//    println(myMessage.uppercase())
//    println(anotherMessage.lowercase())
}