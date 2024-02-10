package seminars.second.life_cycle_JUnit5.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.third.coverage.SomeService;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    // 3.1.
    SomeService someService;
    @BeforeEach
    void setUp(){
        someService = new SomeService();
    }

    @Test
    void multipleThreeNotFiveReturnsFizz() {
        assertEquals("Fizz", someService.fizzBuzz(6));
    }

    @Test
    void multipleThreeNotThreeReturnsBuzz() {
        assertEquals("Buzz", someService.fizzBuzz(10));
    }

    @Test
    void multipleFiveteenReturnsBuzz() {
        assertEquals("FizzBuzz", someService.fizzBuzz(15));
    }

    @Test
    void notMultipleReturnsNum() {
        assertEquals("11", someService.fizzBuzz(11));
    }

    @Test
    void lastLastNunberNotSixReturnFalse(){
        int[] myArray = new int[]{1,0,1,6};

        assertFalse(someService.firstLast6(myArray));
    }

    @Test
    void lastFirstLastNunberNotSixReturnFalse(){
        int[] myArray = new int[]{1,0,1,3};

        assertFalse(someService.firstLast6(myArray));
    }

    @Test
    void firstLastNunberNotSixReturnFalse(){
        int[] myArray = new int[]{6,0,1,3};

        assertFalse(someService.firstLast6(myArray));
    }

    @Test
    void insufficientCoverageTest(){

        System.out.println(someService.calculatingDiscount(2000.0, 10));
        assertThat(someService.calculatingDiscount(2000.0, 50))
                .isEqualTo(1000); // обычная скидка
        assertThat(someService.calculatingDiscount(2000.0, 100))
                .isEqualTo(0); // обычная скидка
        assertThat(someService.calculatingDiscount(2000.0, 0))
                .isEqualTo(2000); // обычная скидка


        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%

        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки меньше 0
    }
}