package com.example.navigationdraweractivity.ui.share

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.navigationdraweractivity.R

//  Fragment para la opción de compartir
class ShareFragment : Fragment() {

    //  Se declara una variable que contendrá el modelo correspondiente
    private lateinit var shareViewModel: ShareViewModel

    //  Sobreescribe un método propio de la clase Fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //  Se instancia la variable para el modelo para recogerlo y almacenarlo en la misma
        shareViewModel =
            ViewModelProviders.of(this).get(ShareViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_share, container, false)
        val textView: TextView = root.findViewById(R.id.text_share)
        //  Se crea un observador para tener en cuenta el texto del modelo
        shareViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}