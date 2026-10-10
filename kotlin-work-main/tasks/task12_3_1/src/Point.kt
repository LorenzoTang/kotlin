// Task 12.3.1: class with secondary constructors
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
class Point(var x: Double, var y: Double) {
    constructor() : this(0.0, 0.0) 
    
    constructor(x: Int, y: Int) : this(x.toDouble(), y.toDouble())
}


