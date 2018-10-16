package com.walterching.designpatterns.abstractFactory

import com.walterching.designpatterns.abstractFactory.types.ColorType
import com.walterching.designpatterns.abstractFactory.types.ShapeType
import com.walterching.designpatterns.abstractFactory.colors.Blue
import com.walterching.designpatterns.abstractFactory.colors.IColor
import com.walterching.designpatterns.abstractFactory.colors.Red
import com.walterching.designpatterns.factory.shapes.IShape

class ColorFactory : AbstractFactory() {

    override fun getShape(type: ShapeType): IShape? = null

    override fun getColor(type: ColorType): IColor? {
        return when (type) {
            ColorType.Red -> Red()
            ColorType.Blue -> Blue()
        }
    }
}