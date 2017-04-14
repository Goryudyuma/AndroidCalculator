package jp.a063.android.androidcalculator

import android.app.Activity
import android.os.Bundle
import jp.a063.android.androidcalculator.Service.CalculatorService.CalculatorService
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Goryudyuma on 2017/04/11.
 */
class MainActivity : Activity() {
    private val cs = CalculatorService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = cs.num(0)

        button0.setOnClickListener {
            textView.text = cs.num(0)
        }
        button00.setOnClickListener {
            cs.num(0)
            textView.text = cs.num(0)
        }
        button1.setOnClickListener {
            textView.text = cs.num(1)
        }
        button2.setOnClickListener {
            textView.text = cs.num(2)
        }
        button3.setOnClickListener {
            textView.text = cs.num(3)
        }
        button4.setOnClickListener {
            textView.text = cs.num(4)
        }
        button5.setOnClickListener {
            textView.text = cs.num(5)
        }
        button6.setOnClickListener {
            textView.text = cs.num(6)
        }
        button7.setOnClickListener {
            textView.text = cs.num(7)
        }
        button8.setOnClickListener {
            textView.text = cs.num(8)
        }
        button9.setOnClickListener {
            textView.text = cs.num(9)
        }
        buttonClear.setOnClickListener {
            textView.text = cs.clear()
        }
        buttonPlus.setOnClickListener {
            textView.text = cs.plus()
        }
        buttonEqual.setOnClickListener {
            textView.text = cs.equal()
        }
    }
}