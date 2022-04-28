package com.example.myapplication

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Surface
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.widget.AppCompatTextView
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.widget.TextViewCompat
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.myapplication.models.Message
import com.example.myapplication.models.SampleData
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Feed(SampleData().getMessages())
                }
            }
        }
    }
}


@Composable
fun Feed(messages:List<Message>){
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }
}

@Composable
fun MessageCard(message: Message) {
    Row(Modifier.padding(Dp(10F))) {
        message.reblog?.let {
            Text("${it.account.display_name} ReTruthed")
        }
    }
    Row(
        Modifier.height(Dp(50F))
    ) {
        AsyncImage(model = ImageRequest.Builder(LocalContext.current)
            .data("${message.account.avatar}")
            .build(),
            modifier = Modifier.padding(Dp(3F)),
            contentDescription = "null")
        Column {
            Text(text = "${message.account.display_name}")
            Text(text = "@${message.account.acct}")
        }
    }
    Row {
        AndroidView(factory = {
            WebView(it).apply {
                webViewClient = WebViewClient()
                background = ColorDrawable(Color.Black.hashCode())
                loadDataWithBaseURL(null, message.content, "text/HTML", "UTF-8", null)
            }

        })
    }
    Row {

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Feed(SampleData().getMessages())
    }
}
