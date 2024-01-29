package br.com.rickgurgel.Player;

import br.com.rickgurgel.Player.enums.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Player {

    public UUID id;
    public String name;
    public RoleType roleType;
    public Map<AttributeEnum, Double> attributes;

    public Player(UUID id, String name, RoleType roleType) {
        this.id = id;
        this.name = name;
        this.roleType = roleType;
        this.attributes = new HashMap<>();
        setAttributes();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Map<AttributeEnum, Double> getAttributes() {
        return attributes;
    }

    private void setAttributes() {
        // Initialize attributes based on the player's RoleType
        switch (roleType) {
            case DEFESA:
                for (DefenderAttributes defenderAttributes : DefenderAttributes.values()) {
                    attributes.put(defenderAttributes, 0.0);
                }
                break;
            case GOLEIRO:
                for (GoalkeeperAttributes goalkeeperAttr : GoalkeeperAttributes.values()) {
                    attributes.put(AttributeEnum.GOALS,0.0);  // Initialize with default values
                }
                break;
            // Add cases for other RoleTypes if needed
            case MEIO_CAMPO:
                break;
            case ATAQUE:
                break;
            default:
                throw new IllegalArgumentException("Invalid RoleType");
        }
    }
}
