package com.example.imsodam_i.a3rdseminarproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_chat.*
import kotlinx.android.synthetic.main.activity_profile.*

class ClickActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        var image : Int = 0

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        click_name_tv.text = intent.getStringExtra("name")
        click_profile_img.setImageResource(intent.getIntExtra("profile", 0))


    }
}