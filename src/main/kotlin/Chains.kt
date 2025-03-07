class Chains {

    //Create a convesor from string to morse code

    fun stringToMorseCode(text: String): String
    {
        return ""
    }

    //Create a conversor from morse code to Text
    fun morseToText(morse: String): String
    {
        return ""
    }

    //Look for the days between 2 dates
    fun daysBetweenDates(date1: String, date2:String): Int {
        return 0
    }

    //The race.
    //Its time to run. In this function the input will be the actions of a runner in a String Array, other input will be the track.
    //The array could be "run" or "jump"
    //The track will be represented with "|" for the obstacles and "_" for the free space.
    //The runner should to complete the track to win.
    //The output will be a String with the result of the track.
    // When "run" in "_" or "jump" in "|" the symbol in the track will be the same (doesn't change).
    // When "run" in "|", change the symbol in the track for "/" or "jump" in "_" the symbol should change for "x".
    //The output should be true if the track was completed, or false if the track was not completed.
    fun theRace(actions: Array<String>, track: String): Boolean {
        return false
    }

    //Rock, paper, scissors game.
    //The imput is a List of strings wit 3 rounds of the game.
    //"R" = Rock, "P" = Paper, "S" = Scissors
    //The first char of the stirng represents the figure of the player 1 and the second char the figure of the player 2.
    //for example "RS" means that the player 1 choose Rock and the player 2 choose Scissors.
    //The output should be the player who win the game, or "Tie" if the game is a tie.
    fun rockPaperScissorsGame(game: List<String>): String {
        return ""
    }

    //Rock, paper, Scissors, Lizard, Spock game.

    //The imput is a List of strings wit 3 rounds of the game.
    //"R" = Rock, "P" = Paper, "S" = Scissors, "L" = Lizard, "V" = Spock
    //The first char of the stirng represents the figure of the player 1 and the second char the figure of the player 2.
    //for example "RS" means that the player 1 choose Rock and the player 2 choose Scissors.
    //The output should be the player who win the game, or "Tie" if the game is a tie.
    fun rockPaperScissorsLizardSpockGame(game: List<String>): String {
        return ""
    }

}

