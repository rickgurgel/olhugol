package br.com.rickgurgel.Player.enums;

public enum AttributeEnum {
    CLEAN_SHEETS(0.0),
    INTERCEPTIONS_PER_GAME(0.0),
    TACKLES_PER_GAME(0.0),
    POSSESSION_WON(0.0),
    BALLS_RECOVERED_PER_GAME(0.0),
    DRIBBLED_PAST_PER_GAME(0.0),
    CLEARANCES_PER_GAME(0.0),
    ERROR_LED_TO_SHOT(0.0),
    ERROR_LED_TO_GOAL(0.0),
    PENALTIES_COMMITTED(0.0),
    GOALS_CONCEDED_PER_GAME(0.0),
    PENALTIES_SAVED(0.0),
    SAVES_PER_GAME(0.0),
    SUCCESSFUL_RUNS_OUT_PER_GAME(0.0),
    GOALS_CONCEDED(0.0),
    CONCEDED_FROM_INSIDE_BOX(0.0),
    CONCEDED_FROM_OUTSIDE_BOX(0.0),
    SAVES_MADE(0.0),
    GOALS_PREVENTED(0.0),
    SAVES_FROM_INSIDE_BOX(0.0),
    SAVES_FROM_OUTSIDE_BOX(0.0),
    SAVES_CAUGHT(0.0),
    SAVES_PARIED(0.0),
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
    ACCURATE_CROSSES(0.0),
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

    AttributeEnum(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
