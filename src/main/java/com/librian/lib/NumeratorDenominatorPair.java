package com.librian.lib;

public class NumeratorDenominatorPair {
    private short denominator;
    private short number;

    public NumeratorDenominatorPair(short denominator, short number) {
        this.denominator = denominator;
        this.number = number;
    }

    public short getDenominator() {
        return denominator;
    }

    public short getNumerator() {
        return number;
    }

    public static NumeratorDenominatorPair from(int milliseconds) {
        int gcd = gcd(1000, milliseconds);

        return new NumeratorDenominatorPair(
                ((short) (milliseconds / gcd)),
                ((short) (1000 / gcd))
        );
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
