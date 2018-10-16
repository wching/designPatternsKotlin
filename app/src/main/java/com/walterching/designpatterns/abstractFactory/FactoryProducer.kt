package com.walterching.designpatterns.abstractFactory

class FactoryProducer {

    fun getFactory(type: FactoryType): AbstractFactory {
        return when (type) {
            FactoryType.Color -> ColorFactory()
            FactoryType.Shape -> ShapeFactory()
        }
    }

    sealed class FactoryType {
        object Shape : FactoryType()
        object Color : FactoryType()
    }
}