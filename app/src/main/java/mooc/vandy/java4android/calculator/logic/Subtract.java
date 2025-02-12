package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends Operations {

    private ActivityInterface mOut;
    private int n1, n2;

    public Subtract(int n1, int n2, ActivityInterface mOut)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.mOut = mOut;
    }

    public void perform() {
        print("" + (n1 - n2), mOut);
    }
}
