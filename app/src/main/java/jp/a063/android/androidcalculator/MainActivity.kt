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

        button1.setOnClickListener {
            textView.text = cs.num(1).toString()
        }
        button2.setOnClickListener {
            textView.text = cs.num(2).toString()
        }
        button3.setOnClickListener {
            textView.text = cs.num(3).toString()
        }
        button4.setOnClickListener {
            textView.text = cs.num(4).toString()
        }
    }
}