package jp.a063.android.androidcalculator.Service.CalculatorService

/**
 * Created by umare on 2017/04/13.
 */

class CalculatorService {
    private var now = 0
    public fun num(n: Int): Int {
        now += n
        return now
    }
}