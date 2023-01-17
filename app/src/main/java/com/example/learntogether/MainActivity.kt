package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                Surface {
                    QuadrantScreen()
                }
            }
        }
    }
}

@Composable
fun QuadrantScreen() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
        ) {
            Tile(
                title = "Text composable",
                color = Color.Green,
                explanation = "Displays text and follows Material Design guidelines.",
                modifier = Modifier.weight(1f)
            )
            Tile(
                title = stringResource(R.string.image_compose),
                color = Color.Yellow,
                explanation = stringResource(R.string.image_compose_explanation),
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier
                .weight(1f)
        ) {
            Tile(
                title = stringResource(R.string.row_composable),
                color = Color.Cyan,
                explanation = stringResource(R.string.row_composable_explanation),
                modifier = Modifier.weight(1f)
            )
            Tile(
                title = stringResource(R.string.column_composable),
                color = Color.LightGray,
                explanation = stringResource(R.string.column_composable_explanation),
                modifier = Modifier.weight(1f)
            )
        }
    }

}

@Composable
fun Tile(title: String, color: Color, explanation: String, modifier: Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = explanation,
            textAlign = TextAlign.Justify,
        )
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnTogetherTheme {

    }
}

/**
 *
 * package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContent {
ComposeQuadrantTheme {
// A surface container using the 'background' color from the theme
Surface(color = MaterialTheme.colors.background) {
ComposeQuadrantApp()
}
}
}
}
}

@Composable
fun ComposeQuadrantApp() {
Column(Modifier.fillMaxWidth()) {
Row(Modifier.weight(1f)) {
ComposableInfoCard(
title = stringResource(R.string.first_title),
description = stringResource(R.string.first_description),
backgroundColor = Color.Green,
modifier = Modifier.weight(1f)
)
ComposableInfoCard(
title = stringResource(R.string.second_title),
description = stringResource(R.string.second_description),
backgroundColor = Color.Yellow,
modifier = Modifier.weight(1f)
)
}
Row(Modifier.weight(1f)) {
ComposableInfoCard(
title = stringResource(R.string.third_title),
description = stringResource(R.string.third_description),
backgroundColor = Color.Cyan,
modifier = Modifier.weight(1f)
)
ComposableInfoCard(
title = stringResource(R.string.fourth_title),
description = stringResource(R.string.fourth_description),
backgroundColor = Color.LightGray,
modifier = Modifier.weight(1f)
)
}
}
}

@Composable
private fun ComposableInfoCard(
title: String,
description: String,
backgroundColor: Color,
modifier: Modifier = Modifier
) {
Column(
modifier = modifier
.fillMaxSize()
.background(backgroundColor)
.padding(16.dp),
horizontalAlignment = Alignment.CenterHorizontally,
verticalArrangement = Arrangement.Center
) {
Text(
text = title,
fontWeight = FontWeight.Bold,
modifier = Modifier.padding(bottom = 16.dp)
)
Text(
text = description,
textAlign = TextAlign.Justify
)
}
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantAppPreview() {
ComposeQuadrantTheme {
ComposeQuadrantApp()
}
}

 */