// Task 7.7.1: statistics functions
// name: Tang Le
//Student ID:201912989

fun median(values: List<Float>): Float {
    require(values.isNotEmpty()) {
        "The dataset must not be empty"
    }

    val sortedValues = values.sorted()
    val middleIndex = sortedValues.size / 2

    return if (sortedValues.size % 2 ==0) {
        val lowerValue = sortedValues[middleIndex - 1]
        val upperValue = sortedValues[middleIndex]
        (lowerValue + upperValue) / 2f
    } else {
        sortedValues[middleIndex]
    }
}


fun displayStats(values: List<Float>) {
    require(values.isNotEmpty()) {
        "The dataset must not be empty"
    }

    println("Minimum: ${values.min()}")
    println("Maximum: ${values.max()}")
    println("Mean: ${values.average()}")
    println("Median: ${median(values)}")
}