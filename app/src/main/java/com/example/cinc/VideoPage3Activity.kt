package com.example.cinc

import androidx.appcompat.app.AppCompatActivity
import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView
import android.os.Bundle

class VideoPage3Activity : AppCompatActivity() {

    private var videoview: VideoView? = null
    private var mediac: MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_page3)

        mediac = MediaController(this)
        videoview = findViewById<VideoView?>(R.id.videoView)

        videoview!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.video3))
        videoview!!.setMediaController(mediac)
        videoview!!.start()

    }

}
