// Task 15.2.3: SavingsAccount class
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

class SavingAccount(
    holder: String,
    val rate: Double
) : BankAccount(holder) {
    fun applyInterest() {
        val interest = (balance * rate / 100).toInt()
        deposit(interest)
    }
}