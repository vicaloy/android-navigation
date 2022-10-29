package com.valoy.navigation

import android.app.Application
import com.valoy.tutorial.ui.TutorialModule

class NavigationApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        TutorialModule.init {  }
    }
}