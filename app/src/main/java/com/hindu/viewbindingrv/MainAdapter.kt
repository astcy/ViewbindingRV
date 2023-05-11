package com.hindu.viewbindingrv

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hindu.viewbindingrv.databinding.RecyclerviewItemBinding

class MainAdapter: RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    inner class MainViewHolder(val itemBinding: RecyclerviewItemBinding)
        :RecyclerView.ViewHolder(itemBinding.root){
           fun bindItem(task: Task){
               itemBinding.tittleTv.text = task.title
               itemBinding.timeTv.text = task.timestamp
           }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}