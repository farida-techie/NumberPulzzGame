package com.malkinfo.numberpulzzgame

class Tile(
    private var number:Int? = null
) {
    fun number():Int{
        return number!!
    }
}