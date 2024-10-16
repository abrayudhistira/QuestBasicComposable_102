package com.example.questbasiccomposable_102

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.questbasiccomposable_102.ui.theme.QuestBasicComposable_102Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_102Theme {
                Surface(        //Membuat Widget Surface
                    modifier = Modifier.fillMaxSize(), // Membuat Objek modifier dengan fungsi fillMaxsize
                    color = MaterialTheme.colorScheme.background // Menambahkan Tema
                ) {

                }
            }
        }
    }
}

@Composable
fun BasicLayout(modifier: Modifier = Modifier) {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposable_102Theme {
        BasicLayout()
    }
}