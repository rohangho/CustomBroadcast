package com.example.receiveer

import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var receive: MyReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        receive = MyReceiver()
        val intentFilter = IntentFilter("com.pkg.perform.Ruby")
        intentFilter?.let { registerReceiver(receive, it) }
    }

    override fun onDestroy() {
        super.onDestroy()
        if(receive!=null)
            unregisterReceiver(receive);
    }
}
