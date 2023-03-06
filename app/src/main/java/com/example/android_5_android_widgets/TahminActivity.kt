package com.example.android_5_android_widgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.android_5_android_widgets.databinding.ActivityMainBinding
import com.example.android_5_android_widgets.databinding.ActivityTahminBinding
import kotlin.random.Random

class TahminActivity : AppCompatActivity() {

    lateinit var binding: ActivityTahminBinding

    private var rastgeleSayi = 0
    private var sayac = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTahminBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rastgeleSayi = Random.nextInt(0,101) // 0-100
        Log.e("Rastgele Sayı " ,rastgeleSayi.toString())


        binding.buttonTahmin.setOnClickListener {

            /*
            val intent = Intent(this@TahminActivity, SonucActivity::class.java)
            finish()
            startActivity(intent)*/

            sayac--

            val tahmin = binding.editTextGirdi.text.toString().toInt()

            if(tahmin == rastgeleSayi){
                val intent = Intent(this@TahminActivity, SonucActivity::class.java)
                intent.putExtra("Sonuc", true)
                finish()
                startActivity(intent)

                return@setOnClickListener  // burası çalışırsa aşağıdaki kodlar çalışmaz
            }
            if(tahmin > rastgeleSayi){
                binding.textViewYardim.text = "Azalt"
                binding.textViewKalanHak.text = "Kalan Hak: $sayac"
            }
            if(tahmin < rastgeleSayi){
                binding.textViewYardim.text = "Arttır"
                binding.textViewKalanHak.text = "Kalan Hak: $sayac"
            }
            if (sayac == 0){
                val intent = Intent(this@TahminActivity, SonucActivity::class.java)
                intent.putExtra("Sonuc", false)
                finish()
                startActivity(intent)
            }

            binding.editTextGirdi.setText("")
        }
    }
}