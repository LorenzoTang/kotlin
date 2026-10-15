// Task 16.3: abstract Shape class
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

import java.awt.Color
import java.awt.Graphics2D

abstract class Shape(val x: Int, val y: Int, val color: Color) {
    abstract fun draw(context: Graphics2D)
}
