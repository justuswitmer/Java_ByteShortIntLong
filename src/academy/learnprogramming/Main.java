package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    // INTEGER
	int myValue = 10000;

	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // overflow
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));
        // underflow
        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));

        int maxValue = 2_147_483_647;

        // BYTE
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        // SHORT
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        // LONG
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);

        long longValue = 9_223_372_036_854_775_807L;
        System.out.println(longValue);
    }
}
