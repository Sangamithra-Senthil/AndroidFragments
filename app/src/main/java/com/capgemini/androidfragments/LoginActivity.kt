package com.capgemini.androidfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }



    fun buttonClick(view: View) {
        when(view.id){
            R.id.loginB->{
                Toast.makeText(this, "Login button clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.registerB->{
                //add fragment
                val transaction= supportFragmentManager.beginTransaction()
                val frag = RegisterFragment()
                transaction.replace(R.id.parentL,frag)
                transaction.commit()
            }
        }
    }
}