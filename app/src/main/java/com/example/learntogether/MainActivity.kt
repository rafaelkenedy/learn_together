package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        BackgroundImage()
                        Title(title = getString(R.string.jetpack_compose_tutorial))
                        Paragraph(
                            text = getString(R.string.jetpack_compose_explanation)
                        )
                        Paragraph(
                            text = getString(R.string.jetpack_compose_conclusion)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ScreenOne() {

}

@Composable
@Preview(showBackground = true)
fun BackgroundImage() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top)
    )
}

@Composable
fun Title(title: String) {
    Text(
        text = title,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .padding(top = 16.dp)
            .padding(bottom = 8.dp)
    )
}

@Composable
fun Paragraph(text: String) {
    Text(
        text = text,
        fontSize = 16.sp,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(horizontal = 16.dp)
        .padding(top = 8.dp)
        .padding(bottom = 8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnTogetherTheme {
        BackgroundImage()
    }
}