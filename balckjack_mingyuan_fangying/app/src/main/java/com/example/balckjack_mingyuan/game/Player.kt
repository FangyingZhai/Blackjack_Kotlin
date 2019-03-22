package com.example.balckjack_mingyuan.game

/**
 * A "Player" class
 */
class Player {
    var first_name: String = ""
    var last_name : String = ""
    var email: String = ""
    var winTimes : Int = 0
    var lossTimes: Int = 0
    private var totalScore = 0
    private var arrayList = ArrayList<String>()

    fun addCard(a: String){
        arrayList.add(a)
    }

    fun getTotal(b: Int): Int{
        if(b == 1) {
            if( totalScore+11 <= 21) {
                totalScore += 11;
                return totalScore;
            }
        }
        totalScore += b
        return totalScore
    }

    fun addWinTimes(): Int{
        winTimes += 1
        return winTimes
    }

    fun addLossTimes(): Int{
        lossTimes += 1
        return lossTimes
    }
}