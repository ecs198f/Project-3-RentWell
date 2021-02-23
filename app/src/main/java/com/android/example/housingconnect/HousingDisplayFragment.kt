package com.android.example.housingconnect

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class HousingDisplayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_housing_display, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO: PHASE 3.3 - Use Glide to display the image stored in the Post

        // TODO: PHASE 3.3 - Dynamically update information showing in the xml using the Post object data fields

        // TODO: PHASE 3.3 - Create an onclick listener on a button to send an email.
        //  this stage will require sending an implicit intent to an email application.
        //  recall that you can find common intents on the android documentation

    }
}