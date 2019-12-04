import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CalcTest : StringSpec({
    "1 + 1 = 2" {
        add(1, 1) shouldBe 2
    }

    "1 - 1 = 0" {
        subtract(1, 1) shouldBe 0
    }

    "3 * 6 = 18" {
        multiply(3,6) shouldBe 18
    }

    "48 / 12 = 4" {
        divide(48,12) shouldBe 4
    }
})