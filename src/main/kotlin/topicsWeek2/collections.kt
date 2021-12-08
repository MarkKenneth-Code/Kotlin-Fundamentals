package topicsWeek2

fun main(args: Array<String>){
//    println("Hello World");
    //collections - group of related data
    // Immutable vs mutable
    //Immutable -> Airlines = ["Cebu Pacific, "PAL"]
    //mutable -> Users[]

    //List, Set, Map

    //List -> ordered collections
    // by indeces

    //Map -> key-value pairs

    //immutable
    val studentsDetails: Map<String, String> = mapOf(
        "firstName" to "Kenneth",
        "lastName" to "Dela Cruz",
        "yrLevel" to "4th Year",
        "section" to "INF 183"
    )
    println(studentsDetails.entries) // Printing Entries
    studentsDetails.keys
    println(studentsDetails.values)
    println(studentsDetails.isEmpty()) // check if studentDetails is empty or not
    println(studentsDetails.count()) // determine the size of immutable map
    println(studentsDetails.getValue("section")) // getting the value of section
    //mutable map
    val studentDetails2: MutableMap<String, String> = mutableMapOf(
        "firstName" to "Kenneth",
        "lastName" to "Dela Cruz",
        "yrLevel" to "4th Year",
        "section" to "INF 183"
    )
    println(studentDetails2)
    studentDetails2.remove("section")
    println(studentDetails2)
    studentDetails2["Age"] = "21" // add another items to the mutable map
    println(studentDetails2)
    println(studentDetails2.getValue("firstName")) // getting the value of section


    //immutable
    val airlines = listOf("Cebu pacific", "PAl", "Airasia")
//    println(airlines)
//    println(airlines[1])
//    println(airlines.shuffled()) // shuffle list
//    println(airlines.isEmpty()) // check if list is empty or not
//    println(airlines.reversed()) // reversed the items inside the list

    //mutable
    val names = mutableListOf<String>("Mark", "Kentot")
//    println(names)
//    names.add("Kenneth") // Add another name to mutableList
//    println(names)
//    println(names.contains("Mark")) // check if it contains "Mark"
//    println(names.removeAt(0)) // remove specific data in the mutableList
//    println(names)
//    println(names.size) // print the size of the mutableList


    //immutable
    val usernames: Set<String> = setOf("Brandon", "Amelia", "charlie")
//    println(usernames.drop(1)) // drop items in the list
//    println(usernames.last()) // print the last items in the list



    //mutable

    val studentNumber: MutableList<Int> = mutableListOf(1,2,3,4,5)
//    println(studentNumber.removeFirst()) // remove the first item on the list
//    println(studentNumber.retainAll{(it >= 3)}) // removes all elements except the ones from the argument collection
//    println(studentNumber.clear()) // removes all elements from a list and leaves it empty.

    val students: MutableSet<String> = mutableSetOf("Brandon", "Amelia", "Charlie")
//    println(students)
//    students.add("Alex")
//    println(students)
//    students.add("Brandon") // if this is a list the result will be
//    // "brandon", "Amelia", "Charlie", "Alex", "Brandon"
//    println(students)

}