// Task 16.2: concrete Car class, inheriting from Vehicle
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
 class Car(fuel: Int) : Vehicle(fuel) {
    override fun drive() {
        println("Vrooom")
    }
}