package com.example.favorite_song
/*
 * This file is about the metadata of a favorite song.
 * The file contains the variables to store this metadata, the  displays it accordingly on a terminal
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class Song : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This are the variables for holding the song's metadata
        val artist : String = "Shirley Caesar"
        val album : String = "The Definitive, Gospel Collection: Shirley Caesar"
        val songName : String = "JESUS , I LOVE CALLING YOUR NAME"
        val yearReleased : Int = 1983
        val genre : String = "Christian/Gospel"
        val duration : Float = 3.41f
        val source : String = "Musixmatch"
        val songWriters : String = "Harold G Troy"
        val songAvailabilitySources : String = "Spotify | Youtube Music | Deezer"

        // Displaying the metadata using the 'Log.d' on multiple lines, my understanding is that
        // using multiple 'Log.d' allows me to display everything on one execution or to avoid the 'Log.d' display limit
        Log.d("Artist: ", artist)
        Log.d("Album: ", album)
        Log.d("Name of Song: ", songName)
        Log.d("Year Released: ", yearReleased.toString())
        Log.d("Genre: ", genre)
        Log.d("Duration (Minutes): ", duration.toString())
        Log.d("Source: ", source)
        Log.d("Song Writer(s): ", songWriters)
        Log.d("Song Availability Sources: ", songAvailabilitySources)
    }
}



