package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.view.View
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnOpenActivity : Button = findViewById(R.id.virus)
        btnOpenActivity.setOnClickListener{
            val intent = Intent(this, Main2Activity :: class.java)
            startActivity(intent)
        }

        val btnOpenActivity2 : Button = findViewById(R.id.Sintomas)
        btnOpenActivity2.setOnClickListener{
            val intent2 = Intent(this, SIMPT :: class.java)

            startActivity(intent2)
        }

        val btnOpenActivity3 : Button = findViewById(R.id.indicaciones)
        btnOpenActivity3.setOnClickListener {
            val intent3 = Intent(this, INDIC::class.java)

            startActivity(intent3)
        }

        val pop : TextView = findViewById(R.id.resultar)
        val star : Button = findViewById(R.id.resultado)
        val age : EditText = findViewById(R.id.nombre)
        val name : EditText = findViewById(R.id.edad)

        val btnstarter : Button = findViewById(R.id.resultado)
        btnstarter.setOnClickListener{
            pop.visibility = View.VISIBLE
            star.visibility = View.INVISIBLE
            age.visibility = View.INVISIBLE
            name.visibility = View.INVISIBLE

        }
    }



}
