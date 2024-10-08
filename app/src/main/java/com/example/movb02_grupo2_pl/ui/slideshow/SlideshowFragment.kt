package com.example.movb02_grupo2_pl.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.movb02_grupo2_pl.R
import com.example.movb02_grupo2_pl.databinding.FragmentSlideshowBinding



class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val webView = binding.video  // "video" es el ID en tu archivo XML
        val video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/vIQtQjM-9xQ?si=rlIVkGfDAGEKMz1P\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"

        // Configura tu WebView aquí si es necesario
        webView.loadData(video, "text/html", "utf-8")
        webView.settings.javaScriptEnabled = true
        webView.webChromeClient = WebChromeClient()



        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}