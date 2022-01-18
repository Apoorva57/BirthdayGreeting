package com.example.birthdaygreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Birthdaygreetingactivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygreetingactivity)

        val mTextView = findViewById<TextView>(R.id.birthdayGreeting)
        val resourceId = mTextView.id

        val name = intent.getStringExtra(NAME_EXTRA)
        mTextView.text = "Happy Birthday\n$name!"
    }
}