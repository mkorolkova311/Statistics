package ru.netology.stats;

import org.junit.jupiter.api.Test;

import java.security.Provider;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    private int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    private StatsService service = new StatsService();

    @Test
    void shouldAmountAllSales() {

        int expected = 180;
        int actual = service.sum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAveregeSale() {

        int expected = 15;
        int actual = service.average(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthOfMaxSales() {
        int expected = 8;
        int actual = service.getMonthMaxSales(purchases);

        assertEquals(expected, actual);


    }

    @Test
    void shouldMonthfMinSales() {
        int expected = 9;
        int actual = service.getMonthMinSales(purchases);

        assertEquals(expected, actual);


    }

    @Test
    void shouldMonthSalesLessThanAverage() {
        int expected = 5;
        int actual = service.LessThanAverage(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void shouldMonthSalesMoreThanAverage() {
        int expected = 5;
        int actual = service.MoreThanAverage(purchases);

        assertEquals(expected, actual);
    }
}


