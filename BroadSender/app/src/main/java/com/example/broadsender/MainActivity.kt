package com.example.broadsender

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun SendBroadCAst(view: View) {
        Toast.makeText(applicationContext,"I am being pressed",Toast.LENGTH_SHORT).show()
        val i = Intent()
        i.putExtra("data", "Some data")
        i.action = "com.pkg.perform.Ruby"
        i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
        applicationContext.sendBroadcast(i)

    }
}
