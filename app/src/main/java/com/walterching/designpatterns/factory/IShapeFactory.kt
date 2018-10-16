package com.walterching.designpatterns.factory

import com.walterching.designpatterns.factory.shapes.IShape

interface IShapeFactory {
    fun createShape(type: ShapeFactory.ShapeType): IShape
}