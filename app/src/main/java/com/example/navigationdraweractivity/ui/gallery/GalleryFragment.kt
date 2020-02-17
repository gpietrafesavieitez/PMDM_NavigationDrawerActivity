package com.example.navigationdraweractivity.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.navigationdraweractivity.R

//  Fragment de la galería
class GalleryFragment : Fragment() {
    //  Se declara una variable que contendrá el modelo correspondiente
    private lateinit var galleryViewModel: GalleryViewModel

    //  Sobreescribe un método propio de la clase Fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //  Se instancia la variable para el modelo para recogerlo y almacenarlo en la misma
        galleryViewModel =
            ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        //  Se crea un observador para tener en cuenta el texto del modelo
        galleryViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}