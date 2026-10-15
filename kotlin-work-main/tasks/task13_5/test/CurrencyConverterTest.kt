// Task 13.5: unit tests for CurrencyConverter
// (using a stub for ExchangeRateService)
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe
import io.mockk.Runs
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import tolerance

const val tolerance = 0.00001

class CurrencyConverterTest : FreeSpec({
    "Can convert GBP to USD" {
        val service = mockk<ExchangeRateService>()

        every {
            service.rateFor("USD")
        } returns 1.25

        val converter = CurrencyConverter(service)

        converter.convertTo("USD", 2.0) shouldBe (2.5 plusOrMinus tolerance)
    }

    "Can convert GBP to JPY" {
        val service = mockk<ExchangeRateService>()

        every {
            service.rateFor("JPY")
        } returns 180.0

        val converter = CurrencyConverter(service)

        converter.convertTo("JPY", 1.5) shouldBe (270.0 plusOrMinus tolerance)    
    }

})
