package org.fasttrackIT;

public class SimpleMath {

    int a;
    int b;
    int c;
    double cc;

    public int minus(SimpleMath one, SimpleMath two) {
        one.a = 110;
        two.b = 65;
        c = one.a - two.b;
        System.out.println("Result: " + c);
        return (c);
    }

    public double minus(double one, double two) {
        one = 244.5;
        two = 122.2;
        cc = one - two;
        System.out.println("Result: " + cc);
        return (cc);
    }

    public int plus(SimpleMath one, SimpleMath two) {
        one.a = 345;
        two.b = 15;
        c = one.a + two.b;
        System.out.println("Result: " + c);
        return (c);
    }

    public double plus(double one, double two) {
        one = 244.2;
        two = 222.5;
        cc = one + two;
        System.out.println("Result: " + cc);
        return (cc);
    }

    public int divide(SimpleMath one, SimpleMath two) {
        one.a = 90;
        two.b = 30;
        c = one.a / two.b;
        System.out.println("Result: " + c);
        return (c);
    }

    public double divide(double one, double two) {
        one = 90.9;
        two = 30.3;
        cc = one / two;
        System.out.println("Result: " + cc);
        return (cc);
    }

    public int multiply(SimpleMath one, SimpleMath two) {
        one.a = 320;
        two.b = 320;
        c = one.a * two.b;
        System.out.println("Result: " + c);
        return (c);
    }

    public double multiply(double one, double two) {
        one = 320.8;
        two = 320.9;
        cc = one * two;
        System.out.println("Result: " + cc);
        return (cc);
    }

    public int modulus(SimpleMath one, SimpleMath two) {
        one.a = 780;
        two.b = 81;
        c = one.a % two.b;
        System.out.println("Result: " + c);
        return (c);
    }

    public double modulus(double one, double two) {
        one = 780.99;
        two = 81.23;
        cc = one % two;
        System.out.println("Result: " + cc);
        return (cc);
    }

}