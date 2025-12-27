package com.example.applicationui.ui.alert

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.applicationui.R
import com.example.applicationui.model.NotificationItem

class AlertAdapter(
    private val items: List<NotificationItem>
) : RecyclerView.Adapter<AlertAdapter.AlertViewHolder>() {

    class AlertViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivNotification: ImageView = itemView.findViewById(R.id.ivNotification)
        val tvTitle: TextView = itemView.findViewById(R.id.tvNotificationTitle)
        val tvMessage: TextView = itemView.findViewById(R.id.tvMessage)
        val tvTimestamp: TextView = itemView.findViewById(R.id.tvTimestamp)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlertViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.alert_card_layout, parent, false)
        return AlertViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlertViewHolder, position: Int) {
        val item = items[position]
        holder.ivNotification.setImageResource(item.iconRes)
        holder.tvTitle.text = item.title
        holder.tvMessage.text = item.message
        holder.tvTimestamp.text = item.timestamp
    }

    override fun getItemCount(): Int = items.size
}