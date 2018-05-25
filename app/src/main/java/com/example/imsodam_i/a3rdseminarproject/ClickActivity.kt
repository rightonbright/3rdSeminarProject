package com.example.imsodam_i.a3rdseminarproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_chat.*

class ClickActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        chat_profile_image.setImageResource(intent.getIntExtra("profile", 0))



    }
}