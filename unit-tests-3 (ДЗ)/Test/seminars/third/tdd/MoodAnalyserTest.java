package seminars.third.tdd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {
    @ParameterizedTest
    @CsvSource({"BAD, у меня плохое настроение","SAD, мне грустно","HAPPY, радосное утро","FUNNY, веселое тестирование","NORMAL, сколько можно"})
    void moodTest(String mood,String mes){
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        assertEquals(mood, moodAnalyser.analyseMood(mes));
    }
}
