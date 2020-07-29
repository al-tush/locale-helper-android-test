package com.example.testlocaleapp

import android.os.Bundle
import android.widget.Button
import com.akexorcist.localizationactivity.ui.LocalizationActivity
import java.util.*

class MainActivity : LocalizationActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_first).setOnClickListener {
            setLanguage(Locale("ru", "RU"))
        }
    }
}