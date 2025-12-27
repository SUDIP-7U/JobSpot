package com.example.applicationui.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.applicationui.R

class JobShowcaseAdapter(private val itemCount: Int = 5) :
    RecyclerView.Adapter<JobShowcaseAdapter.JobViewHolder>() {

    class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.job_detail_card, parent, false) // <-- your XML file name
        return JobViewHolder(view)
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        // No binding logic, just showcasing layout
    }

    override fun getItemCount(): Int = itemCount
}