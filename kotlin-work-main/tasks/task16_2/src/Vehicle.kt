// Task 16.2: abstract Vehicle class
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
abstract class Vehicle(var fuelLevel: Int) {
    fun refuel(amount: Int) {
        require(amount >= 0) { "Invalid fuel amount"}
        fuelLevel += amount
    }

    abstract fun drive()
}