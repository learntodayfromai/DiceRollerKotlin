package com.learntodayfromai.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun genNumber(){
        val dice = Dice(6)
        val roll = dice.roll()
        assertTrue("value between 1 and 6",roll in (1..6))
    }
}