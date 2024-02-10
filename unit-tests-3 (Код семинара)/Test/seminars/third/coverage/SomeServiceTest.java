
package seminars.third.coverage;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.assertj.core.api.AbstractThrowableAssert;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


class SomeServiceTest {
    SomeService someService;

    @BeforeEach
    void setUp() {
        this.someService = new SomeService();
    }

    @Test
    void multipleThreeNotFiveReturnsFizz() {
        assertEquals("Fizz", this.someService.fizzBuzz(6));
    }

    @Test
    void multipleThreeNotThreeReturnsBuzz() {
        assertEquals("Buzz", this.someService.fizzBuzz(10));
    }

    @Test
    void multipleFiveteenReturnsBuzz() {
        assertEquals("FizzBuzz", this.someService.fizzBuzz(15));
    }

    @Test
    void notMultipleReturnsNum() {
        assertEquals("11", this.someService.fizzBuzz(11));
    }

    @Test
    void lastLastNunberNotSixReturnFalse() {
        int[] myArray = new int[]{1, 0, 1, 6};
        assertFalse(this.someService.firstLast6(myArray));
    }

    @Test
    void lastFirstLastNunberNotSixReturnFalse() {
        int[] myArray = new int[]{1, 0, 1, 3};
        assertFalse(this.someService.firstLast6(myArray));
    }

    @Test
    void firstLastNunberNotSixReturnFalse() {
        int[] myArray = new int[]{6, 0, 1, 3};
        assertFalse(this.someService.firstLast6(myArray));
    }

    @ParameterizedTest
    @CsvSource({"2000.0, 50, 1000", "2000.0, 100, 0", "2000.0, 0, 2000"})
    void paramet(double p, int d, int r) {
        assertThat(someService.calculatingDiscount(p, d))
                .isEqualTo(r);
    }

    @ParameterizedTest
    @CsvSource({"2000.0, 101", "2000.0, -10"})
    void insufficientCoverageTest(double p, int d) {
        assertThatThrownBy(() ->
                someService.calculatingDiscount(p, d))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%
    }

    @Test
    void testNumSum(){assertEquals(15,someService.luckySum(4,5,6));}

    @ParameterizedTest
    @CsvSource({"2,13,1,1","2,1,13,1","2,1,1,13"})
    void testNotNumInThirteen(int r,int a, int b,int c){
       assertEquals(r,someService.luckySum(a,b,c));
    }

}
