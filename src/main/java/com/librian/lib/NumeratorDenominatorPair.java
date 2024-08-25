package com.librian.lib;

public record NumeratorDenominatorPair(short numerator, short denominator) {

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
