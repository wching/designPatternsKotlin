package com.walterching.designpatterns.abstractfactory

import com.walterching.designpatterns.abstractFactory.ColorFactory
import com.walterching.designpatterns.abstractFactory.FactoryProducer
import com.walterching.designpatterns.abstractFactory.ShapeFactory
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
    fun colorFactoryIsReturnedByFactory() {
        val colorFactory = factoryProducer.getFactory(FactoryProducer.FactoryType.Color)
        assert(colorFactory is ColorFactory)
    }

    @Test
    fun shapeFactoryIsReturnedByFactory() {
        val shapeFactory = factoryProducer.getFactory(FactoryProducer.FactoryType.Shape)
        assert(shapeFactory is ShapeFactory)
    }
}