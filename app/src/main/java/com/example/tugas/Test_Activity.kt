package com.example.tugas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Test_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val fragmentManager = supportFragmentManager
        val fragmentEquipper = FragmentEquipper()
        val fragment = fragmentManager.findFragmentByTag(FragmentEquipper::class.java.simpleName)

        if(fragment !is FragmentEquipper){
            fragmentManager
                .beginTransaction()
                .add(R.id.container, fragmentEquipper, FragmentEquipper::class.java.simpleName)
                .commit()
        }
    }
}