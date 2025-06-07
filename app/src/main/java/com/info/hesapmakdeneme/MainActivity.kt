package com.info.hesapmakdeneme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.info.hesapmakdeneme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    var deger1:Double? = null
    var deger2:Double? = null
    var degerSonuc:Double? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.topla.setOnClickListener {
            deger1 = binding.num1.text.toString().toDoubleOrNull()
            deger2 = binding.num2.text.toString().toDoubleOrNull()

            if (deger1!=null && deger2!=null){
                degerSonuc = deger1!! + deger2!!
                binding.myTextSonuc.text = "Result : ${degerSonuc}"
            }else{
                binding.myTextSonuc.text = "Enter Your Number!"
            }


        }
        binding.carp.setOnClickListener {
            deger1 = binding.num1.text.toString().toDoubleOrNull()
            deger2 = binding.num2.text.toString().toDoubleOrNull()

            if (deger1!=null && deger2!=null){
                degerSonuc = deger1!! * deger2!!
                binding.myTextSonuc.text = "Result : ${degerSonuc}"
            }else{
                binding.myTextSonuc.text = "Enter Your Number!"
            }
        }

        binding.bol.setOnClickListener {
            deger1 = binding.num1.text.toString().toDoubleOrNull()
            deger2 = binding.num2.text.toString().toDoubleOrNull()

            if (deger1!=null && deger2!=null){
                degerSonuc = deger1!! - deger2!!
                binding.myTextSonuc.text = "Result : ${degerSonuc}"
            }else{
                binding.myTextSonuc.text = "Enter Your Number!"
            }
        }


    }
    fun cıkar(view: View){
        deger1 = binding.num1.text.toString().toDoubleOrNull()
        deger2 = binding.num2.text.toString().toDoubleOrNull()

        if (deger1!=null && deger2!=null){
            degerSonuc = deger1!! - deger2!!
            binding.myTextSonuc.text = "Result : ${degerSonuc}"
        }else{
            binding.myTextSonuc.text = "Enter Your Number!"
        }

    }

}