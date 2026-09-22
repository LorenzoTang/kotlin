// Task 4.4: temperature conversion using a while loop
//Name: Tang Le 
//ID: 201912989 
import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if(args.size != 3){
        println("Error: three temperature values are required .")
        exitProcess(1)
    }

    val initial = args[0].toDouble()
    val maximum = args[1].toDouble()
    val increment = args[2].toDouble()

    if (increment <= 0.0) {
        println("Error: temperature increment must be positive")
        exitProcess(1)
    }

    val terminal = Terminal(AnsiLevel.TRUECOLOR)

    val conversionTable = table {
       align = TextAlign.RIGHT

       header{
            row(blue("Celsius"), red("Fahrenheit"))
       }

       body{
            var celsius = initial

            while (celsius <= maximum) {
                val fahrenheit = celsius * 9.0 / 5.0 + 32.0
                
                val celsiusText = "%.1f".format(celsius)
                val fahrenheitText = "%.1f".format(fahrenheit)

                row(
                    blue(celsiusText),
                    red(fahrenheitText)
                )

            celsius += increment
        }
       }
    }
    terminal.println(conversionTable)
    
}
