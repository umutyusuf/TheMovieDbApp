package com.umut.themoviedbapp.tv_shows_ui

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.umut.themoviedbapp.ui.extensions.transact

class SingleFragmentActivity : AppCompatActivity() {

    fun setFragment(fragment: Fragment) {
        supportFragmentManager.transact {
            add(android.R.id.content, fragment)
        }
    }

}