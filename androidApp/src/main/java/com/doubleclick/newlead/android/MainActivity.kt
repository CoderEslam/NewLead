package com.doubleclick.newlead.android

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import com.doubleclick.newlead.Greeting
import com.doubleclick.newlead.Views.SmoothButtom.SmoothBottomBar
import kotlinx.android.synthetic.main.activity_main.*

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {

    private lateinit var bottomBar: SmoothBottomBar
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomBar = findViewById(R.id.bottomBar)
        navController = findNavController(this, findViewById<View>(R.id.main_fragment_home).id)


        val appBarConfiguration: AppBarConfiguration = AppBarConfiguration.Builder(
            R.id.profileFragment,
            R.id.myCoursesFragment,
            R.id.homeFragment,
            R.id.coursesFragment,
            R.id.wishlistFragment
        ).build()
        setSupportActionBar(toolbar)
        setupActionBarWithNavController(this, navController, appBarConfiguration)
        setupSmoothBottomMenu(bottomBar)

    }


    private fun setupSmoothBottomMenu(v: View) {
        val popupMenu = PopupMenu(this, v)
        popupMenu.inflate(R.menu.menu_bottom_home)
        val menu = popupMenu.menu
        bottomBar.setupWithNavController(menu, navController)
    }
}
