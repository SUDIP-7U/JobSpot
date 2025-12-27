package com.example.applicationui.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.applicationui.ui.home.JobShowcaseAdapter
import com.example.applicationui.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        _binding = FragmentHomeBinding.inflate(inflater,
            container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Setup RecyclerView with showcase adapter (no data, just layout)
        binding.rvRecentJobs.layoutManager = LinearLayoutManager(requireContext())
        binding.rvRecentJobs.adapter = JobShowcaseAdapter(5) // show 5 job cards
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}