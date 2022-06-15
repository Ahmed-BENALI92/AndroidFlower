package fr.AhmedBenali92.androidflower.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import fr.AhmedBenali92.androidflower.R

class PlantAdapter(private val layoutId: Int) : RecyclerView.Adapter<PlantAdapter.ViewHolder>(){
    //boite pour ranger tous les composant a controler
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    {
        //image de notre plant
        val plantImage = view.findViewById<ImageView>(R.id.image_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(layoutId,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {}

    override fun getItemCount(): Int = 5
}