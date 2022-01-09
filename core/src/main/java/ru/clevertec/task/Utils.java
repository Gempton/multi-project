package ru.clevertec.task;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {
        boolean isAllPositiveNumbers = true;

        for (String s : str) {
            if (!StringUtils.isPositiveNumber(s)) {
                isAllPositiveNumbers = false;
            }
        }

        return isAllPositiveNumbers;
    }
}
