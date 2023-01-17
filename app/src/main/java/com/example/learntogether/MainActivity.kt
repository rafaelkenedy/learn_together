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
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),

                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier
                            .wrapContentWidth(align = Alignment.CenterHorizontally)
                            .wrapContentHeight(align = Alignment.CenterVertically),
                    ) {
                        ShowTasCompletedIcon()
                        Message(text = getString(R.string.all_tasks_completed))
                        Phrase(text = getString(R.string.nice_work))
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
fun Message(text: String) {
    Text(
        text = text,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.CenterHorizontally)
            .padding(horizontal = 16.dp)
            .padding(top = 24.dp)
            .padding(bottom = 8.dp)
    )
}

@Composable
fun Phrase(text: String) {
    Text(
        text = text,
        fontSize = 16.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(bottom = 8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnTogetherTheme {

    }
}