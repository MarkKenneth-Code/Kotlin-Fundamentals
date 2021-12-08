fun main () {
    var contacts = mutableMapOf<String, String>(
        "Mark" to "1111",
        "Kenneth" to "2222",
        "Geraldine" to "3333",
        "Angelo" to "4444",
        "John" to "5555",
        "Bill" to "6666",
        "Jorell" to "7777",
        "Mitzi" to "8888",
        "Christian" to "9999",
        "Max" to "1010",

        )

    do {
        println(contacts.keys.size)
        print("Enter your name: ")
        var name = readLine()!!.lowercase()
        if (contacts.containsKey(name.lowercase())) {
            println("You are currently listed.")
            println("Your number is ${contacts.getValue(name.lowercase())}")
        } else {
            print("Enter your number: ")
            var num = readLine()!!.toInt()
            contacts.put(name.lowercase(), num.toString())
            println("You are now registered!")
        }
        println("Do you want to continue? Enter Y for yes, N for no")
        var choice = readLine()!!.uppercase()
        if (choice == "Y") {
        } else if (choice == "N") {
            println("Thank you for using the system!")
            break;
        } else {
            println("Invalid answer!")
        }
        if(contacts.keys.size == 30){
            println("Can't add anymore, Inventory is full")
        }
    } while (contacts.keys.size != 30)
}


