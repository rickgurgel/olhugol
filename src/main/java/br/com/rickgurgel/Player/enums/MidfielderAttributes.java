package br.com.rickgurgel.Player.enums;

// MidfielderAttributes.java
public enum MidfielderAttributes {
    ASSISTS(0.0),
    EXPECTED_ASSISTS(0.0),
    TOUCHES(0.0),
    BIG_CHANCES_CREATED(0.0),
    KEY_PASSES(0.0),
    ACCURATE_PER_GAME(0.0),
    ACCURATE_OWN_HALF(0.0),
    ACCURATE_OPP_HALF(0.0),
    ACCURATE_LONG_BALLS(0.0),
    ACCURATE_CHIPPED_PASSES(0.0),
    ACCURATE_CROSSES(0.0);

    private double value;

    MidfielderAttributes(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
