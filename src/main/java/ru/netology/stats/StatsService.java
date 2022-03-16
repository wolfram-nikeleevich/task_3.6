package ru.netology.stats;

public class StatsService {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    long sumOfSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    long averageOfSales(long[] sales) {
        return sumOfSales(sales) / sales.length;
    }

    int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth])
                maxMonth = month;
            month++;
        }
        return maxMonth + 1;

    }

    int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth])
                minMonth = month;
            month++;
        }
        return minMonth + 1;

    }

    int numOfMonthsBelowAverage(long[] sales) {
        int num = 0;
        for (long sale : sales) {
            if (sale < averageOfSales(sales))
                num++;
        }
        return num;
    }

    int numOfMonthsAboveAverage(long[] sales) {
        int num = 0;
        for (long sale : sales) {
            if (sale > averageOfSales(sales))
                num++;
        }
        return num;
    }
}
