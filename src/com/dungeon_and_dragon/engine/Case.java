package com.dungeon_and_dragon.engine;

public abstract class Case {
    protected String name;
    protected String type;

    public Case() {
        this.name = "Inconnu";
        this.type = "Case";
    }

    public Case(String type) {
        this.type = type;
    }

    public String toString() {
        return "Type " + this.type;
    }
}
