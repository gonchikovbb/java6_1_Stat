package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calcSum(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMidSum() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calcMidSum(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        long[] managerSales = {8, 15, 13, 0, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(managerSales);

        assertEquals(expected, actual);
    }


    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        long[] managerSales = {8, 15, 13, -15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 4;
        long actual = service.minSales(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonLessMidSales() {
        StatsService service = new StatsService();
        long[] managerSales = {8, 15, 13, 0, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 3;
        long actual = service.monLessMidSales(managerSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldMonMoreMidSales() {
        StatsService service = new StatsService();
        long[] managerSales = {8, 15, 13, 1000, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 1;
        long actual = service.monMoreMidSales(managerSales);

        assertEquals(expected, actual);
    }
}