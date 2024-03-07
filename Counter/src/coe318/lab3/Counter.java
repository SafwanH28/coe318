/**
 *
 * @author Your Name
 */
package coe318.lab3;

public class Counter {

    //Instance variables here
    int digit;
    int mod;
    Counter left;

    public Counter(int modulus, Counter left) {
        digit = 0;
        mod = modulus;
        this.left = left;
    }

    /**
     * @return the modulus
     */
    public int getModulus() {
        return mod;
    }

    /**
     * Returns the Counter to the left attached to this Counter. Returns null if
     * there is no Counter to the left.
     *
     * @return the left
     */
    public Counter getLeft() {
        return left;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        if (digit < mod && digit < 0) {
        this.digit = digit;
        }
        else{
        System.out.println("Error: Invalid Input!");
        }

    }

    /**
     * Increment this counter. If it rolls over, its left Counter is also
     * incremented if it exists.
     */
    public void increment() {
        if (digit < (mod-1)) {
            digit = digit + 1;
        } else {
            digit = 0;
            if (this.left != null) {
                this.left.increment();
            } 
//            else {
//                this.left = new Counter(mod, null);
//                this.left.increment();
//            }
        }
    }

    /**
     * Return the count of this Counter combined with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if (this.left == null) {
            return digit;
        } else {
            return digit + (mod * this.left.getCount());
        }
    }

    /**
     * Returns a String representation of the Counter's total count (including
     * its left neighbour).
     *
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
