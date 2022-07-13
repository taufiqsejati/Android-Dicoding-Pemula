package com.taufiqsejati.mainanpopuler90s

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_SUBTITLE = "extra_subtitle"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val subtitle = intent.getStringExtra(EXTRA_SUBTITLE)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        val sinopsis: TextView = findViewById(R.id.deskripsi_mainan)
        sinopsis.setText(subtitle)

        val judul: TextView = findViewById(R.id.judul_mainan)
        judul.setText(title)

        val heroImg: ImageView
        heroImg = findViewById(R.id.image_mainan)
        heroImg.setImageResource(photo)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = title
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        val picture1: Button = findViewById(R.id.bt1)
        val picture2: Button = findViewById(R.id.bt2)
        val picture3: Button = findViewById(R.id.bt3)
        val picture4: Button = findViewById(R.id.bt4)
        picture1.isEnabled = false
//
        picture1.setOnClickListener {
            if (title == "Balon Tiup") {
                heroImg.setImageResource(photo)
                picture1.isEnabled = false

            }
            if (title == "GameBoy") {
                heroImg.setImageResource(photo)
                picture1.isEnabled = false

            }
            if (title == "Kapal Kapalan") {
                heroImg.setImageResource(photo)
                picture1.isEnabled = false

            }
            if (title == "Kelereng") {
                heroImg.setImageResource(photo)
                picture1.isEnabled = false

            }
            if (title == "Ketapel") {
                heroImg.setImageResource(photo)
                picture1.isEnabled = false

            }
            if (title == "Lego") {
                heroImg.setImageResource(photo)
                picture1.isEnabled = false

            }
            if (title == "Monopoli") {
                heroImg.setImageResource(photo)
                picture1.isEnabled = false

            }
            if (title == "Nintendo") {
                heroImg.setImageResource(photo)
                picture1.isEnabled = false

            }
            if (title == "Tamagotchi") {
                heroImg.setImageResource(photo)
                picture1.isEnabled = false

            }
            if (title == "Yoyo") {
                heroImg.setImageResource(photo)
                picture1.isEnabled = false

            }
            picture2.isEnabled = true

            picture3.isEnabled = true

            picture4.isEnabled = true


        }

        picture2.setOnClickListener {
            if (title == "Balon Tiup") {
                heroImg.setImageResource(R.drawable.balon_tiup1)
                picture2.isEnabled = false

            }
            if (title == "GameBoy") {
                heroImg.setImageResource(R.drawable.gameboy1)
                picture2.isEnabled = false

            }
            if (title == "Kapal Kapalan") {
                heroImg.setImageResource(R.drawable.kapal_kapalan1)
                picture2.isEnabled = false

            }
            if (title == "Kelereng") {
                heroImg.setImageResource(R.drawable.kelereng1)
                picture2.isEnabled = false

            }
            if (title == "Ketapel") {
                heroImg.setImageResource(R.drawable.ketapel1)
                picture2.isEnabled = false

            }
            if (title == "Lego") {
                heroImg.setImageResource(R.drawable.lego1)
                picture2.isEnabled = false

            }
            if (title == "Monopoli") {
                heroImg.setImageResource(R.drawable.monopoli1)
                picture2.isEnabled = false

            }
            if (title == "Nintendo") {
                heroImg.setImageResource(R.drawable.nintendo1)
                picture2.isEnabled = false

            }
            if (title == "Tamagotchi") {
                heroImg.setImageResource(R.drawable.tamagotchi1)
                picture2.isEnabled = false

            }
            if (title == "Yoyo") {
                heroImg.setImageResource(R.drawable.yoyo1)
                picture2.isEnabled = false

            }
            picture1.isEnabled = true

            picture3.isEnabled = true

            picture4.isEnabled = true

        }

        picture3.setOnClickListener {
            if (title == "Balon Tiup") {
                heroImg.setImageResource(R.drawable.balon_tiup2)
                picture3.isEnabled = false

            }
            if (title == "GameBoy") {
                heroImg.setImageResource(R.drawable.gameboy2)
                picture3.isEnabled = false

            }
            if (title == "Kapal Kapalan") {
                heroImg.setImageResource(R.drawable.kapal_kapalan2)
                picture3.isEnabled = false

            }
            if (title == "Kelereng") {
                heroImg.setImageResource(R.drawable.kelereng2)
                picture3.isEnabled = false

            }
            if (title == "Ketapel") {
                heroImg.setImageResource(R.drawable.ketapel2)
                picture3.isEnabled = false

            }
            if (title == "Lego") {
                heroImg.setImageResource(R.drawable.lego2)
                picture3.isEnabled = false

            }
            if (title == "Monopoli") {
                heroImg.setImageResource(R.drawable.monopoli2)
                picture3.isEnabled = false

            }
            if (title == "Nintendo") {
                heroImg.setImageResource(R.drawable.nintendo2)
                picture3.isEnabled = false

            }
            if (title == "Tamagotchi") {
                heroImg.setImageResource(R.drawable.tamagotchi2)
                picture3.isEnabled = false

            }
            if (title == "Yoyo") {
                heroImg.setImageResource(R.drawable.yoyo2)
                picture3.isEnabled = false

            }
            picture1.isEnabled = true

            picture2.isEnabled = true

            picture4.isEnabled = true

        }

        picture4.setOnClickListener {
            if (title == "Balon Tiup") {
                heroImg.setImageResource(R.drawable.balon_tiup3)
                picture4.isEnabled = false

            }
            if (title == "GameBoy") {
                heroImg.setImageResource(R.drawable.gameboy3)
                picture4.isEnabled = false

            }
            if (title == "Kapal Kapalan") {
                heroImg.setImageResource(R.drawable.kapal_kapalan3)
                picture4.isEnabled = false

            }
            if (title == "Kelereng") {
                heroImg.setImageResource(R.drawable.kelereng3)
                picture4.isEnabled = false

            }
            if (title == "Ketapel") {
                heroImg.setImageResource(R.drawable.ketapel3)
                picture4.isEnabled = false

            }
            if (title == "Lego") {
                heroImg.setImageResource(R.drawable.lego3)
                picture4.isEnabled = false

            }
            if (title == "Monopoli") {
                heroImg.setImageResource(R.drawable.monopoli3)
                picture4.isEnabled = false

            }
            if (title == "Nintendo") {
                heroImg.setImageResource(R.drawable.nintendo3)
                picture4.isEnabled = false

            }
            if (title == "Tamagotchi") {
                heroImg.setImageResource(R.drawable.tamagotchi3)
                picture4.isEnabled = false

            }
            if (title == "Yoyo") {
                heroImg.setImageResource(R.drawable.yoyo3)
                picture4.isEnabled = false

            }
            picture1.isEnabled = true

            picture2.isEnabled = true

            picture3.isEnabled = true

        }


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}