package com.example.abdallahsarayrah.kotmenuapph

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_context_menu.*

class ContextMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu)

        registerForContextMenu(textView)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)

//        menu?.add(1, 1, 1, "Red / Blue")
//        menu?.add(1, 2, 1, "Green / Yellow")
//        menu?.add(1, 3, 1, "Blue / Red")

        menuInflater.inflate(R.menu.context_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.red_blue -> {
                textView.setTextColor(Color.RED)
                main.setBackgroundColor(Color.BLUE)
            }
            R.id.green_yellow -> {
                textView.setTextColor(Color.GREEN)
                main.setBackgroundColor(Color.YELLOW)
            }
            R.id.blue_red -> {
                textView.setTextColor(Color.BLUE)
                main.setBackgroundColor(Color.RED)
            }
        }

        return super.onContextItemSelected(item)
    }
}
