package ru.netology.statistics;

import org.junit.jupiter.api.Test;
import ru.netology.statistics.StatisticsService;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {11, 5, 10, 10, 4, 5, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}