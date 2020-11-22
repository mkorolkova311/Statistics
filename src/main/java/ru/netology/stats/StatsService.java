package ru.netology.stats;

public class StatsService {
    public int sum(int[] purchases) {
        int result = 0;

        for (int purchase : purchases) {
            result += purchase;

        }


        return result;

    }

    public int average(int[] purchases) {

        return sum(purchases) / purchases.length;

    }

    public int getMonthMaxSales(int[] purchases) {
        int max = getMax(purchases);
        int monthNumber = 0;
        int monthWihMax = 0;
        for (int purchase : purchases) {
            monthNumber++;
            if (purchase == max) {
                monthWihMax = monthNumber;

            }
        }
        return monthWihMax;

    }

    public int getMax(int[] purchases) {
        int max = purchases[0];
        for (int purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }
        return max;
    }


    public int getMin(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
       return min;
    }

    public int getMonthMinSales(int[] purchases) {
        int min = getMin(purchases);
        int monthNumber = 0;
        int monthWihMin = 0;
        for (int purchase : purchases) {
            monthNumber++;
            if (purchase == min) {
                monthWihMin = monthNumber;

            }
        }
        return monthWihMin;
    }

    public int LessThanAverage(int[] purchases) {
        int average = average(purchases);
        int count = 0;

        for (int purchase : purchases){
            if (purchase < average){
                count++;
            }
        }

        return count;
    }

    public int MoreThanAverage(int[] purchases) {
        int average = average(purchases);
        int count = 0;

        for (int purchase : purchases){
            if (purchase > average){
                count++;
            }
        }

        return count;
    }
}