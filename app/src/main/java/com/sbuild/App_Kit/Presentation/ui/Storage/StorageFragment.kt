package Resabev.Software.ui.Storage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.sbuild.App_Kit.R

class StorageFragment : Fragment() {

    private lateinit var storageViewModel: StorageViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        storageViewModel =
            ViewModelProvider(this).get(StorageViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        return root
    }
}