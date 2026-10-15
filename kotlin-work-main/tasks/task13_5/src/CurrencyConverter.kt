// Task 13.5: CurrencyConverter class
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
class CurrencyConverter(val service: ExchangeRateService) {
    fun convertTo(currency: String, amount: Double): Double {
        return service.rateFor(currency) * amount
    }
}
