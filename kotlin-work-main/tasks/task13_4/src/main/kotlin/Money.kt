// Task 13.4: Money class
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
data class Money(
    val euros: Int, 
    val cents: Int) {
        init {
            require(euros >=0) {
                "euros cannot be negative"
            }
            require(cents in 0..99) {
                "cents should be in range of 0..99"
            }
        }
        operator fun plus(other: Money): Money {
            val totalCents = cents + other.cents

            return Money(
                euros + other.euros + totalCents /100,
                totalCents % 100

            )
        }
    }