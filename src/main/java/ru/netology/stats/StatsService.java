package ru.netology.stats;

public class StatsService {

    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calcMidSum(long[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int monLessMidSales(long[] sales) {
        int count = 0;
        long midSum = calcMidSum(sales);
        for (long sale : sales) {
            if (sale < midSum) {
                count++;
            }
        }
        return count;
    }

    public int monMoreMidSales(long[] sales) {
        int count = 0;
        long midSum = calcMidSum(sales);
        for (long sale : sales) {
            if (sale > midSum) {
                count++;
            }
        }
        return count;
    }
}