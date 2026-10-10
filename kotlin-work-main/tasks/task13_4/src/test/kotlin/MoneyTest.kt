// Task 13.4: unit tests for Money class
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class MoneyTest : FreeSpec({
    "Can create a Money" {
        val m = Money(1, 50)

        withClue("euros") {
            m.euros shouldBe 1
        }
        withClue("cents") {
            m.cents shouldBe 50
        }
    }
    "euros cannot be negative" {
        shouldThrow<IllegalArgumentException> {
            Money(-1, 50)
        }
    }
    "Cents cannot be negative" {
        shouldThrow<IllegalArgumentException> {
            Money(1, -1)
        }
    }
    "Cents cannot be 100 or more" {
        shouldThrow<IllegalArgumentException> {
            Money(1, 100)
        }
    }
    "€1.50 + €0.00 is €1.50" {
        Money(1, 50) + Money(0, 0) shouldBe Money(1, 50)
    }

    "€1.50 + €1.00 is €2.50" {
        Money(1, 50) + Money(1, 0) shouldBe Money(2, 50)
    }

    "€1.50 + €0.01 is €1.51" {
        Money(1, 50) + Money(0, 1) shouldBe Money(1, 51)
    }

    "€2.99 + €0.01 is €3.00" {
        Money(2, 99) + Money(0, 1) shouldBe Money(3, 0)
    }
})
