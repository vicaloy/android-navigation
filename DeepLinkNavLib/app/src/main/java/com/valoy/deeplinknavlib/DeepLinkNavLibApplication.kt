package com.valoy.deeplinknavlib

import android.app.Application
import com.valoy.tutorial.ui.TutorialModule

class DeepLinkNavLibApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        TutorialModule.init {  }
    }
}