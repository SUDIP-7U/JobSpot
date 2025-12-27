package com.example.applicationui.ui.alert

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.applicationui.R
import com.example.applicationui.ui.alert.AlertAdapter
import com.example.applicationui.model.NotificationItem

class AlertFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_alert, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.rvNotification)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Sample data for testing
        val sampleData = listOf(
            NotificationItem(
                "New Job Added!",
                "A new job has been uploaded.",
                "25 minutes ago",
                R.drawable.ic_notification
            ),
            NotificationItem(
                "System Update",
                "Your phone has a new update.",
                "1 hour ago",
                R.drawable.ic_notification
            ),
            NotificationItem(
                "Reminder",
                "Don’t forget your meeting tomorrow.",
                "Yesterday",
                R.drawable.ic_notification
            )
        )

        recyclerView.adapter = AlertAdapter(sampleData)
    }
}