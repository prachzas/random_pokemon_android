package com.example.test1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    val pokemonList = arrayListOf("pokemon1", "pokemon2", "pokemon3", "pokemon4")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val random = Random()
            val randomPokemon = random.nextInt(pokemonList.count())
            textView.text = pokemonList[randomPokemon]
        }

        addPokemonBtn.setOnClickListener{
            val newPokemon = addPokenmonText.text.toString()
            pokemonList.add(newPokemon)
            addPokenmonText.text.clear()
            println(pokemonList)
        }
    }
}