package com.walterching.designpatterns.factory

import com.walterching.designpatterns.factory.shapes.Circle
import com.walterching.designpatterns.factory.shapes.IShape
import com.walterching.designpatterns.factory.shapes.Rectangle


class ShapeFactory: IShapeFactory {
    override fun createShape(type: ShapeType): IShape {
        return when(type) {
            ShapeType.Circle -> Circle()
            ShapeType.Rectangle -> Rectangle()
        }
    }

    sealed class ShapeType {
        object Circle: ShapeType()
        object Rectangle: ShapeType()
    }
}

