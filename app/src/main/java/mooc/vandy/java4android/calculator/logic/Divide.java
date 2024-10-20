package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;


public class Divide extends Operations {


    ActivityInterface mOut;
    private int n1, n2;

    public Divide(int n1, int n2, ActivityInterface mOut)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.mOut = mOut;
    }

    public void perform() {
        if (n2 == 0)
            print("Cannot Divide by 0", mOut); 
        else
            print("" + n1 / n2 + " R:" + n1 % n2, mOut); 
    }
}
