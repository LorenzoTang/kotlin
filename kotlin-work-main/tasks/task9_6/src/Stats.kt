// Task 9.6: variance() function
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

fun variance(data: List<Double>): Double {
    require(data.size >= 2) {
        "At least 2 values are required to calculate"
    }

    val mean = data.average()

    val squaredDifferences = data.map { value ->
        val difference = value - mean
        difference * difference
    }

    return squaredDifferences.sum() / (data.size - 1)
}