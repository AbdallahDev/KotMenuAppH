package com.example.abdallahsarayrah.kotmenuapph

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_audio.*

class AudioActivity : AppCompatActivity() {

    var mp = MediaPlayer()
    var index = "play"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio)

        mp = MediaPlayer.create(this, R.raw.athan)

        play.setBackgroundResource(R.drawable.play)

        play.setOnClickListener {
            when (index) {
                "play" -> {
                    mp.start()
                    index = "pause"
                    play.setBackgroundResource(R.drawable.pause)
                }
                "pause" -> {
                    mp.pause()
                    index = "play"
                    play.setBackgroundResource(R.drawable.play)
                }
            }
        }
    }

}
