package com.android.example.housingconnect

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Post(
        var id: Int
        // TODO PHASE 2.2 - Define all the columns that are define in the database on the server
        //      make sure to write the names of the variables exactly like they are written on
        //      the server
) : Parcelable
