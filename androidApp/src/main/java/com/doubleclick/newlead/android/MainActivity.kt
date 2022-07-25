package com.doubleclick.newlead.android

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.recyclerview.widget.RecyclerView
import com.doubleclick.newlead.Adapters.CategoryAdapter
import com.doubleclick.newlead.Greeting
import com.doubleclick.newlead.Views.SmoothButtom.SmoothBottomBar
import kotlinx.android.synthetic.main.activity_main.*

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {

    private lateinit var bottomBar: SmoothBottomBar
    private lateinit var navController: NavController
    private lateinit var caticories: RecyclerView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomBar = findViewById(R.id.bottomBar)
        caticories = findViewById(R.id.caticories);
        navController =
            findNavController(this, findViewById<View>(R.id.main_fragment_home).id)


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

        val list = listOf(
            "SEO",
            "Content writer",
            "Media Buying",
            "Digital Marketing",
            "English",
            "Germeny"
        ).shuffled();
        caticories.adapter = CategoryAdapter(list);
    }


    private fun setupSmoothBottomMenu(v: View) {
        val popupMenu = PopupMenu(this, v)
        popupMenu.inflate(R.menu.menu_bottom_home)
        val menu = popupMenu.menu
        bottomBar.setupWithNavController(menu, navController)
    }
}
