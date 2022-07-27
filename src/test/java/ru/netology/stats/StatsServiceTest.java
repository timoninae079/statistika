package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 16};

    @Test

    public void sumTest() {
        StatsService service = new StatsService();

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 16);
        long actual = service.sum(sales);

        assertEquals(expected, actual);
    }

    @Test

    public void averageTest() {
        StatsService service = new StatsService();

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 16) / 12;
        long actual = service.average(sales);

        assertEquals(expected, actual);
    }

    @Test

    public void maxSalesTest() {
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void countAboveAvg() {
        StatsService service = new StatsService();
        int expected = 7;
        int actual = service.countAboveAvg(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void countBelowAvg() {
        StatsService service = new StatsService();
        int expected = 3;
        int actual = service.countBelowAvg(sales);

        assertEquals(expected, actual);
    }
}