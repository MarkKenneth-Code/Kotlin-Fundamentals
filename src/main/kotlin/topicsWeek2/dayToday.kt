fun dayCheck(){


    println("What is day today ")
    var dayOfWeek = readLine()!!.toLowerCase()

    //Monday -> Hey it's Monday! Let's be productive!
    //Tuesday -> Hey it's Tuesday! Choose to be happy!
    //Wednesday -> Hey it's Wednesday my dudes!
    //Thursday -> Hey it's Thursday! You're almost there!
    //Friday -> Thank God it's Friday!
    //Saturday and Sunday -> Happy Weekends! Get some life!

    when(dayOfWeek){
        "monday" -> println("Hey it's Monday! Let's be productive!")
        "tuesday" -> println("Hey it's Tuesday! Choose to be happy!")
        "wednesday" -> println("Hey it's Wednesday my dudes!")
        "thursday" -> println("Hey it's Thursday! You're almost there!")
        "friday" -> println("Thank God it's Friday!")
        "saturday"-> println("Happy Weekends! Get some life!")
        "sunday" -> println("Happy Weekends! Get some life!")
        else -> println("Invalid input")
    }

}

