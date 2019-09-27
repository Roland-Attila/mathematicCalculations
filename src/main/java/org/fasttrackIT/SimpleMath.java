package org.fasttrackIT;

public class SimpleMath {

    int a;
    int b;
    int c;

    public int minus(SimpleMath one, SimpleMath two) {
        one.a = 110;
        two.b = 65;
        c = one.a - two.b;
        System.out.println("Result: " + c);
        return (c);
    }

    public int plus(SimpleMath one, SimpleMath two) {
        one.a = 345;
        two.b = 15;
        c = one.a + two.b;
        System.out.println("Result: " + c);
        return (c);
    }

    public int divide(SimpleMath one, SimpleMath two) {
        one.a = 90;
        two.b = 30;
        c = one.a / two.b;
        System.out.println("Result: " + c);
        return (c);
    }

    public int multiply(SimpleMath one, SimpleMath two) {
        one.a = 320;
        two.b = 320;
        c = one.a * two.b;
        System.out.println("Result: " + c);
        return (c);
    }

    public int modulus(SimpleMath one, SimpleMath two) {
        one.a = 780;
        two.b = 81;
        c = one.a % two.b;
        System.out.println("Result: " + c);
        return (c);
    }

}