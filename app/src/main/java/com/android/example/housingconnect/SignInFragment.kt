package com.android.example.housingconnect

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SignInFragment : Fragment() {

    // TODO: PHASE 5 - add firebase connection (follow prompt and demo material)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO: PHASE 3.4 - navigate to the FormLocationFragment when the user clicks the sign in
        //  button. there will be more involved during Phase 5

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

    }


    // TODO: PHASE 5.2 - uncomment this section
//    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) { // Take in a Task API of Type GoogleSignInAccount
//        try {
//            val account = completedTask.getResult(ApiException::class.java)!! // Use complete task API to check method calls
//            Log.w("Google Sign-in", "Sign-in successful")
//            firebaseAuthWithGoogle(account.idToken!!)
//        } catch (e: ApiException) {
//            // The ApiException status code indicates the detailed failure reason.
//            // Please refer to the GoogleSignInStatusCodes class reference for more information.
//            Log.w("Google Sign-in", "signInResult:failed code=" + e.statusCode)
//        }
//    }

    // TODO: PHASE 5.2 - uncomment this section
//    private fun firebaseAuthWithGoogle(idToken: String) {
//        val credential = GoogleAuthProvider.getCredential(idToken, null)
//        Firebase.auth.signInWithCredential(credential)
//            .addOnCompleteListener(requireActivity()) { task ->
//                if (task.isSuccessful) {
//                    // Sign in success, update UI with the signed-in user's information
//                    Log.d(tag, "signInWithCredential:success")
//                    findNavController().navigate(R.id.action_loginFragment_to_createPostFragment)
//                } else {
//                    // If sign in fails, display a message to the user.
//                    Log.w(tag, "signInWithCredential:failure", task.exception)
//                    Snackbar.make(requireView(), "Authentication Failed.", Snackbar.LENGTH_SHORT).show()
//                }
//            }
//    }


}