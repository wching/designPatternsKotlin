package com.walterching.designpatterns.abstractFactory.types

sealed class ColorType {
    object Red : ColorType()
    object Blue : ColorType()
}