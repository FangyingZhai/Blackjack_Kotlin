package com.example.balckjack_mingyuan_fangying.game

/**
 * A "Player" class
 */
class Player {
    var first_name: String = ""
    var last_name : String = ""
    var winTimes : Int = 0
    var lossTimes: Int = 0
    var winRate: Double = 0.00
    var money: Int = 500
    var totalScore = 0
    var ace: Boolean = false
    private var arrayList = ArrayList<String>()

    fun addCard(a: String){
        arrayList.add(a)
    }

    fun getTotal(b: Int): Int{
        this.totalScore += b
        return this.totalScore
    }

    fun addWinTimes(): Int{
        this.winTimes += 1
        return winTimes
    }

    fun addLossTimes(): Int{
        this.lossTimes += 1
        return lossTimes
    }

    fun updateWinRate() : Double{
        this.winRate = (this.winTimes/this.lossTimes).toDouble()
        return this.winRate
    }

    fun Moneyminus(BET: Int): Int{
        money -= BET
        return this.money
    }

    fun Moneyadd(BET: Int): Int{
        money -= BET
        return this.money
    }
}