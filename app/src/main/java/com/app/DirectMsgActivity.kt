package com.app

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.app.statussaver.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_direct_msg.*

class DirectMsgActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_direct_msg)
        MobileAds.initialize(this, getString(R.string.admob_app_id))

        //adView.adSize = AdSize.BANNER
        //adView.adUnitId = AD_UNIT_ID

        val adRequest = AdRequest.Builder().addTestDevice("3BE2250B43518CCDA7DE426D04EE231").build()
        adView.loadAd(adRequest)
     send_msg.setOnClickListener {
         if(code.text.toString().isNullOrEmpty())
         {
             Toast.makeText(this,"Please enter country code without +",Toast.LENGTH_SHORT).show()
         }
         else if(number.text.toString().isNullOrEmpty())
         {
             Toast.makeText(this,"Please enter number",Toast.LENGTH_SHORT).show()

         }else {
             startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=${code.text.toString()}${number.text.toString()}")))
         }
         }
    }
}
