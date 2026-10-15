// Task 17.5: Picture class, representing a collection of Drawable things
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

import java.awt.Graphics2D

class Picture {
    private val items = mutableListOf<Drawable>()

    fun add(item: Drawable) = items.add(item)

    fun draw(context: Graphics2D) = items.forEach {
        it.draw(context)
    }
}
