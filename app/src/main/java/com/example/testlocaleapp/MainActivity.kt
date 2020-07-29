package com.example.testlocaleapp

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.zeugmasolutions.localehelper.LocaleAwareCompatActivity
import java.util.*

class MainActivity : LocaleAwareCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_first).setOnClickListener {
            updateLocale(Locale("ru", "RU"))
        }
    }
}