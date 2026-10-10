// Task 12.4.1: Circle class
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

import kotlin.math.PI

class Circle(val centre: Point, val radius: Double) {
    init {
        require(radius > 0) {
            "The radius must be positive"
        }
    }

    fun area() = PI * radius * radius
    fun perimeter() = 2.0 * PI * radius
    fun contains(point: Point) = 
        centre.distanceTo(point) <= radius
}