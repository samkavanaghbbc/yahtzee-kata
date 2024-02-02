package org.example

fun main() {
    println("Chance = ${ Yahtzee(1,2,3,4,5).pair() }")
}

class Yahtzee(d1: Int, d2: Int, d3: Int, d4: Int, d5: Int) {
    private var turn = IntArray(5)
    init {
        turn[0] = d1
        turn[1] = d2
        turn[2] = d3
        turn[3] = d4
        turn[4] = d5
    }

    fun ones(): Int {
        var sum = 0

        for (index in 0..4) {
            if (turn[index] == 1) {
                sum++
            }
        }

        return sum
    }

    fun pair(): Int {
        val orderedPairs = turn.groupBy { it }.values
        val onlyPairs = orderedPairs.filter { it.size > 1 }
        val biggestPair = onlyPairs.maxByOrNull { it.first() }
        return biggestPair?.first()?.times(2) ?: 0
    }

    fun smallRun() : Int {
        return if (setOf(1,2,3,4,5) == turn.toSet()) 15 else 0
    }

    fun chance() : Int {
        return turn.sum()
    }


}
