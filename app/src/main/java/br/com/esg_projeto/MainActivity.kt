package br.com.esg_projeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textSigUp = findViewById<TextView>(R.id.loginEstudante)

        textSigUp.setOnClickListener {
            val openSignUp = Intent(this, SignupActivity::class.java)
            startActivity(openSignUp)
        }

    }

}