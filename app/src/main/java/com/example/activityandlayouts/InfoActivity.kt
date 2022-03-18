package com.example.activityandlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info.*
import kotlinx.android.synthetic.main.activity_main.*

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val surname = intent.getStringExtra(Constants.SURNAME)
        val name = intent.getStringExtra(Constants.NAME)
        val patronymic = intent.getStringExtra(Constants.PATRONYMIC)
        val age = intent.getIntExtra(Constants.AGE, 0)
        val hobby = intent.getStringExtra(Constants.HOBBY)

        val young_description: String = "$surname $name $patronymic — персонаж" +
                " одноимённых восточнославянских народных сказок,изображаемый в виде небольшого пшеничного " +
                "хлеба шарообразной формы, который сбежал от испёкших его бабушки и дедушки, от разных зверей" +
                " (зайца, волка и медведя), но был съеден лисой. Любимым хобби этого персонажа является $hobby."

        val adult_description: String ="Былины описывают $surname $name $patronymic, " +
                "как человека могучего телосложения и роста (больше 180 см), с русыми кудрями, черными бровями," +
                " бородой с проседью. Его облачение – традиционное для того времени: " +
                "шлем и кольчуга, а из оружия – палица, копье и щит. Любимым хобби этого персонажа является $hobby."

        val old_description: String="$surname $name $patronymic владеет колдовством, жаден, " +
                "некрасив, безжалостен. Занимается тем, что похищает чужих невест, крадёт их красоту. Этого персонажа " +
                "нельзя назвать глупым, поскольку он прячет свою смерть в нескольких предметах," +
                " то есть просто убить его не получится. Любимым хобби этого персонажа является $hobby."

        tvDescription.text = ""
        if(age < 10)
            tvDescription.append(young_description)
        if(age in 10..49)
            tvDescription.append(adult_description)
        if(age in 50..99)
            tvDescription.append(old_description)

        buttonBackToMain.setOnClickListener{
            finish()
        }
    }
}