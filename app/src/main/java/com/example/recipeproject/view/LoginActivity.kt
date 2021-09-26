package com.example.recipeproject.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.recipeproject.R
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
	private lateinit var auth: FirebaseAuth
	private lateinit var googleSignInClient: GoogleSignInClient
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_login)

		val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
			.requestIdToken(getString(R.string.default_web_client_id))
			.requestEmail()
			.build()
		googleSignInClient = GoogleSignIn.getClient(this, gso)
		auth = Firebase.auth
		signInButton.setOnClickListener {
			signIn()
		}
	}




	override fun onStart() {
		super.onStart()
		// Check if user is signed in (non-null) and update UI accordingly.
		val currentUser = auth.currentUser
	}

	private fun signIn() {
		val signInIntent = googleSignInClient.signInIntent
		startActivityForResult(signInIntent, RC_SIGN_IN)
	}



	private fun firebaseAuthWithGoogle(idToken:String){
		val credential = GoogleAuthProvider.getCredential(idToken,null)
		auth.signInWithCredential(credential).addOnCompleteListener { task->
			if (task.isSuccessful){
				val user=auth.currentUser
				updateUI()
			}

		}
	}

	/**
	 * Dispatch incoming result to the correct fragment.
	 */
	override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
		super.onActivityResult(requestCode, resultCode, data)
		if (requestCode== RC_SIGN_IN){
			val task=GoogleSignIn.getSignedInAccountFromIntent(data)
			try {
				val account=task.getResult(ApiException::class.java)
				firebaseAuthWithGoogle(account?.idToken!!)
			}catch (e:ApiException){
				Log.d(TAG, "onActivityResult: Error")
			}
		}
	}
	fun updateUI(){
		val intent = Intent(this@LoginActivity,MainActivity::class.java)

		startActivity(intent)
	}



	companion object {
		private const val TAG = "GoogleActivity"
		private const val RC_SIGN_IN = 9001
	}
}