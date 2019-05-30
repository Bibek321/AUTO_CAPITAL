package com.example.iteradmin.auto_capital

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val state = arrayOf("Andhra Pradesh", "Arunanchal Pradesh", "Assam", "Bihar",
                "Chhattisgarh","Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir",
                "Jharkhand","Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur",
                "Meghalaya","Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim",
                "Tamil Nadu","Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal")
        val search = findViewById<AutoCompleteTextView>(R.id.states)
        val adp = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,state)

        search.setAdapter(adp)
        search.threshold = 1

        val capital = arrayOf("Hyderbad", "Itanagar", "Dispur", "Patna","Raipur", "Panaji",
                "Gandhinagar", "Chandigarah", "Shimla","Srinagar","Ranchi","Bengaluru","Thiruvananthapuram",
                "Bhopal","Mumbai","Imphal","Shilong","Aizawl","Kohima","Bhubaneswar","Chandigarh",
                "Jaipur","Gangtok","Chennai","Hyderabad","Agartala","Lucknow","Dehradun","Kolkata")
        val text = findViewById<TextView>(R.id.capital)
        search.setOnItemClickListener { parent, view, position, id ->
            for (i in 0..28)
                if (parent.getItemAtPosition(position).toString() == state[i].toString()) {
                    text.setText(capital[i].toString())
                }
        }
    }
}