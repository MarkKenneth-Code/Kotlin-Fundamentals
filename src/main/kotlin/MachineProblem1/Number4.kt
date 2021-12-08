fun main() {
        val multipleQuestions = arrayOf(
            "QuestionOne" to "What is my favorite food",
            "Choices" to mapOf(
                "A" to "Adobo",
                "B" to "Sinigang",
                "C" to "Chicken Curry"
            ),
            "QuestionTwo" to "What is my favorite drink",
            "Choices" to mapOf(
                "A" to "Wine",
                "B" to "Beer",
                "C" to "Tequila"
            ),
            "QuestionThree" to "What is my dessert?",
            "Choices" to mapOf(
                "A" to "Graham",
                "B" to "Ice Cream",
                "C" to "Buko Salad"
            ),
            "QuestionFour" to "What is my favorite pet?",
            "Choices" to mapOf(
                "A" to "Cat",
                "B" to "Dog",
                "C" to "Bird"
            ),
            "QuestionFive" to "What is my favorite music genre",
            "Choices" to mapOf(
                "A" to "Pop Music",
                "B" to "Rap Music",
                "C" to "Jazz"
            ),
            "QuestionSix" to "What is the game that i played most",
            "Choices" to mapOf(
                "A" to "League Of Legends",
                "B" to "CSGO",
                "C" to "Dota 2"
            ),
            "QuestionSeven" to "What is my favorite online computer game?",
            "Choices" to mapOf(
                "A" to "League of Legends",
                "B" to "Valorant",
                "C" to "Fortnite"
            ),
            "QuestionEight" to "What is my favorite online mobile computer game",
            "Choices" to mapOf(
                "A" to "Mobile Legends",
                "B" to "Call of Duty Mobile",
                "C" to "Wild Rift"
            ),
            "QuestionNine" to "What is my favorite place to visit",
            "Choices" to mapOf(
                "A" to "Hundred Islands",
                "B" to "Ilocos Norte Windmills",
                "C" to "Chocolate Hills"
            ),
            "QuestionTen" to "What is my hobby",
            "Choices" to mapOf(
                "A" to "Playing online games",
                "B" to "Reading books",
                "C" to "Eating"
            ),
        )

        val answerQuestions = arrayListOf(
            "A",
            "C",
            "C",
            "B",
            "A",
            "B",
            "B",
            "A",
            "C",
            "C")

        var score = 0
        var scoreCounter = 0

        for(i in answerQuestions) {
            println(multipleQuestions[scoreCounter].second)
            println(multipleQuestions[scoreCounter+1].second)
            var exitCode = 0
            while (exitCode != 1){
                val choice = readLine()!!.uppercase()
                exitCode = if (choice == "A" || choice == "B" || choice == "C"){
                    if(choice == i ) {
                        println("Correct! \n")
                        score++
                    }
                    else println("The correct answer is: $i \n")
                    1
                } else 0
            }
            scoreCounter += 2
        }
        println("Your score is: $score")
}

