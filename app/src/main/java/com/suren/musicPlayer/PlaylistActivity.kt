package com.suren.musicPlayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.suren.musicPlayer.databinding.ActivityPlaylistBinding

class PlaylistActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlaylistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_MusicPlayer)
        binding = ActivityPlaylistBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}