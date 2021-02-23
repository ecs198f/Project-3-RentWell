package com.android.example.housingconnect

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_form_image.*


class FormImageFragment : Fragment() {

    var imageUri: Uri? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_form_image, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO: PHASE 6.1 - Get an instance of the singleton housingService defined in the MainActivity


        // TODO: PHASE 6.1 - set an OnClickListener on the upload Image Button and start an implicit
        //  intent that will pick an image from the users gallery. Make sure to match the request code
        //  used in onActivityResult (which is 2020)


        // TODO: PHASE 3.2 - when a user clicks 'done' navigate the user to the HousingFeedFragment
        //  we will do more than this in a future phase. In PHASE 6.2 - instead of navigating in the
        //  onClickListener, call postImage() and only navigate when you successfully upload the
        //  image and data onto the server.

    }

    fun postImage() {
        if (imageUri == null) {
            return
        }

        // TODO: PHASE 6.2 - Use a content resolver to read image data and extension from the resource URI


        // TODO: PHASE 6.2 - Create a Multipart Body that contains the image data and type


        // TODO: PHASE 6.2 - Call the image upload endpoint from your housingService API and when the
        //  image is successfully uploaded save the returned path to the image into the post object
        //  to send to the server.
        // TODO: PHASE 7 - Then make use the housing endpoint to upload the housing listing
        //  onto the server (with a path to the image and everything else as well).

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 2020) {
            if (resultCode == Activity.RESULT_OK) {
                imageUri = data!!.data
                housingImage.setImageURI(imageUri)
            }
        }
    }
}