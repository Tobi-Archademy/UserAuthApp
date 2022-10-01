package com.oluwatobi.userauthapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val countryCode = resources.getStringArray(R.array.country_codes)

        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countryCode)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(this@SignUpActivity,
                        getString(R.string.selected_item) + " " +
                                "" + countryCode[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }

//        spinner.adapter = CustomAdapter(this,
//        listOf(
//            CountryCodeData(R.drawable._24_togo_generated, "+228"),
//            CountryCodeData(R.drawable._31_benin_generated, "+229"),
//            CountryCodeData(R.drawable._37_cameroon_generated, "+237"),
//            CountryCodeData(R.drawable._44_gambia_generated, "+220"),
//            CountryCodeData(R.drawable._48_niger_generated, "+227"),
//            CountryCodeData(R.drawable._61_guinea_bissau_generated, "+245"),
//            CountryCodeData(R.drawable._96_mali_generated, "+223"),
//            CountryCodeData(R.drawable.ic_flag, "+234"),
//            CountryCodeData(R.drawable._98_mauritania_generated, "+222"),
//            CountryCodeData(R.drawable.vecteezy_flag_of_the_republic_of_the_congo_official_colors_and_5719931, "+242"),
//            CountryCodeData(R.drawable.vecteezy_liberia_flag_official_colors_and_proportions_national_6920453, "+231"),
//            CountryCodeData(R.drawable.vecteezy_national_flag_of_egypt_7886115, "+20"),
//        ))

        clickListener()
    }

    private fun clickListener() {
        txtLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        btn_register.setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }
    }
}