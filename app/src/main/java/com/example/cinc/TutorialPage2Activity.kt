package com.example.cinc

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView

class TutorialPage2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial_page2)

        val strings = resources.getStringArray(R.array.contentpage2)
        val textView = findViewById<TextView>(R.id.contentpage2)
        var str = ""

        for (i in strings.indices) {
            str += strings[i] + "\n\n"
        }

        textView.text = str

    }

    fun onPrevPress(view: View) {

        val intent = Intent(this, TutorialPage1Activity::class.java)
        startActivity(intent)

    }

    fun onHomePress(view: View) {

        val intent = Intent(this, TutorialActivity::class.java)
        startActivity(intent)

    }

    fun onNextPress(view: View) {

        //val intent = Intent(this, TutorialPage3Activity::class.java)
        //startActivity(intent)

    }

}
