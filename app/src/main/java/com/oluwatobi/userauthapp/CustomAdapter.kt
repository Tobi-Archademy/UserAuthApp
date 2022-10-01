package com.oluwatobi.userauthapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.custom_spinner_row.view.*


class CustomAdapter(context: Context, countryCodes: List<CountryCodeData>) : ArrayAdapter<CountryCodeData>(context, 0, countryCodes) {
    override fun getView(position: Int, recycledView: View?, parent: ViewGroup): View {
        return this.createView(position, recycledView, parent)
    }

    override fun getDropDownView(position: Int, recycledView: View?, parent: ViewGroup): View {
        return this.createView(position, recycledView, parent)
    }

    private fun createView(position: Int, recycledView: View?, parent: ViewGroup): View {

        val countryCodes = getItem(position)

        val view = recycledView ?: LayoutInflater.from(context).inflate(
            R.layout.custom_spinner_row,
            parent,
            false
        )

        view.ivFlag.setImageResource(countryCodes!!.image)
        view.tvPopulation.setText(countryCodes.description)

        return view
    }
}
