package com.example.android_5_android_widgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_5_android_widgets.databinding.ActivitySonucBinding
import com.example.android_5_android_widgets.databinding.ActivityTahminBinding

class SonucActivity : AppCompatActivity() {

    lateinit var binding: ActivitySonucBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySonucBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sonuc = intent.getBooleanExtra("Sonuc", false)

        if(sonuc){
            binding.textViewSonuc.text = "KAZANDINIZ"
            binding.imageViewSonuc.setImageResource(R.drawable.mutlu_resim)
        }else{
            binding.textViewSonuc.text = "KAYBETTİNİZ"
            binding.imageViewSonuc.setImageResource(R.drawable.uzgun_resim)
        }

        binding.buttonTekrar.setOnClickListener {


            val intent = Intent(this@SonucActivity, TahminActivity::class.java)



            finish()
            startActivity(intent)
        }
    }
}