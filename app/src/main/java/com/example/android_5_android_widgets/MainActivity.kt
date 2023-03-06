package com.example.android_5_android_widgets

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SeekBar
import android.widget.Toast
import com.example.android_5_android_widgets.databinding.ActivityMainBinding
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val ulkeler = ArrayList<String>()

    private lateinit var veriAdaptoru:ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBasla.setOnClickListener {


            startActivity(Intent(this@MainActivity, TahminActivity::class.java));
        }


    }
}