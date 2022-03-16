package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSum() {
        long expected = 180;
        StatsService service = new StatsService();
        long actual = service.sumOfSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAverage() {
        long expected = 15;
        StatsService service = new StatsService();
        long actual = service.averageOfSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMax() {
        long expected = 8;
        StatsService service = new StatsService();
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMin() {
        long expected = 9;
        StatsService service = new StatsService();
        long actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumBelowAverage() {
        long expected = 5;
        StatsService service = new StatsService();
        long actual = service.numOfMonthsBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumAboveAverage() {
        long expected = 5;
        StatsService service = new StatsService();
        long actual = service.numOfMonthsAboveAverage(sales);
        assertEquals(expected, actual);
    }
}