package com.example.learntogether

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                Surface {
                    LearnScreen()
                }
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
fun ShowTasCompletedIcon() {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top)
    )
}

@Composable
fun LearnScreen() {
    Column(
        modifier = Modifier.fillMaxHeight()
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
        ) {
            Tile(
                title = "Text composable",
                color = Color.Green,
                explanation = "Displays text and follows Material Design guidelines.",
                width = 0.5f
            )
            Tile(
                title = stringResource(R.string.image_compose),
                color = Color.Yellow,
                explanation = stringResource(R.string.image_compose_explanation),
                width = 1f
            )
        }

        Row(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            Tile(
                title = stringResource(R.string.row_composable),
                color = Color.Cyan,
                explanation = stringResource(R.string.row_composable_explanation),
                width = 0.5f
            )
            Tile(
                title = stringResource(R.string.column_composable),
                color = Color.LightGray,
                explanation = stringResource(R.string.column_composable_explanation),
                width = 1f
            )
        }
    }

}

@Composable
fun Tile(title: String, color: Color, explanation: String, width: Float) {
    Column(
        modifier = Modifier
            .background(color)
            .fillMaxWidth(width)
            .fillMaxHeight()
            .wrapContentWidth(align = Alignment.CenterHorizontally)
            .wrapContentHeight(align = Alignment.CenterVertically)
            .padding(horizontal = 16.dp),
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .background(Color.Gray), textAlign = TextAlign.Center
        )
        Text(
            text = explanation,
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth(),
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