// Task 17.5: superclass for Shapes
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

import java.awt.Color

abstract class Shape(val x: Int, val y: Int, val color: Color)

// Shape remains abstract to prevent instance creation but no longer has
// an abstract draw() method (this is now in the Drawable interface)
