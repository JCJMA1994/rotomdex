package com.systemfailed.rotomdex.presentation.onboarding.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.systemfailed.rotomdex.R
import com.systemfailed.rotomdex.presentation.onboarding.Page
import com.systemfailed.rotomdex.presentation.onboarding.pages

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    page: Page
) {
    Column(
        modifier = modifier,
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .align(Alignment.CenterHorizontally),
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Fit,
        )
        Spacer(modifier = Modifier.height(0.5.dp))

        Text(
            text = page.title,
            modifier = Modifier.padding(horizontal = 30.dp),
            style = MaterialTheme.typography.titleLarge.copy(
                fontFamily = FontFamily.SansSerif,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            ),
            color = colorResource(id = R.color.black),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = page.description,
            modifier = Modifier.padding(horizontal = 30.dp),
            style = MaterialTheme.typography.titleMedium.copy(
                fontFamily = FontFamily.Serif,
                fontSize = 14.sp,
            ),
            color = colorResource(id = R.color.black),
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OnBoardingPagePreview() {
    OnBoardingPage(page = pages[0])
}