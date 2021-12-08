fun main() {
    println("Enter String: ")
    var c = readLine()!!
    println(function(c))
}

fun function(c: String): Any {
    return if (c.length > 15) {
        ("Only accepts 15 characters")
    } else if (c.length % 2 == 0) {
        c.reversed()
    } else {
        c.toSortedSet()
    }
}



