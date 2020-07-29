package com.example.testlocaleapp

import android.app.Application
import android.content.Context
import com.akexorcist.localizationactivity.core.LocalizationApplicationDelegate
import com.akexorcist.localizationactivity.ui.LocalizationApplication
import java.util.*

class TestApp: Application() {
    private val localizationDelegate = LocalizationApplicationDelegate()

    override fun attachBaseContext(base: Context) {
        localizationDelegate.setDefaultLanguage(base, Locale.ENGLISH)
        super.attachBaseContext(localizationDelegate.attachBaseContext(base))
    }
}
