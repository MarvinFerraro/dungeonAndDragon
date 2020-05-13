package com.dungeon_and_dragon.characters;

public abstract class Hero {

    protected String name;
    protected int hp;
    protected int strength;
    protected String leftHand;
    protected String rightHand;

    public Hero() {
        name = "Inconnu";
        hp = 0;
        strength = 0;
    }

    public Hero(String nameChoose) {
        name = nameChoose;
        hp = 0;
        strength = 0;
    }

    public Hero(String nameChoose, int hpChoose, int strengthChoose) {
        name = nameChoose;
        hp = hpChoose;
        strength = strengthChoose;
    }


    /**
     * getName
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getHp
     * @return hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * setHp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * getStrengh
     * @return strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * setStrength
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * getLeftHand
     * @return leftHand
     */
    public String getLeftHand() {
        return leftHand;
    }

    /**
     * setLeftHand
     */
    public void setLeftHand(String leftHand) {
        this.leftHand = leftHand;
    }

    /**
     * getRightHand
     * @return rightHand
     */
    public String getRightHand() {
        return rightHand;
    }

    /**
     * setRightHand
     */
    public void setRightHand(String rightHand) {
        this.rightHand = rightHand;
    }
}
