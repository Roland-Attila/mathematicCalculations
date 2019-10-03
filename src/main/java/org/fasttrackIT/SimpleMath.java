package org.fasttrackIT;

public class SimpleMath {

    int c;
    double cc;

    public int minus(int one, int two) {
        c = one - two;
        System.out.println("Result: " + c);
        return (c);
    }

    public double minus(double one, double two) {
        cc = one - two;
        System.out.println("Result: " + cc);
        return (cc);
    }

    public int plus(int one, int two) {
        c = one + two;
        System.out.println("Result: " + c);
        return (c);
    }

    public double plus(double one, double two) {
        cc = one + two;
        System.out.println("Result: " + cc);
        return (cc);
    }

    public int divide(int one, int two) {
        c = one / two;
        System.out.println("Result: " + c);
        return (c);
    }

    public double divide(double one, double two) {
        cc = one / two;
        System.out.println("Result: " + cc);
        return (cc);
    }

    public int multiply(int one, int two) {
        c = one * two;
        System.out.println("Result: " + c);
        return (c);
    }

    public double multiply(double one, double two) {
        cc = one * two;
        System.out.println("Result: " + cc);
        return (cc);
    }

    public int modulus(int one, int two) {
        c = one % two;
        System.out.println("Result: " + c);
        return (c);
    }

    public double modulus(double one, double two) {
        cc = one % two;
        System.out.println("Result: " + cc);
        return (cc);
    }
}