package com.sys1yagi.migrate_to_jetpack_compose.normal

import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class Application : android.app.Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
