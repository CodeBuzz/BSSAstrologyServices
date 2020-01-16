package com.example.bssastrologyservices.ui.tools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.bssastrologyservices.R
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.fragment_tools.*


class ToolsFragment : Fragment() {

    private lateinit var toolsViewModel: ToolsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        toolsViewModel =
            ViewModelProviders.of(this).get(ToolsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tools, container, false)



      //  val fragmentAdapter= MyPagerAdapter(getSupportFragmentManager())
         //   viewpager_main.adapter = fragmentAdapter
/*        val textView: TextView = root.findViewById(R.id.text_tools)
        toolsViewModel.text.observe(this, Observer {
            textView.text = it
        })*/

       // tabs_main.setupWithViewPager(viewpager_main)
        return root
    }
}