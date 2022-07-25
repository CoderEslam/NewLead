package com.doubleclick.newlead.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.doubleclick.newlead.android.R

/**
 * Created By Eslam Ghazy on 7/25/2022
 */
class CourseAdapter : RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {
    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        return CourseViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.course_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 20;
    }
}