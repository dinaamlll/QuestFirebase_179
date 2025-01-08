package com.example.tugas13

import android.app.Application
import com.example.tugas13.di.AppContainer
import com.example.tugas13.di.MahasiswaContainer

class MahasiswaApplications: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}