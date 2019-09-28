package com.app.statussaver

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import kotlinx.android.synthetic.main.activity_text_repeater.*
import java.lang.StringBuilder
import kotlin.repeat

class TextRepeaterActivity : AppCompatActivity() {
lateinit var final_Str:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_repeater)
        repeat.setOnClickListener {
            try {
            var repeatmsg:String=msg.text.toString().plus("\n")
            var repeat_text:String=repeatmsg.repeat((numbertorepeat.text.toString()).toInt())

                repeat_msg.setText(repeat_text)
            }catch (e:Exception)
            {
                e.printStackTrace()
            }

        }
    }
}
