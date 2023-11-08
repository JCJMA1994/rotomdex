package com.systemfailed.rotomdex.presentation.onboarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.systemfailed.rotomdex.ui.theme.BlueColorButton
import com.systemfailed.rotomdex.ui.theme.BlueGray


@Composable
fun PageIndicator(
    modifier: Modifier = Modifier,
    pageSize: Int,
    selectPage: Int,
    selectColor: Color = BlueColorButton,
    unSelectColor: Color = BlueGray
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        repeat(times = pageSize) { page ->
            Box(
                modifier = Modifier
                    .size(14.dp)
                    .clip(CircleShape)
                    .background(color = if (page == selectPage) selectColor else unSelectColor)
            )
        }

    }

}