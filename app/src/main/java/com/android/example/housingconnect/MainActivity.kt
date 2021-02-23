package com.android.example.housingconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    // TODO: PHASE 2.4 - late-Initialize HousingService variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: PHASE 2.4 - Create instance of a retrofit service (HousingService) and connect
        //  it as a member variable of the MainActivity to reference is in Fragments
        //  (in other words, initialize the HousingService variable above that was defined
        //  as being late-initialized)

    }
}
