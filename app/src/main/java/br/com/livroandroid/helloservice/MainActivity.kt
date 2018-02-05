package br.com.livroandroid.helloservice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Start
        btStart.setOnClickListener {
            startService(Intent(this, HelloService::class.java))
        }
        // Stop
        btStop.setOnClickListener {
            stopService(Intent(this, HelloService::class.java))
        }
    }
}
