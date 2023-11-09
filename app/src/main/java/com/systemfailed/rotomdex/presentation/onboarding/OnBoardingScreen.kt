package com.systemfailed.rotomdex.presentation.onboarding


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.systemfailed.rotomdex.presentation.common.NewsButton
import com.systemfailed.rotomdex.presentation.common.NewsTextButton
import com.systemfailed.rotomdex.presentation.onboarding.components.OnBoardingPage
import com.systemfailed.rotomdex.presentation.onboarding.components.PageIndicator
import kotlinx.coroutines.launch


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        val pagerState = rememberPagerState(initialPage = 0) {
            pages.size
        }
        val buttonState = remember {
            derivedStateOf {
                when (pagerState.currentPage) {
                    0 -> listOf("", "Continuar")
                    1 -> listOf("", "Vamos a comenzar!")
                    2 -> listOf("Crear cuenta", "Ya tengo cuenta")
                    else -> listOf("", "")
                }
            }
        }

        HorizontalPager(
            state = pagerState,
            Modifier.padding(15.dp),
        ) { index ->
            OnBoardingPage(page = pages[index])
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
                .navigationBarsPadding(),
            horizontalAlignment = CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            PageIndicator(
                modifier = Modifier
                    .width(52.dp)
                    .align(CenterHorizontally),
                pageSize = pages.size,
                selectPage = pagerState.currentPage
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth(),

                verticalArrangement = Arrangement.Center,
                horizontalAlignment = CenterHorizontally,
            ) {
                Spacer(modifier = Modifier.height(25.dp))

                val scope = rememberCoroutineScope()
                if (buttonState.value[0].isNotEmpty()) {
                    NewsTextButton(text = buttonState.value[0],
                        onClick = {
                            scope.launch {
                                pagerState.animateScrollToPage(page = pagerState.currentPage - 1)
                            }
                        }
                    )

                }
                Spacer(modifier = Modifier.height(25.dp))

                NewsButton(
                    text = buttonState.value[1],
                    onClick = {
                        scope.launch {
                            if (pagerState.currentPage == 3) {
                                //Navigate to the main screen and save a value in datastore preferences
                            } else {
                                pagerState.animateScrollToPage(page = pagerState.currentPage + 1)
                            }
                        }
                    }
                )
            }
        }
        Spacer(modifier = Modifier.weight(0.5f))
    }
}

@Preview(showBackground = true)
@Composable
fun OnBoardingPreview() {
    OnBoardingScreen()
}