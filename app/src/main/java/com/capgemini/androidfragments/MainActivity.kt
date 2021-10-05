package com.capgemini.androidfragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add("Login")
        menu?.add("Exit")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.title) {
            "Login" -> {
                val i =Intent(this,LoginActivity::class.java)
                startActivity(i)
            }
            "Exit" -> {

            }
        }


        return super.onOptionsItemSelected(item)
    }
}
