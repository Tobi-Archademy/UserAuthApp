package com.oluwatobi.userauthapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.login_screen.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        clickListener()

    }

    private fun clickListener() {
        txv_signup.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        txv_forgot_pwd.setOnClickListener {
            startActivity(Intent(this, PasswordRecoveryActivity::class.java))
        }
    }
}