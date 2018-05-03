package com.example.abdallahsarayrah.kotmenuapph

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.copy -> Toast.makeText(this, "Copy", Toast.LENGTH_SHORT).show()
            R.id.cut -> Toast.makeText(this, "cut", Toast.LENGTH_SHORT).show()
            R.id.paste -> Toast.makeText(this, "paste", Toast.LENGTH_SHORT).show()

        }

        return super.onOptionsItemSelected(item)
    }
}
