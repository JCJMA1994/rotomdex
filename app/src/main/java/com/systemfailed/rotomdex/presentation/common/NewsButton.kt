package com.systemfailed.rotomdex.presentation.common

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.systemfailed.rotomdex.ui.theme.BlueColorButton


@Composable
fun NewsButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = BlueColorButton,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(size = 12.dp),
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(
                fontWeight = FontWeight.SemiBold,
                fontSize = 26.sp

            )
        )
    }
}


@Composable
fun NewsTextButton(
    text: String,
    onClick: () -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        shape = RoundedCornerShape(size = 12.dp),
        border = BorderStroke(width = 2.dp,
            brush = Brush.horizontalGradient(
                listOf(
                   BlueColorButton,
                    BlueColorButton
                )
        )),

    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(
                fontWeight = FontWeight.SemiBold,
                fontSize = 26.sp
            ),
            color = BlueColorButton
        )
    }
}