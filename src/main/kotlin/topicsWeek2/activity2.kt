fun main() {
    println("Input Character: ")
    var letter = readLine()!!

    when(letter){
        "a"-> println("$letter is vowel")
        "e"-> println("$letter is vowel")
        "i"-> println("$letter is vowel")
        "o"-> println("$letter is vowel")
        "u"-> println("$letter is vowel")
        else -> println("$letter is consonant")
    }
}

