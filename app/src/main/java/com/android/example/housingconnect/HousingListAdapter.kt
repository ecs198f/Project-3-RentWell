package com.android.example.housingconnect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class HousingListAdapter(private var posts: List<Post>) : RecyclerView.Adapter<ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.housing_list_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = posts[position]
        holder.apply {
            // TODO: PHASE 3.1 - Re-define these values based on the the post object being displayed
            housingType.text = "apartment"
            location.text = "555 apartment road, Davis, CA"
            price.text = "2000"
            numOfBeds.text = "3"
            numOfBaths.text = "2"
            covidTested.text = "true"
            // TODO: PHASE 3.1 Use Glide to show an image from the database
            // Glide.with(holder.itemView)
            //    .load("YOUR_URL_HERE" + item.image)
            //    .into(housingImage)
        }

        holder.housingItem.setOnClickListener{
            // TODO: PHASE 3.1 navigate to HousingDisplayFragment and send the Post obect
        }
    }

    override fun getItemCount() = posts.size

    fun setData(newPosts: List<Post>) {
        posts = newPosts
        this.notifyDataSetChanged()
    }
}

class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val housingItem: ConstraintLayout = view.findViewById(R.id.housingItem)
    val housingImage: ImageView = view.findViewById(R.id.housingImage)
    val housingType: TextView = view.findViewById(R.id.housingType)
    val location: TextView = view.findViewById(R.id.address)
    val price: TextView = view.findViewById(R.id.price)
    val numOfBeds: TextView = view.findViewById(R.id.numOfBeds)
    val numOfBaths: TextView = view.findViewById(R.id.numOfBaths)
    val covidTested: TextView = view.findViewById(R.id.covidTested)
}