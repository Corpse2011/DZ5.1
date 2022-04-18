package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        assertEquals(expected, actual);
    }


}

