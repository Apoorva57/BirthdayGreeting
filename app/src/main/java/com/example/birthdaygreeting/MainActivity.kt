package com.example.birthdaygreeting

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {

        val mEditText = findViewById<EditText>(R.id.nameInput)
        val resourceId = mEditText.id
        val name = mEditText.editableText.toString()

        val intent = Intent(this, Birthdaygreetingactivity::class.java)
        intent.putExtra(Birthdaygreetingactivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}