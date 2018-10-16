package com.walterching.designpatterns.factory

import com.walterching.designpatterns.factory.ShapeFactory.ShapeType.Circle
import com.walterching.designpatterns.factory.ShapeFactory.ShapeType.Rectangle
import org.junit.Before
import org.junit.Test

class ShapeFactoryUnitTest {

    lateinit var factory: IShapeFactory

    @Before
    fun setup() {
        factory = ShapeFactory()
    }

    @Test
    fun circleIsReturnedByFactory() {
        val circle = factory.createShape(Circle)
        assert(circle.draw() == "Draw Circle")
    }

    @Test
    fun rectangleIsReturnedByFactory() {
        val rectangle = factory.createShape(Rectangle)
        assert(rectangle.draw() == "Draw Rectangle")
    }
}
