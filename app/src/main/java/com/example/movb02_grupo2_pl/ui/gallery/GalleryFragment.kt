package com.example.movb02_grupo2_pl.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.movb02_grupo2_pl.R
import com.example.movb02_grupo2_pl.databinding.FragmentGalleryBinding
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // Esta propiedad solo es válida entre onCreateView y onDestroyView
    private val binding get() = _binding!!

    // Lista para almacenar los ítems del carrusel
    val list = mutableListOf<CarouselItem>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        // Infla la vista utilizando ViewBinding
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Importar la vista del carrusel usando binding
        val carousel: ImageCarousel = binding.carousel

        // Agregar ítems a la lista del carrusel
        list.add(CarouselItem("https://cdn.pixabay.com/photo/2023/09/27/10/48/portfolio-8279357_640.jpg"))
        list.add(CarouselItem("https://cdn.pixabay.com/photo/2016/11/29/01/36/businessman-1866582_960_720.jpg"))
        list.add(CarouselItem("https://images.freeimages.com/images/large-previews/15e/factory-1306148.jpg"))

        // Pasar los ítems al carrusel
        carousel.addData(list)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}