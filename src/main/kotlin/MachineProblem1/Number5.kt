fun main () {
        val sentinelValue = "ZZZ"
        val size = 10
        var count = 0
        var name: String? = null
        var birthdate: String? = null
        val arrName = arrayOfNulls<String>(size)
        val arrDoB = arrayOfNulls<String>(size)

        println("Enter name or enter ZZZ to quit")
        name = readLine()!!.lowercase()

        while (name != sentinelValue && count < 10) {
            println("Enter date of birth (DD/MM/YYYY)")
            birthdate = readLine()!!.lowercase()
            arrName[count] = name
            arrDoB[count] = birthdate
            println(
                "Enter name or enter ZZZ to quit."
            )
            name = readLine()!!.lowercase()
            count++
        }

        println("Number of names that has been entered: $count")
        println("Entered names are: ")

        for (i in 0 until count) {
            println(arrName[i])
        }

        var criteria = true
        var prevEntered = false

        while (criteria) {
            println(
                "Enter name to display their date of birth or enter ZZZ to quit."
            )
            name = readLine()!!.lowercase()
            if ((name == sentinelValue)) criteria = false else {
                var i = 0
                while (i < count && !prevEntered) {
                    if ((arrName[i] == name)) {
                        prevEntered = true
                        birthdate = arrDoB[i]
                    }
                    i++
                }
                if (prevEntered) {
                    println(
                        ("Date of birth  for $name is on $birthdate")
                    )
                } else {
                    println(
                        ("Date of birth for $name has not been previously entered.")
                    )
                }
            }
            prevEntered = false
        }
}

