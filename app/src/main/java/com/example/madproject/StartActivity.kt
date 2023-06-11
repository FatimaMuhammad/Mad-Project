package com.example.madproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {
    lateinit var start:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strat)



                start=findViewById(com.google.android.material.R.id.start)
                start.setOnClickListener {
                    var intent= Intent(this,MainActivity::class.java)
                    startActivity(intent)
                }

            }

            override fun onBackPressed() {
                super.onBackPressed()
            }
        }
