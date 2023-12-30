
package com.example.demolibhisabirsyadulmurid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demolibhisabirsyadulmurid.databinding.ActivityMainBinding
import com.andihasan7.lib.irsyadulmurid.AwalBulan.IrsyadBulan
import com.andihasan7.lib.konversi.Konversi

public class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    
    val month = 9
    val year = 1445
    val lat = -7.43333333334
    val long = 111.4333333334
    val elev = 150
    val tz = 7
    val check = true
    
    private val binding: ActivityMainBinding
    
      get() = checkNotNull(_binding) { "Activity has been destroyed" }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate and get instance of binding
        _binding = ActivityMainBinding.inflate(layoutInflater)

        // set content view to binding's root
        setContentView(binding.root)
        
        
        val bulan = IrsyadBulan(
            month,
            year,
            lat,
            long,
            tz,
            elev,
            check
        )
        
        val prediksi = bulan.awalBulanPrediksi()
        
        val tinggiHilal = bulan.tinggiHakiki()
        val dmsTinggiHilal = Konversi().toDegreeFullRound2(tinggiHilal)
        
        binding.hasilBulanTahun.text = "$month, $year"
        binding.hasilPrediksi.text = prediksi
        binding.hasilTinggiHilal.text = dmsTinggiHilal
    }
    
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
