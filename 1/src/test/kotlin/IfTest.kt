import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class IfTest: StringSpec ({
    "1 3 5"{
        max(1,3,5) shouldBe 5
    }
    "2 34 54"{
        max(2,34,54) shouldBe 54
    }
    "0 -56 -24354"{
        max(0,-56,-24354) shouldBe 0
    }
})