package com.walterching.designpatterns.abstractFactory.shapes

import com.walterching.designpatterns.factory.shapes.IShape

class Triangle: IShape {
    override fun draw(): String = "Draw Triangle"
}