package com.gate.plugin.junkcode

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

class AppApplication : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}