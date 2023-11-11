package com.example.owl.services

import android.app.Service
import android.content.Intent
import android.net.Uri
import android.os.IBinder
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer

class VideoPlayerService : Service() {
    private lateinit var player: SimpleExoPlayer

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        // Initialize ExoPlayer
        player = SimpleExoPlayer.Builder(this).build()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent != null) {
            val action: String? = intent.action
            action?.let {
                when (it) {
                    "PLAY" -> {
                        // Handle play action
                    }
                    "PAUSE" -> {
                        // Handle pause action
                    }
                    "STOP" -> {
                        // Handle stop action
                    }
                }
            }
        }
        return START_STICKY
    }

    override fun onDestroy() {
        // Release ExoPlayer resources
        player.release()
        super.onDestroy()
    }

    private fun initializePlayer() {
        // Set media source and prepare player
        val videoUri: Uri = Uri.parse("YOUR_VIDEO_URL")
        val mediaItem: MediaItem = MediaItem.fromUri(videoUri)
        player.setMediaItem(mediaItem)
        player.prepare()
    }

    private fun startPlayer() {
        // Start playback
        player.play()
    }

    private fun pausePlayer() {
        // Pause playback
        player.pause()
    }

    private fun stopPlayer() {
        // Stop playback
        player.stop()
    }
}
