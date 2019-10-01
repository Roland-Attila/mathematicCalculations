package org.fasttrackIT;


public class App {
    public static void main(String[] args) {
        SimpleMath simpleMath = new SimpleMath();
        simpleMath.minus(simpleMath, simpleMath);
        simpleMath.plus(simpleMath, simpleMath);
        simpleMath.divide(simpleMath, simpleMath);
        simpleMath.multiply(simpleMath, simpleMath);
        simpleMath.modulus(simpleMath, simpleMath);
        simpleMath.minus(244.5, 122.2);
        simpleMath.plus(244.2, 222.5);
        simpleMath.divide(90.9, 30.3);
        simpleMath.multiply(320.8, 320.9);
        simpleMath.modulus(780.99, 81.23);
    }
}