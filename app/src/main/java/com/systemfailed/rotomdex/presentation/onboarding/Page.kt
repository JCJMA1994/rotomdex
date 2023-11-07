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
        title = "Todos os Pokémons em um só Lugar",
        description = "Acesse uma vasta lista de Pokémon de \n" +
                "todas as gerações já feitas pela Nintendo",
        image = R.drawable.ash_johto
    ),
    Page(
        title = "Mantenha sua Pokédex atualizada",
        description = "Cadastre-se e mantenha seu perfil, \n" +
                "pokémon favoritos, configurações e muito mais, salvos no aplicativo, mesmo sem conexão com a internet.",
        image = R.drawable.dawn
    ),
    Page(
        title = "Está pronto para essa aventura?",
        description = "Basta criar uma conta e começar a explorar o mundo dos Pokémon hoje!",
        image = R.drawable.interviewers
    )
)
