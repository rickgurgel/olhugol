package br.com.rickgurgel.Player.enums;

import java.util.EnumSet;

// PlayerAttributes.java
public class PlayerAttributes {
    private RoleType roleType;

    // Defender Attributes
    private EnumSet<DefenderAttributes> defenderAttributes;

    // Goalkeeper Attributes
    private EnumSet<GoalkeeperAttributes> goalkeeperAttributes;

    // Midfielder Attributes
    private EnumSet<MidfielderAttributes> midfielderAttributes;

    // Attacker Attributes
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

    // Getter methods for specific attribute sets
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
        // Example: Creating PlayerAttributes for a Defender
        PlayerAttributes defenderAttributes = new PlayerAttributes(RoleType.DEFESA);

        // Accessing Defender-specific attributes
        EnumSet<DefenderAttributes> defenderAttrs = defenderAttributes.getDefenderAttributes();
        System.out.println("Defender Attributes: " + defenderAttrs);
    }
}
