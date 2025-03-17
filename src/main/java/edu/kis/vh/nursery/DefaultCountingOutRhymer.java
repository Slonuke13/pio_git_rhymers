package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int DEFAULT_VALUE = -1;
    private static final int MAX_SIZE = 12;
    private static final int FULL_INDEX = MAX_SIZE - 1;

    private final int[] NUMBERS = new int[MAX_SIZE];

    private int total = DEFAULT_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_VALUE;
    }

    public boolean isFull() {
        return total == FULL_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return NUMBERS[total--];
    }

}
