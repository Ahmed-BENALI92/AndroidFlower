package fr.AhmedBenali92.androidflower.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import fr.AhmedBenali92.androidflower.R
import fr.AhmedBenali92.androidflower.adapter.PlantAdapter
import fr.AhmedBenali92.androidflower.adapter.plantitemDecoration

class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater?.inflate(R.layout.fragment_home,container,false)
        //recuperer le recyclerview
        val horizontalRecyclerView = view.findViewById<RecyclerView>(R.id.horizontal_recycler_view)
        horizontalRecyclerView.adapter = PlantAdapter(R.layout.item_horizental_plant)

        // recuperer le second recyclerview
        val verticalRecyclerView = view.findViewById<RecyclerView>(R.id.vertical_recycler_view)
        verticalRecyclerView.adapter = PlantAdapter(R.layout.item_vertical_plant)
        verticalRecyclerView.addItemDecoration(plantitemDecoration())
        return view
    }
}