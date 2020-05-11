import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void testDateNow(){
            int newData = 2;
            int result = NextDayCalculator.dateNow(1);
        assertEquals(newData, result);
        }
}