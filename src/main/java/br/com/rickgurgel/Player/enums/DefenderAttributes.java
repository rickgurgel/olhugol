package br.com.rickgurgel.Player.enums;

public enum DefenderAttributes {
    CLEAN_SHEETS(0.0),
    INTERCEPTIONS_PER_GAME(0.0),
    TACKLES_PER_GAME(0.0),
    POSSESSION_WON(0.0),
    BALLS_RECOVERED_PER_GAME(0.0),
    DRIBBLED_PAST_PER_GAME(0.0),
    CLEARANCES_PER_GAME(0.0),
    ERROR_LED_TO_SHOT(0.0),
    ERROR_LED_TO_GOAL(0.0),
    PENALTIES_COMMITTED(0.0);

    private double value;

    DefenderAttributes(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
