package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {
    MainHW mainHW;

    @BeforeEach
    void setUp() {
        this.mainHW = new MainHW();
    }

    @Test
    void evenOddNumber() {
        assertTrue(this.mainHW.evenOddNumber(2));
        assertFalse(this.mainHW.evenOddNumber(1));
    }

    @Test
    void numberInInterval() {
        assertTrue(this.mainHW.numberInInterval(26));
        assertFalse(this.mainHW.numberInInterval(1));
    }
}
