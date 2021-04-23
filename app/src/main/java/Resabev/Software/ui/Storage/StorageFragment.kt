package Resabev.Software.ui.Storage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import Resabev.Software.R
import Resabev.Software.ui.Home.HomeViewModel

class StorageFragment : Fragment() {

    private lateinit var storageViewModel: StorageViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        storageViewModel =
            ViewModelProvider(this).get(StorageViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_storage, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        storageViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}