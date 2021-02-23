package com.android.example.housingconnect

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class HousingFeedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_housing_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // TODO: PHASE 3.1 - Connect adapter and layoutManager to the RecyclerView defined in xml


        // TODO: PHASE 3.1 - Add onClickListener to Post Button and navigate to signin page or
        //  the start of the form (FormLocationFragment)


        // TODO: PHASE 4 - Get an instance of the singleton housingService defined in the MainActivity


        // TODO: PHASE 4 - using the housingService to fetch all Housing Listing from the server
        //  make sure to update the recycler views adapter
    }
}
