package com.example.questbasiccomposable_102

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
                    BasicLayout() //Memanggil Class BasicLayout
                }
            }
        }
    }
}

@Composable
fun BasicLayout(modifier: Modifier = Modifier) { //Class Basic Layout untuk membuat tampilan
    Column ( //Layout berupa Column
        horizontalAlignment = Alignment.CenterHorizontally, // Semua elemen dalam kolom diatur center atau di tengah secara horizontal
        verticalArrangement = Arrangement.Center, // Semua elemen dalam kolom diatur center atau di tengah secara vertikal
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposable_102Theme {
        BasicLayout()
    }
}