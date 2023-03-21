package br.senai.sp.jandira.lazyproduct.model

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

data class Product(
    val id: Int = 0,
    val name: String =  "",
    val description: String = "Está é a decriçao do produto",
    val price: Double = 0.0,
    val image: Painter? = null
)



