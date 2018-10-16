package com.walterching.designpatterns.abstractFactory

import com.walterching.designpatterns.abstractFactory.types.ColorType
import com.walterching.designpatterns.abstractFactory.types.ShapeType
import com.walterching.designpatterns.abstractFactory.colors.IColor
import com.walterching.designpatterns.factory.shapes.IShape

abstract class AbstractFactory {

    // This abstract factory doesn't really make much sense since this two
    // items don't have nothing in common and it will require to implement
    // nullable methods
    abstract fun getShape(type: ShapeType): IShape?
    abstract fun getColor(type: ColorType): IColor?
}