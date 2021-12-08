fun main(){
//    var input = readLine()
//
//    println(input?:"Default")
    try {
        val message = "Welcome to Kotlin Tutorials"
        message.toInt()
    } catch (exception: NumberFormatException) {
        println(exception.message)
    } finally {
        println()
    }
}