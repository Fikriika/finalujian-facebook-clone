package com.example.fikri_facebookclone

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.example.fikri_facebookclone.R
import com.google.android.material.bottomsheet.BottomSheetDialog

class ProfileActivity : AppCompatActivity() {
    var isSportClicked = false
    var isMovieClicked = false
    var isGamesClicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_profile)

        val header = findViewById<TextView>(R.id.hd_profile)
        val profile =intent.getStringExtra("profile")
        header.setText(profile)

        val tmblgender = findViewById<TextView>(R.id.privacy)
        tmblgender.setOnClickListener {
            val bottomsheet = BottomSheetDialog(this)
            val layoutbottomsheet =layoutInflater.inflate(R.layout.bottomsheet_privacy,null)

            val tmblpublic = layoutbottomsheet.findViewById<Button>(R.id.btnpublic)
            tmblpublic.setOnClickListener {
                tmblgender.text = ("Public")
                bottomsheet.dismiss()
            }

            val tmblprivacy = layoutbottomsheet.findViewById<TextView>(R.id.btnprivacy)
            tmblprivacy.setOnClickListener {
                tmblgender.text = ("Privacy")
                bottomsheet.dismiss()
            }
            bottomsheet.setContentView(layoutbottomsheet)
            bottomsheet.show()

        }

        val tmblinterest = findViewById<TextView>(R.id.interest)
        tmblinterest.setOnClickListener {
            val interestbottomsheet =BottomSheetDialog(this)
            val layoutbottomsheetinterest = layoutInflater.inflate(R.layout.bottomsheet_interests,null)

            val simpan = layoutbottomsheetinterest.findViewById<Button>(R.id.btnsave)
            simpan.setOnClickListener {
                var hobinya = " "
                if(isSportClicked){
                    hobinya += "Sport, "
                }
                if (isMovieClicked){
                    hobinya+= "Movie, "
                }
                if (isGamesClicked){
                    hobinya+= "Games"
                }
                tmblinterest.setText(hobinya)
                interestbottomsheet.dismiss()
            }

            var itemsport = layoutbottomsheetinterest.findViewById<Button>(R.id.btnsport)
            var itemmovie = layoutbottomsheetinterest.findViewById<Button>(R.id.btnmovie)
            var itemgames = layoutbottomsheetinterest.findViewById<Button>(R.id.btngames)

            if (isSportClicked){
                itemsport.background = ResourcesCompat.getDrawable(resources, R.color.violet, theme)
            }
            if (isMovieClicked){
                itemmovie.background = ResourcesCompat.getDrawable(resources, R.color.violet, theme)
            }
            if (isGamesClicked){
                itemgames.background = ResourcesCompat.getDrawable(resources, R.color.violet, theme)
            }

            itemsport.setOnClickListener {
                isSportClicked=!isSportClicked
                if (isSportClicked){
                    itemsport.background = ResourcesCompat.getDrawable(resources, R.color.violet, theme)
                }
                else {
                    itemsport.background = ResourcesCompat.getDrawable(resources, R.color.fb, theme)
                }
            }
            itemmovie.setOnClickListener {
                isMovieClicked=!isMovieClicked
                if (isMovieClicked){
                    itemmovie.background = ResourcesCompat.getDrawable(resources, R.color.violet, theme)
                }
                else {
                    itemmovie.background = ResourcesCompat.getDrawable(resources, R.color.fb, theme)
                }
            }
            itemgames.setOnClickListener {
                isGamesClicked=!isGamesClicked
                if (isGamesClicked){
                    itemgames.background = ResourcesCompat.getDrawable(resources, R.color.violet, theme)
                }
                else {
                    itemgames.background = ResourcesCompat.getDrawable(resources, R.color.fb, theme)
                }
            }
            interestbottomsheet.setContentView(layoutbottomsheetinterest)
            interestbottomsheet.show()
        }



    }
}

