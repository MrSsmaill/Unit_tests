package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    SomeService someService;

    @BeforeEach
    void setUp() {
        this.someService = new SomeService();
    }

    @ParameterizedTest
    @ValueSource(
            ints = {3, 6, 9, 33}
    )
    void multipleThreeNotFiveReturnsFizz(int n) {
        assertEquals("Fizz", this.someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(
            ints = {5, 10, 20, 55}
    )
    void multipleFiveNotThreeReturnsBuzz(int n) {
        assertEquals("Buzz", this.someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(
            ints = {15, 225, 3375}
    )
    void multipleThreeAndFiveReturnsFizzBuzz(int n) {
        assertEquals("FizzBuzz", this.someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(
            ints = {15, 225, 3375}
    )
    void multipleThreeAndFieReturnsFizzBuzz(int n) {
        assertEquals("FizzBuzz", this.someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(
            ints = {1, 2, 41, 43}
    )
    void notMultipleOfThreeOfFieReturnsNumber(int n) {
        assertEquals(Integer.toString(n), this.someService.fizzBuzz(n));
    }

    @Test
    void first6arrayShouldReturnTrue() {
        assertTrue(this.someService.firstLast6(new int[]{6, 3, 5, 3}));
    }

    @Test
    void last6arrayShouldReturnTrue() {
        assertTrue(this.someService.firstLast6(new int[]{2, 345, 6}));
    }

    @Test
    void noLast6arrayShouldReturnFalse() {
        assertFalse(this.someService.firstLast6(new int[]{2, 345, 2}));
    }

    @ParameterizedTest
    @CsvSource({"2000.0,50,1000.0", "2000.0,100,0.0", "2000.0,0,2000.0"})
    void testNormalDiscount(double p, int d, double r) {
        assertThat(this.someService.calculatingDiscount(p, d)).isEqualTo(r);
    }

    @ParameterizedTest
    @CsvSource({"2000.0,110", "2000.0,-10"})
    void insufficientCoverageTest(double p, int d) {
        assertThatThrownBy(() ->
                this.someService.calculatingDiscount(p, d)
        ).isInstanceOf(ArithmeticException.class).hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    }


    @Test
    void negativePurchaseAmountReturnException() {
        assertThatThrownBy(() ->
                this.someService.calculatingDiscount(-1000.0, 50)
        ).isInstanceOf(ArithmeticException.class).hasMessage("Сумма покупки не может быть отрицательной");
    }


    @ParameterizedTest
    @CsvSource({"2,3,13,5", "2,13,9,11", "13,9,9,18", "9,9,9,27",})
    void luckySumReturnSumWithout13(int a, int b, int c, int r) {
        assertThat(this.someService.luckySum(a, b, c)).isEqualTo(r);
    }
}
