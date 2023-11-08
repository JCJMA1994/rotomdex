package com.systemfailed.rotomdex.presentation.onboarding

import androidx.annotation.DrawableRes
import com.systemfailed.rotomdex.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Todos los Pokemon en un solo lugar",
        description = "Accede a una amplia lista de Pokemon de todas las generaciones creada por Nintendo",
        image = R.drawable.ash_johto
    ),
    Page(
        title = "Mantén tu Pokédex actualizada",
        description = "Regístrate y mantén tu perfil, Pokemon favoritos, configuraciones y mucho más guardados en la aplicación, incluso sin conexión a Internet.",
        image = R.drawable.dawn
    ),
    Page(
        title = "¿Estás listo para esta aventura?",
        description = "¡Simplemente crea una cuenta y comienza a explorar el mundo de Pokemon hoy!",
        image = R.drawable.interviewers
    )
)
