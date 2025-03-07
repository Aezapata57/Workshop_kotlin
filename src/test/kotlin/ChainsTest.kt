import org.junit.Test

import org.junit.Assert.*

class ChainsTest {

    private val chains = Chains()

    @Test
    fun stringToMorseCodeTest1() {
        assertEquals(
            "Error in your process",
            ".... . .-.. .-.. ---",
            chains.stringToMorseCode("hello")
        )
    }

    @Test
    fun stringToMorseCodeTest2() {
        assertEquals(
            "Error in your process",
            "... .. --. -- --- - --- .-",
            chains.stringToMorseCode("sigmotoa")
        )
    }

    @Test
    fun stringToMorseCodeTest3() {
        assertEquals(
            "Error in your process",
            ".- -. -.. .-. --- .. -..",
            chains.stringToMorseCode("android")
        )
    }

    @Test
    fun stringToMorseCodeTest4() {
        assertEquals(
            "Error in your process",
            "... .. ... - . -- .- ... / -.-- / -.-. --- -- .--. ..- - .- -.-. .. --- -.",
            chains.stringToMorseCode("sistemas y computacion")
        )
    }

    @Test
    fun morseToTextTest1() {
        assertEquals(
            "Error in your process",
            "bestteacher",
            chains.morseToText("-... . ... - - . .- -.-. .... . .-.")
        )
    }

    @Test
    fun morseToTextTest2() {
        assertEquals(
            "Error in your process",
            "JVM",
            chains.morseToText(".--- ...- --")
        )
    }

    @Test
    fun morseToTextTest3() {
        assertEquals(
            "Error in your process",
            "ucatolica",
            chains.morseToText("..- -.-. .- - --- .-.. .. -.-. .-")
        )
    }

    @Test
    fun daysBetweenDatesTest1() {
        assertEquals(
            "Error in your process",
            1,
            chains.daysBetweenDates("2021-01-01", "2021-01-02")
        )
    }

    @Test
    fun daysBetweenDatesTest2() {
        assertEquals(
            "Error in your process",
            32,
            chains.daysBetweenDates("2021-04-28", "2021-05-30")
        )
    }

    @Test
    fun daysBetweenDatesTest3() {
        assertEquals(
            "Error in your process",
            366,
            chains.daysBetweenDates("2021-01-01", "2022-01-02")
        )
    }

    @Test
    fun theRaceTest1() {
        assertTrue(
            "Error in your process",
            chains.theRace(arrayOf("run", "run", "run", "run", "run"), "_____")
        )
    }

    @Test
    fun theRaceTest2() {
        assertFalse(
            "Error in your process",
            chains.theRace(arrayOf("run", "run", "run", "run", "run", "run"), "____|_")
        )
    }

    @Test
    fun theRaceTest3() {
        assertTrue(
            "Error in your process",
            chains.theRace(arrayOf("run", "run", "run", "run", "jump", "run"), "____|_")
        )
    }

    @Test
    fun theRaceTest4() {
        assertFalse(
            "Error in your process",
            chains.theRace(arrayOf("run", "run", "run", "jump", "run", "jump", "jump", "run", "jump"), "__|___|__")
        )
    }

    @Test
    fun theRaceTest5() {
        assertTrue(
            "Error in your process",
            chains.theRace(arrayOf("run", "run", "jump", "run", "run", "run", "jump", "run", "run"), "__|___|__")
        )
    }


    @Test
    fun rockPaperScissorsGame1() {
        assertEquals(
            "Error in your process",
            "Player 1",
            chains.rockPaperScissorsGame(listOf("RS", "PP", "SS"))
        )
    }

    @Test
    fun rockPaperScissorsGame2() {
        assertEquals(
            "Error in your process",
            "Tie",
            chains.rockPaperScissorsGame(listOf("RS", "PP", "SR"))
        )
    }

    @Test
    fun rockPaperScissorsGame3() {
        assertEquals(
            "Error in your process",
            "Player 2",
            chains.rockPaperScissorsGame(listOf("RS", "PP", "SP"))
        )
    }

    @Test
    fun rockPaperScissorsLizardSpockGame1() {
        assertEquals(
            "Error in your process",
            "Player 1",
            chains.rockPaperScissorsLizardSpockGame(listOf("RS", "PP", "SS"))
        )
    }

    @Test
    fun rockPaperScissorsLizardSpockGame2() {
        assertEquals(
            "Error in your process",
            "Tie",
            chains.rockPaperScissorsLizardSpockGame(listOf("RS", "PP", "SR"))
        )
    }

    @Test
    fun rockPaperScissorsLizardSpockGame3() {
        assertEquals(
            "Error in your process",
            "Player 2",
            chains.rockPaperScissorsLizardSpockGame(listOf("RS", "PP", "SP"))
        )
    }
    @Test
    fun rockPaperScissorsLizardSpockGame4() {
        assertEquals(
            "Error in your process",
            "Player 1",
            chains.rockPaperScissorsLizardSpockGame(listOf("RS", "PL", "SS"))
        )
    }

    @Test
    fun rockPaperScissorsLizardSpockGame5() {
        assertEquals(
            "Error in your process",
            "Tie",
            chains.rockPaperScissorsLizardSpockGame(listOf("RS", "PP", "SR"))
        )
    }

    @Test
    fun rockPaperScissorsLizardSpockGame6() {
        assertEquals(
            "Error in your process",
            "Player 2",
            chains.rockPaperScissorsLizardSpockGame(listOf("RS", "PP", "LS"))
        )
    }


}