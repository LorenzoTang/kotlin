// Task 6.4: exam grading function
//Name: Tang Le 
//ID: 201912989
fun grade(mark: Int) = when (mark) {
    in 0..39 -> "Fail"
    in 40..69 -> "Pass"
    in 70..100 -> "Distinction"
    else -> "?"
}
