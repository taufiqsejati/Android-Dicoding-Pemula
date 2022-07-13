package com.taufiqsejati.mainanpopuler90s

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMainanAdapter(private val listMainan: ArrayList<Mainan>) : RecyclerView.Adapter<ListMainanAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tv_item_title)
        var tvSubtitle: TextView = itemView.findViewById(R.id.tv_item_subtitle)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_mainan, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val mainan = listMainan[position]
        Glide.with(holder.itemView.context)
            .load(mainan.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvTitle.text = mainan.title
        holder.tvSubtitle.text = mainan.subtitle

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listMainan[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listMainan.size
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Mainan)
    }
}