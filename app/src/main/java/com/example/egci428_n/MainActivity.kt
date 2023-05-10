package com.example.egci428_n

import android.app.ListActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter

class MainActivity : ListActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val wordList = arrayOf<String>("ABC","BCD")
        val adapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, wordList)
        listAdapter = adapter


    }
}