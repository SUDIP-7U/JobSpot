package com.example.applicationui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.applicationui.data.Project
import com.example.applicationui.databinding.ItemProjectBinding


class ShowcaseAdapter(
    private val projects: List<Project>
) : RecyclerView.Adapter<ShowcaseAdapter.ProjectViewHolder>() {

     class ProjectViewHolder(val binding: ItemProjectBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val binding = ItemProjectBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ProjectViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        val project = projects[position]
        holder.binding.tvProjectTitle.text = project.title
        holder.binding.tvProjectDescription.text = project.description
    }

    override fun getItemCount(): Int = projects.size
}
