package com.example.youtubeandmp4videoplayer

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.platform.LocalLifecycleOwner
import com.example.youtubeandmp4videoplayer.ui.theme.YoutubeAndMP4VideoPlayerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            YoutubeAndMP4VideoPlayerTheme {

                val videoUri = Uri.parse("android.resource://com.example.youtubeandmp4videoplayer/raw/video")

                Column(verticalArrangement = Arrangement.SpaceBetween) {
                    YoutubePlayer(
                        youtubeVideoId = "aqz-KE-bpKQ",
                        lifecycleOwner = LocalLifecycleOwner.current
                    )
                    MP4Player(videoUri = videoUri)
                }
            }
        }
    }
}