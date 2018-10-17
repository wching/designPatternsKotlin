package com.walterching.designpatterns.builder

import org.junit.Test

class BuilderUnitTest {

    @Test
    fun emptyBuilderReturnsAllDefaultValues() {
        val foodOrder = FoodOrder.Builder().build()
        assert(foodOrder.bread == "bimbo")
        assert(foodOrder.condiments == "knoblauch")
        assert(foodOrder.fish == "salmon")
        assert(foodOrder.meat == "picanha")
    }

    @Test
    fun builderReturnsSelectedBread() {
        val foodOrder = FoodOrder.Builder().bread("breddy").build()
        assert(foodOrder.bread == "breddy")
    }

    @Test
    fun builderReturnsSelectedCondiments() {
        val foodOrder = FoodOrder.Builder().condiments("salt").build()
        assert(foodOrder.condiments == "salt")
    }

    @Test
    fun builderReturnsSelectedFish() {
        val foodOrder = FoodOrder.Builder().fish("corvina").build()
        assert(foodOrder.fish == "corvina")
    }

    @Test
    fun builderReturnsSelectedMeat() {
        val foodOrder = FoodOrder.Builder().meat("chicken").build()
        assert(foodOrder.meat == "chicken")
    }
}
