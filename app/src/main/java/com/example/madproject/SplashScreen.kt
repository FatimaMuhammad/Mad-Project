package com.example.madproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler



class SplashScreen : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 2000 // Splash screen timeout in milliseconds
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
           // Delayed execution of the next activity
                Handler().postDelayed({
                    // Start the login activity
                    val intent = Intent(this, SignUpActivity::class.java)
                    startActivity(intent)

                    // Close the splash screen activity
                    finish()
                }, SPLASH_TIME_OUT)

            }
        }