package com.doubleclick.newlead.Adapters

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.doubleclick.newlead.android.R

/**
 * Created By Eslam Ghazy on 7/25/2022
 */
class CategoryAdapter(val list: List<String>) :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var selectCategoryTv: TextView = itemView.findViewById(R.id.selectCategoryTv);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.category_layout, parent, false)
        );
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.selectCategoryTv.text = list[position].toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}