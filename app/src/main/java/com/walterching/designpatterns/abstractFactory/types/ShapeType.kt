package com.walterching.designpatterns.abstractFactory.types

sealed class ShapeType {
    object Triangle : ShapeType()
    object Diamond : ShapeType()
}