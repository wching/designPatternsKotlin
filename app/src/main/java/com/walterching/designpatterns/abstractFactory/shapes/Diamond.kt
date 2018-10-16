package com.walterching.designpatterns.abstractFactory.shapes

import com.walterching.designpatterns.factory.shapes.IShape

class Diamond: IShape {
    override fun draw(): String = "Draw Diamond"
}