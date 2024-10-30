package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder result = new StringBuilder();

        for (int e = start; e < stop; e = e + step) {
            result.append(Math.round(Math.pow(e,exponent)));
        }
        return result.toString();
    }

    public static String getRange(int start, int stop, int step) {
//        StringBuilder result = new StringBuilder();
//
//        for (int e = start; e < stop; e = e + step) {
//            result.append(e);
//        }
//        return result.toString();
        return getExponentiations(start,stop, step, 1);
    }

    public static String getRange(int start, int stop) {

        return getRange(start, stop, 1);
    }

    public static String getRange(int stop) {

        return getRange(0, stop, 1);
    }

    /*
     * natural break
     */

    public static boolean isNumberEven(int toTest) {
        return ((toTest % 2) == 0);
    }
    public static boolean isNumberOdd(int toTest) {
        return (toTest % 2) != 0;
    }

    public static String getEvenNumbers(int start, int stop) {
        StringBuilder result = new StringBuilder();

        for (int e = start; e < stop; e = e + 1) {
            if (isNumberEven(e)) {
                result.append(e);
            }
        }
        return result.toString();
    }

    public static String getOddNumbers(int start, int stop) {
        StringBuilder result = new StringBuilder();

        for (int e = start; e < stop; e = e + 1) {
            if (isNumberOdd(e)) {
                result.append(e);
            }
        }
        return result.toString();
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2);
    }

}
