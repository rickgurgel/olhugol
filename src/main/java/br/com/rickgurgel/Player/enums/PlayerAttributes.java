package br.com.rickgurgel.Player.enums;

import java.util.EnumSet;

public class PlayerAttributes {
    private RoleType roleType;

    private EnumSet<DefenderAttributes> defenderAttributes;

    private EnumSet<GoalkeeperAttributes> goalkeeperAttributes;

    private EnumSet<MidfielderAttributes> midfielderAttributes;

    private EnumSet<AttackerAttributes> attackerAttributes;

    public PlayerAttributes(RoleType roleType) {
        this.roleType = roleType;

        switch (roleType) {
            case DEFESA:
                defenderAttributes = EnumSet.allOf(DefenderAttributes.class);
                break;
            case GOLEIRO:
                goalkeeperAttributes = EnumSet.allOf(GoalkeeperAttributes.class);
                break;
            case MEIO_CAMPO:
                midfielderAttributes = EnumSet.allOf(MidfielderAttributes.class);
                break;
            case ATAQUE:
                attackerAttributes = EnumSet.allOf(AttackerAttributes.class);
                break;
            default:
                throw new IllegalArgumentException("Invalid RoleType");
        }
    }

    public EnumSet<DefenderAttributes> getDefenderAttributes() {
        return defenderAttributes;
    }

    public EnumSet<GoalkeeperAttributes> getGoalkeeperAttributes() {
        return goalkeeperAttributes;
    }

    public EnumSet<MidfielderAttributes> getMidfielderAttributes() {
        return midfielderAttributes;
    }

    public EnumSet<AttackerAttributes> getAttackerAttributes() {
        return attackerAttributes;
    }

    public static void main(String[] args) {
        PlayerAttributes defenderAttributes = new PlayerAttributes(RoleType.DEFESA);

        EnumSet<DefenderAttributes> defenderAttrs = defenderAttributes.getDefenderAttributes();
        System.out.println("Defender Attributes: " + defenderAttrs);
    }
}
