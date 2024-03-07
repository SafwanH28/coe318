package coe318.lab2;

/**
 * ComplexNumber models a complex number expressed in rectangular form (real and
 * imaginary parts). It is an <em>immutable</em> object.
 *
 * @author Your Name
 */
public class ComplexNumber {
//Instance variable declarations

    double real;
    double img;

    /**
     * Construct a ComplexNumber given its real and imaginary parts.
     *
     * @param re The real component
     * @param im The imaginary component
     */
    public ComplexNumber(double re, double im) {
//Initialize the instance variables
        real = re;
        img = im;
    }

    /**
     * Returns the real component.
     *
     * @return the real
     */
    public double getReal() {
        return real;	//A stub: to be fixed
    }

    /**
     * Returns the imaginary component.
     *
     * @return the imaginary
     */
    public double getImaginary() {
        return img;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber number that is the negative of <em>this</em>.
     * Note: the original ComplexNumber is <b>NOT</b>
     * modified.
     *
     * @return -this
     */
    public ComplexNumber negate() {
        ComplexNumber n;
        n = new ComplexNumber(-real, -img);
        return n; //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the sum of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber add(ComplexNumber z) {
        ComplexNumber result;
        result = new ComplexNumber(this.real + z.real, this.img + z.img);
        return result;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the difference of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber subtract(ComplexNumber z) {
        ComplexNumber result;
        result = new ComplexNumber(this.real - z.real, this.img - z.img);
        return result;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the product of <em>this</em> and
     * <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this * z
     */
    public ComplexNumber multiply(ComplexNumber z) {
        double real1, real2, real3, img1, img2, img3;
        ComplexNumber result;
        real1 = this.real * z.real;
        real2 = -this.img * z.img;
        img1 = this.real * z.img;
        img2 = this.img * z.real;
        real3 = real1 + real2;
        img3 = img1 + img2;
        result = new ComplexNumber(real3, img3);
        return result;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the reciprocal of <em>this</em>.
     * Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @return 1.0 / this
     */
    public ComplexNumber reciprocal() {
        double real1, real2, numreal, numimg, real3, real4, den, denimg, finreal, finimg;
        ComplexNumber result;
        numreal = this.real;
        numimg = -this.img;
        real1 = this.real * this.real;
        real2 = this.real * -this.img;
        real3 = this.img * this.real;
        real4 = -this.img * -this.img;
        den = real1 + real2 + real3 + real4;
        finreal = numreal/den;
        finimg = numimg/den;
        
        result = new ComplexNumber(finreal, finimg);
        return result;	//A stub: to be fixed    }
    }

    /**
     * Returns a new ComplexNumber that is
     * <em>this</em> divided by <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this / z
     */
    public ComplexNumber divide(ComplexNumber z) {
        double real1, real2, img1, img2, numreal, numimg, real3, real4, real5, real6, denreal, denimg, finreal, finimg;
        ComplexNumber result;
        real1 = this.real * z.real;
        real2 = -this.img * -z.img;
        img1 = this.real * -z.img;
        img2 = this.img * z.real;
        numreal = real1 + real2;
        numimg = img1 + img2;
        real3 = z.real*z.real;
        real4 = z.real*-z.img;
        real5 = z.img*z.real;
        real6 = -z.img*-z.img;
        denreal = real3 + real4 + real5 + real6;
        finreal = numreal/denreal;
        finimg = numimg/denreal;
        
        result = new ComplexNumber(finreal, finimg);
        return result;	//A stub: to be fixed    }
    }

    /**
     * Returns a String representation of
     * <em>this</em> in the format:
     * <pre>
     *	real +-(optional) i imaginary
     * </pre> If the imaginary part is zero, only the real part is converted to
     * a String. A "+" or "-" is placed between the real and imaginary parts
     * depending on the the sign of the imagrinary part.
     * <p>
     * Examples:
     * <pre>
     *	..println(new ComplexNumber(0,0); -> "0.0"
     *	..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
     *	..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
     * </pre>
     *
     * @return the String representation.
     */
    @Override
    public String toString() {
//DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}
