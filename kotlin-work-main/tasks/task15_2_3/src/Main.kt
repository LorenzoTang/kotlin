// Task 15.2.3: demo program
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

fun main() {
    val account = SavingAccount("Sarah", 1.8)
    account.deposit(1250)


    repeat(5) {
        account.applyInterest()
    }

    account.withdraw(50)
    println(account.balance)
}
