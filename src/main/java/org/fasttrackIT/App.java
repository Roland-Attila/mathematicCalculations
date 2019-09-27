package org.fasttrackIT;


public class App {
    public static void main(String[] args) {
        SimpleMath simpleMath = new SimpleMath();
        simpleMath.minus(simpleMath, simpleMath);
        simpleMath.plus(simpleMath, simpleMath);
        simpleMath.divide(simpleMath, simpleMath);
        simpleMath.multiply(simpleMath, simpleMath);
        simpleMath.modulus(simpleMath, simpleMath);
    }
}
