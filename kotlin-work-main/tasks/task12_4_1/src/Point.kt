// Task 12.4.1: Point class
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
import kotlin.math.hypot

class Point(val x: Double, val y: Double) {
    fun distance() = hypot(x, y)
    fun distanceTo(p: Point) = hypot(x - p.x, y - p.y)
}
