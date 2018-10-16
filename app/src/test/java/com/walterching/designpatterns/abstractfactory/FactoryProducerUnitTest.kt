package com.walterching.designpatterns.abstractfactory

import com.walterching.designpatterns.abstractFactory.ColorFactory
import com.walterching.designpatterns.abstractFactory.FactoryProducer
import com.walterching.designpatterns.abstractFactory.ShapeFactory
import com.walterching.designpatterns.abstractFactory.types.ColorType
import com.walterching.designpatterns.abstractFactory.types.ShapeType
import org.junit.Before
import org.junit.Test

class FactoryProducerUnitTest {

    lateinit var factoryProducer: FactoryProducer

    @Before
    fun setup() {
        factoryProducer = FactoryProducer()
    }

    @Test
    fun colorFactoryIsReturnedByFactory() {
        val colorFactory = factoryProducer.getFactory(FactoryProducer.FactoryType.Color)
        assert(colorFactory is ColorFactory)
    }

    @Test
    fun colorRedIsReturnedByFactory() {
        val colorFactory = factoryProducer.getFactory(FactoryProducer.FactoryType.Color)
        val red = colorFactory.getColor(ColorType.Red)
        assert(red?.fill() == "Filling red...")
    }

    @Test
    fun colorBlueIsReturnedByFactory() {
        val colorFactory = factoryProducer.getFactory(FactoryProducer.FactoryType.Color)
        val blue = colorFactory.getColor(ColorType.Blue)
        assert(blue?.fill() == "Filling blue...")
    }

    @Test
    fun shapeFactoryIsReturnedByFactory() {
        val shapeFactory = factoryProducer.getFactory(FactoryProducer.FactoryType.Shape)
        assert(shapeFactory is ShapeFactory)
    }

    @Test
    fun diamondShapeIsReturnedByFactory() {
        val shapeFactory = factoryProducer.getFactory(FactoryProducer.FactoryType.Shape)
        val diamond = shapeFactory.getShape(ShapeType.Diamond)
        assert(diamond?.draw() == "Draw Diamond")
    }

    @Test
    fun triangleShapeIsReturnedByFactory() {
        val shapeFactory = factoryProducer.getFactory(FactoryProducer.FactoryType.Shape)
        val triangle = shapeFactory.getShape(ShapeType.Triangle)
        assert(triangle?.draw() == "Draw Triangle")
    }
}