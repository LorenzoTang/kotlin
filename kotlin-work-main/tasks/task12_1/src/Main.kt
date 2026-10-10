// Task 12.1: program that uses a Point object
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

fun main() {
    val p = Point(3.0, 4.0)

    println("x = ${p.x}")
    println("y = ${p.y}")
    println("Distance from origin= ${p.distance()}")

    val q = Point(4.5, 7.0)
    println("Distance to (4.5, 7.0) = ${p.distanceTo(q)}")
}