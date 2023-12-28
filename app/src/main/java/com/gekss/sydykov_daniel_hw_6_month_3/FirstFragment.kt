package com.gekss.sydykov_daniel_hw_6_month_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gekss.sydykov_daniel_hw_6_month_3.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private val carsList = arrayListOf(
        Cars("https://ru.wikipedia.org/wiki/Bugatti_Chiron","Буггати"),
        Cars("https://ru.wikipedia.org/wiki/Ferrari_F8","Ферарри"),
        Cars("https://ru.wikipedia.org/wiki/Nissan_Patrol","Ниссан"),
        Cars("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSH9WXtmNobcUQVIyHgtvcdv5yjzUiuvHyL6qrpnF5frw&s","Мерседес"),
        Cars("https://www.bmw.kg/content/dam/bmw/common/all-models/m-series/series-overview/bmw-m-series-seo-overview-ms-04.jpg","Бмв")
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = CarsAdapter(carsList)
        binding.rvCars.adapter = adapter
    }
}