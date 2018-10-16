package com.walterching.designpatterns.abstractFactory

import com.walterching.designpatterns.abstractFactory.colors.IColor
import com.walterching.designpatterns.abstractFactory.shapes.Diamond
import com.walterching.designpatterns.abstractFactory.shapes.Triangle
import com.walterching.designpatterns.abstractFactory.types.ColorType
import com.walterching.designpatterns.abstractFactory.types.ShapeType
import com.walterching.designpatterns.factory.shapes.IShape

class ShapeFactory : AbstractFactory() {

    override fun getColor(type: ColorType): IColor? = null

    override fun getShape(type: ShapeType): IShape? {
        return when (type) {
            ShapeType.Diamond -> Diamond()
            ShapeType.Triangle -> Triangle()
        }
    }
}