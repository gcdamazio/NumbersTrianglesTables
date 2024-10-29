package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    //return a String concatenation of all values, raised to the specified exponent, between start up to and not including stop, incrementing by the specified step.
    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String range = "";
        int product;
        for (int i = start; i < stop; i += step) {
            product = (int) Math.pow(i,exponent);
            range = range + product;
        }
        return range;
    }

    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i += step) {
            range = range + i;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for (int i = start; i < stop; i++) {
            range = range + i;
        }
        return range;
    }

    public static String getRange(int stop) {
        String range = "";
        for (int i = 0; i < stop; i++) {
            range = range + i;
        }
        return range;
    }





    /*
     * natural break
     */

    public static boolean isNumberEven(int toTest) {
        return ((toTest % 2) == 0);
    }

    public static boolean isNumberOdd(int toTest) {
        return ((toTest % 2) == 1);
    }

    public static String getEvenNumbers(int start, int stop) {
        String justEven = "";
        for (int i = start; i < stop; i++) {
            if (isNumberEven(i)) {
                justEven = justEven + i;
            }
        }
        return (justEven);
    }

    public static String getOddNumbers(int start, int stop) {
        String justOdd = "";
        for (int i = start; i < stop; i++) {
            if (isNumberOdd(i)) {
                justOdd = justOdd + i;
            }
        }
        return (justOdd);
    }

    //return a String concatenation of all values squared between start up to and not including stop.
    public static String getSquareNumbers(int start, int stop, int step) {
        String range = "";
        int square = 0;
        for (int i = start; i < stop; i += step) {
            square= i * i;
            range = range + square;
        }
        return range;
    }
}
