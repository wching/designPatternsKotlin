package com.walterching.designpatterns.builder

class FoodOrder private constructor(
    val bread: String,
    val condiments: String,
    val meat: String,
    val fish: String
) {

    data class Builder(
        var bread: String = "bimbo",
        var condiments: String = "knoblauch",
        var meat: String = "picanha",
        var fish: String = "salmon"
    ) {

        fun bread(bread: String) = apply {
            this.bread = bread
        }

        fun condiments(condiments: String) = apply {
            this.condiments = condiments
        }

        fun meat(meat: String) = apply {
            this.meat = meat
        }

        fun fish(fish: String) = apply {
            this.fish = fish
        }

        fun build() = FoodOrder(
            bread = bread,
            condiments = condiments,
            meat = meat,
            fish = fish
        )
    }
}
