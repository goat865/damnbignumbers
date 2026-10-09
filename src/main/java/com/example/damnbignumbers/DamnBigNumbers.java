package com.example.damnbignumbers;

public class DamnBigNumbers {
    /**
     * TODO - add "b" to big "a"
     * @param a DamnBigNumber
     * @param b long
     * @return DamnBigNumber
     */
    public static DamnBigNumber add(DamnBigNumber a, long b) {
        return a;
    }

    /**
     * TODO - add big "b" to big "a"
     * @param a DamnBigNumber
     * @param b DamnBigNumber
     * @return DamnBigNumber
     */
    public static DamnBigNumber add(DamnBigNumber a, DamnBigNumber b) {
        String str = "";

        for (int i = a.getNumStr().length() - 1; i >= 0; i--) {
            int digitResult = a.getNumStr().charAt(i) - 48 + b.getNumStr().charAt(i) - 48;
            str = String.format("%d", digitResult) + str;
        }

        DamnBigNumber c = new DamnBigNumber(str);
        return c;
    }

    /**
     * TODO - subtract "b" from big "a"
     * @param a DamnBigNumber
     * @param b long
     * @return DamnBigNumber
     */
    public static DamnBigNumber subtract(DamnBigNumber a, long b) {
        return a;
    }

    /**
     * TODO - subtract big "b" from big "a"
     * @param a DamnBigNumber
     * @param b DamnBigNumber
     * @return DamnBigNumber
     */
    public static DamnBigNumber subtract(DamnBigNumber a, DamnBigNumber b) {
        return a;
    }

    /**
     * TODO - multiply "a" by big "b"
     * @param a DamnBigNumber
     * @param b long
     * @return DamnBigNumber
     */
    public static DamnBigNumber multiply(DamnBigNumber a, long b) {
        return a;
    }

    /**
     * TODO - multiply big "a" by big "b"
     * @param a DamnBigNumber
     * @param b DamnBigNumber
     * @return DamnBigNumber
     */
    public static DamnBigNumber multiply(DamnBigNumber a, DamnBigNumber b) {
        return a;
    }

    /**
     * TODO - divide big "a" by "b"
     * @param a DamnBigNumber
     * @param b long
     * @return DamnBigNumber
     */
    public static DamnBigNumber divide(DamnBigNumber a, long b) {
        return a;
    }

    /**
     * TODO - divide big "a" by big "b"
     * @param a DamnBigNumber
     * @param b DamnBigNumber
     * @return DamnBigNumber
     */
    public static DamnBigNumber divide(DamnBigNumber a, DamnBigNumber b) {
        return a;
    }

    /**
     * TODO - implement areEqual method variants
     * @param a
     * @param b
     * @return boolean
     */
    public static boolean areEqual(DamnBigNumber a, DamnBigNumber b) {
        return false;
    }

    public static boolean areEqual(DamnBigNumber a, long b) {
        return false;
    }

    public static boolean areEqual(long a, DamnBigNumber b) {
        return false;
    }
}
