package com.beyzanurcelebi.hesapmakinesi

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.beyzanurcelebi.hesapmakinesi.databinding.ActivityMainBinding
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var number1 : Double? = null
    var number2 : Double? = null
    var sonuc : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



    }

    fun toplama(view:View){

        number1 = binding.editText.text.toString().toDoubleOrNull()
        number2 = binding.editText2.text.toString().toDoubleOrNull()

        if(number1 != null&&number2 != null) {
            sonuc=number1!!+number2!!
            binding.textView.text = "Sonuç: ${sonuc}"
        } else {
            binding.textView.text = "sayilari girin"

        }

    }

    fun cikarma(view:View){

        number1 = binding.editText.text.toString().toDoubleOrNull()
        number2 = binding.editText2.text.toString().toDoubleOrNull()

        if(number1!= null&&number2 != null) {
            sonuc=number1!!-number2!!
            binding.textView.text = "Sonuç: ${sonuc}"
        } else {
            binding.textView.text = "sayilari girin"

        }


    }

    fun carpma (view : View){
        number1 = binding.editText.text.toString().toDoubleOrNull()
        number2 = binding.editText2.text.toString().toDoubleOrNull()

        if(number1!= null&&number2 != null) {
            sonuc=number1!!* number2!!
            binding.textView.text = "Sonuç: ${sonuc}"
        } else {
            binding.textView.text = "sayilari girin"

        }

    }

    fun bolme(view : View){

        number1 = binding.editText.text.toString().toDoubleOrNull()
        number2 = binding.editText2.text.toString().toDoubleOrNull()

        if(number1!= null&&number2 != null) {
            sonuc=number1!!/number2!!
            binding.textView.text = "Sonuç: ${sonuc}"
        } else {
            binding.textView.text = "sayilari girin"

        }


    }
}