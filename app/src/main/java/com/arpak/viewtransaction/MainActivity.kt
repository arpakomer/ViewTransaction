package com.arpak.viewtransaction

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arpak.viewtransaction.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var  design: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        design = ActivityMainBinding.inflate(layoutInflater)
        val view = design.root
        setContentView(view)

        design.webView.settings.javaScriptEnabled = true

        design.webView.loadUrl("https://developer.android.com/")



        design.buttonPictureOne.setOnClickListener {

            design.imageView.setImageResource(R.drawable.translate)
        }

        design.buttonPictureTwo.setOnClickListener {

            // dynamic structure  ---> If string come in database
            design.imageView.setImageResource(resources.getIdentifier("indir","drawable",packageName))

//            design.imageView.setImageResource(R.drawable.indir) ---> not dynamic

        }

        design.buttonStart.setOnClickListener {

            val adress = Uri.parse("android.resource://"+packageName+"/"+ R.raw.android)

            design.videoView.setVideoURI(adress)
            design.videoView.start()
        }

        design.buttonStop.setOnClickListener {
            design.videoView.stopPlayback()
        }
    }
}