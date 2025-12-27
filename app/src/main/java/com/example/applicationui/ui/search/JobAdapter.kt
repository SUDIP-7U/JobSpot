package com.example.applicationui.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.applicationui.databinding.JobDetailCardBinding

class JobAdapter(
    private var jobs: List<String> // simple list of job titles for now
) : RecyclerView.Adapter<JobAdapter.JobViewHolder>() {

    inner class JobViewHolder(val binding: JobDetailCardBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val binding = JobDetailCardBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return JobViewHolder(binding)
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        val jobTitle = jobs[position]
        holder.binding.tvJobRole.text = jobTitle
        // If your card has more views (company, location, etc.), bind them here
    }

    override fun getItemCount(): Int = jobs.size

    fun updateList(newJobs: List<String>) {
        jobs = newJobs
        notifyDataSetChanged()
    }
}