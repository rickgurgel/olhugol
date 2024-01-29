package br.com.rickgurgel.Player.enums;

public enum AttackerAttributes {
    GOALS(0.0),
    EXPECTED_GOALS(0.0),
    GOAL_FREQUENCY(0.0),
    GOALS_PER_GAME(0.0),
    SHOTS_PER_GAME(0.0),
    SHOTS_ON_TARGET_PER_GAME(0.0),
    BIG_CHANCES_MISSED(0.0),
    CONVERSION_RATE(0.0),
    FREE_KICK_GOALS(0.0),
    SET_PIECE_CONVERSION(0.0),
    GOALS_INSIDE_BOX(0.0),
    GOALS_OUTSIDE_BOX(0.0),
    HEADER_GOALS(0.0),
    LEFT_FOOT_GOALS(0.0),
    RIGHT_FOOT_GOALS(0.0),
    PENALTIES_WON(0.0);

    private double value;

    AttackerAttributes(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
