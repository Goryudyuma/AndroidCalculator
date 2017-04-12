package jp.a063.android.androidcalculator

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Goryudyuma on 2017/04/11.
 */
class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            textView.text = "1"
        }
        button2.setOnClickListener {
            textView.text = "2"
        }
        button3.setOnClickListener {
            textView.text = "3"
        }
        button4.setOnClickListener {
            textView.text = "4"
        }
    }
}