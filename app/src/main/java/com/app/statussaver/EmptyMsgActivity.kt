package com.app.statussaver

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_text_repeater.*
import kotlinx.android.synthetic.main.activity_text_repeater.adView
import kotlinx.android.synthetic.main.content_home.*
import kotlin.repeat

class EmptyMsgActivity : AppCompatActivity() {
      var repeatmsg: String="\u0020"
    lateinit var repeat_text:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty_msg)
        MobileAds.initialize(this, getString(R.string.admob_app_id))

        //adView.adSize = AdSize.BANNER
        //adView.adUnitId = AD_UNIT_ID

        val adRequest = AdRequest.Builder().addTestDevice("3BE2250B43518CCDA7DE426D04EE231").build()
        adView.loadAd(adRequest)
        switch1.setOnCheckedChangeListener {
            switch1,isCheck->
            if(isCheck)
            {
                on_off.text="new Line: On"
            }
            else
            {
                on_off.text="new Line: Off"
            }
        }
        repeat.setOnClickListener {
            try {

                if(switch1.isChecked) {
                    repeatmsg = msg.text.toString().plus("\n")
                }
                else{
                    repeatmsg = msg.text.toString()

                }
                 repeat_text=repeatmsg.repeat((numbertorepeat.text.toString()).toInt())
                Log.e("message",repeat_text)
                repeat_msg.setText(repeat_text)
            }catch (e:Exception)
            {
                e.printStackTrace()
            }

        }

        copy.setOnClickListener {
            val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText( "Copied Text",repeat_text)
            clipboard.primaryClip = clip
            Toast.makeText(this,"Text Copied", Toast.LENGTH_SHORT).show()
        }

        clean.setOnClickListener {
            repeat_msg.text=""
            numbertorepeat.setText("")
            msg.setText("")

        }
        share.setOnClickListener {
            startActivity(Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT,repeat_text)

            })
        }
    }

}
