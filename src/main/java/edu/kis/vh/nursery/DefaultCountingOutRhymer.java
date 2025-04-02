package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int EMPTY_INDICATOR = -1;
    private static final int MAX_SIZE = 12;
    private int[] NUMBERS = new int[MAX_SIZE];
    private static final int TOTAL = 11;

    private int total = EMPTY_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean isEmpty() {
        return total == EMPTY_INDICATOR;
    }

    public boolean isFull() {
        return total == TOTAL;
    }

        public boolean callCheck() {
            return total == -1;
        }
        

        protected int peekaboo() {
            if (callCheck())
                return EMPTY_INDICATOR;
            return NUMBERS[total];
        }

        public int countOut() {
            if (callCheck())
                return -1;
            return NUMBERS[total--];
        }

    public int getTotal() {
        return total;
    }
}
