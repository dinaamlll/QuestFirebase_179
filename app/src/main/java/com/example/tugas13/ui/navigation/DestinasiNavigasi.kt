package com.example.tugas13.ui.navigation

interface DestinasiNavigasi {
    val route: String
    val titleRes: String
}
object DestinasiHome : DestinasiNavigasi {
    override val route: String = "home"
    override val titleRes: String = "Home"
}