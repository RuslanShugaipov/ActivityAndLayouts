package com.example.activityandlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonShowInfo.setOnClickListener{
            Intent(this, InfoActivity::class.java).also {
                it.putExtra(Constants.NAME, etName.text.toString())
                it.putExtra(Constants.SURNAME, etSurname.text.toString())
                it.putExtra(Constants.PATRONYMIC, etPatronymic.text.toString())
                it.putExtra(Constants.HOBBY, etHobby.text.toString())
                it.putExtra(Constants.AGE, etAge.text.toString().toInt())
                startActivity(it)
            }
        }
    }
}