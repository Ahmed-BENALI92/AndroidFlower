package fr.AhmedBenali92.androidflower.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import fr.AhmedBenali92.androidflower.MainActivity
import fr.AhmedBenali92.androidflower.PlantModel
import fr.AhmedBenali92.androidflower.R
import fr.AhmedBenali92.androidflower.adapter.PlantAdapter
import fr.AhmedBenali92.androidflower.adapter.plantitemDecoration

class HomeFragment(
    private val context : MainActivity
) : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater?.inflate(R.layout.fragment_home,container,false)
        //une Liste qui va stocker les plantes
        val plantList = arrayListOf<PlantModel>()
        // Enregistrer une premiere plante
        plantList.add(
            PlantModel("Pissenlit",
                "Jaune soleil","https://cdn.pixabay.com/photo/2018/01/19/14/40/nature-3092555_960_720.jpg",true)
        )
        // Enregistrer une seconde plante
        plantList.add(
            PlantModel("rose",
                "ça pique un peu","https://cdn.pixabay.com/photo/2014/04/10/11/24/rose-320868_960_720.jpg",false)
        )
        // Enregistrer une 3 plante
        plantList.add(
            PlantModel("cactuse",
                "ça pique beaucoup","https://media.istockphoto.com/photos/cactus-with-pink-sunglasses-on-blue-picture-id157581094?s=612x612",false)
        )
        // Enregistrer une 4 plante
        plantList.add(
            PlantModel("Tulippe",
                "c'est beau","https://media.istockphoto.com/photos/tulips-in-spring-picture-id1145868430?s=612x612",false)
        )
        //recuperer le recyclerview
        val horizontalRecyclerView = view.findViewById<RecyclerView>(R.id.horizontal_recycler_view)
        horizontalRecyclerView.adapter = PlantAdapter(context ,plantList,R.layout.item_horizental_plant)

        // recuperer le second recyclerview
        val verticalRecyclerView = view.findViewById<RecyclerView>(R.id.vertical_recycler_view)
        verticalRecyclerView.adapter = PlantAdapter(context,plantList ,R.layout.item_vertical_plant)
        verticalRecyclerView.addItemDecoration(plantitemDecoration())
        return view
    }
}