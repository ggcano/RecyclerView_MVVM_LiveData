package com.example.recyclerview_sample.repositories

import androidx.lifecycle.MutableLiveData
import com.example.recyclerview_sample.models.domain.Superhero

class SuperHeroRepositoryImpl: SuperHeroRepostirory {


    override fun generateSuperHeroList(): MutableLiveData<MutableList<Superhero>>{
        val superheros:MutableList<Superhero> = mutableListOf()
        val mutableLiveData: MutableLiveData<MutableList<Superhero>> = MutableLiveData()

        superheros.add(
            Superhero(
                "Spiderman",
                "Marvel",
                "Peter Parker",
                "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"
            )
        )
        superheros.add(
            Superhero(
                "Daredevil",
                "Marvel",
                "Matthew Michael Murdock",
                "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"
            )
        )
        superheros.add(
            Superhero(
                "Wolverine",
                "Marvel",
                "James Howlett",
                "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"
            )
        )
        superheros.add(
            Superhero(
                "Batman",
                "DC",
                "Bruce Wayne",
                "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"
            )
        )
        superheros.add(
            Superhero(
                "Thor",
                "Marvel",
                "Thor Odinson",
                "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"
            )
        )
        superheros.add(
            Superhero(
                "Flash",
                "DC",
                "Jay Garrick",
                "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"
            )
        )
        superheros.add(
            Superhero(
                "Green Lantern",
                "DC",
                "Alan Scott",
                "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"
            )
        )
        superheros.add(
            Superhero(
                "Wonder Woman",
                "DC",
                "Princess Diana",
                "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"
            )
        )

        mutableLiveData.value = superheros

        return mutableLiveData
    }
}