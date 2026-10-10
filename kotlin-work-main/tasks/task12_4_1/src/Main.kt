// Task 12.4.1: main program
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

fun main() {
    val circle = Circle(
        centre = Point(2.0, 3.0),
        radius = 5.0
    )

    println("Area: ${circle.area()}")
    println("Perimeter: ${circle.perimeter()}")

    val insidePoint = Point(5.0, 3.0)
    val outsidePoint = Point(10.0, 3.0)

    println("Contains inside point: ${circle.contains(insidePoint)}")
    println("Contains outside point: ${circle.contains(outsidePoint)}")
}