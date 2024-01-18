package org.example

fun main() {
    println("Chance = ${ Yahtzee(1,2,3,4,5).chance() }")
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

    fun chance() : Int {
        return turn.sum()
    }
}
