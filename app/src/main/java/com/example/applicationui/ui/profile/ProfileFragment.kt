package com.example.applicationui.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.applicationui.ui.profile.ShowcaseAdapter
import com.example.applicationui.databinding.FragmentProfileBinding
import com.example.applicationui.model.Project

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Dummy 5 projects
        val projects = listOf(
            Project("E‑Commerce App", "Shopping app with cart"),
            Project("Fun-Hub", "Real-time Database using Firebase"),
            Project("Weather App", "Shows live weather with location support"),
            Project("Apple Store", "Shows 30 products"),
            Project("Task Manager", "Expanse Tracker App with notifications")
        )

        binding.collectionRecyclerview.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = ShowcaseAdapter(projects)
            setHasFixedSize(true)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}