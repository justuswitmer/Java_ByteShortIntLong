package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;

	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // overflow
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));
        // underflow
        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));

    }
}
