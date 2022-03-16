package ru.netology.stats;

public class StatsService {

    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcMidSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        sum /= sales.length;
        return sum;
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
        int sum = 0;
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            sum += sale;
        }
        sum /= sales.length;

        int minMonth = 0;
        int count = 0;
        for (long sale : sales) {
            if (sale < sum) {
                count++;
            }
        }
        return count;
    }

    public int monMoreMidSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            sum += sale;
        }
        sum /= sales.length;

        int minMonth = 0;
        int count = 0;
        for (long sale : sales) {
            if (sale > sum) {
                count++;
            }
        }
        return count;
    }
}