package jp.a063.android.androidcalculator.Service.CalculatorService

import java.math.BigInteger

/**
 * Created by umare on 2017/04/13.
 */

class CalculatorService {
    private var now = BigInteger.valueOf(0)
    private var memo = BigInteger.valueOf(0)
    private var operator = '='

    public fun num(n: Long): String {
        memo = memo.multiply(BigInteger.valueOf(10)).plus(BigInteger.valueOf(n))
        return memo.toString()
    }

    public fun equal(): String {
        if (operator == '+') {
            now = now.plus(memo)
            memo = now
            return now.toString()
        }
        return "error"
    }

    public fun plus(): String {
        this.equal()
        operator = '+'
        now = memo
        memo = BigInteger.valueOf(0)
        return now.toString()
    }

    public fun clear(): String {
        now = BigInteger.valueOf(0)
        memo = BigInteger.valueOf(0)
        operator = '='
        return now.toString()
    }
}