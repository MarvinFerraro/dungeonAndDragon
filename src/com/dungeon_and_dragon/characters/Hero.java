package com.dungeon_and_dragon.characters;

public abstract class Hero {

    protected String name;
    protected int hp;
    protected int strength;
    protected String leftHand, rightHand;
    protected String type;

    protected int lifeMin;
    protected int lifeMax;
    protected int strengthMin;
    protected int strengthMax;

    public Hero() {
        this("Inconnu");
    }

    public Hero(String name) {
        this(name, 0, 0);
    }

    public Hero(String name, int hp, int strength) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
    }

    /**
     * Return a the String name of the object
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method take a String in param, for set the name attribute.
     *
     * @param name
     */
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Pas de valeur nul!");
        }
    }

    /**
     * Return a the Int hp of the object
     *
     * @return Int hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * Method take a Int in param, for set the hp (healthPoint) attribute.
     *
     * @param hp
     */
    public void setHp(int hp) {
        if (hp > 0 && hp <= this.lifeMax)
            this.hp = hp;
        else if (hp <= 0)
            this.hp = 0;
        else
            this.hp = this.lifeMax;
    }

    /**
     * Return a the Int strength of the object
     *
     * @return strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Method take a int in param, for set the strength attribute.
     *
     * @param strength
     */
    public void setStrength(int strength) {
        if (strength >= this.strengthMin && strength <= this.strengthMax)
            this.strength = strength;
        else if (strength < this.strengthMin)
            this.strength = this.strengthMin;
        else
            this.strength = this.strengthMax;
    }

    /**
     * To get the String getLeftHand
     *
     * @return String leftHand
     */
    public String getLeftHand() {
        return leftHand;
    }

    /**
     * Method take a String in param, for set the setLeftHand attribute.
     *
     * @param leftHand
     */
    public void setLeftHand(String leftHand) {
        if (name != null && !name.isEmpty()) {
            this.leftHand = leftHand;
        } else {
            System.out.println("Pas de valeur nul!");
        }
    }

    /**
     * To get the String getRightHand
     *
     * @return String rightHand
     */
    public String getRightHand() {
        return rightHand;
    }

    /**
     * Method take a String in param, for set the setLeftHand attribute.
     *
     * @param rightHand
     */
    public void setRightHand(String rightHand) {
        if (name != null && !name.isEmpty()) {
            this.rightHand = rightHand;
        } else {
            System.out.println("Pas de valeur nul!");
        }
    }

    /**
     * To get the String getRightHand
     *
     * @return String rightHand
     */
    public String getType() {
        return type;
    }

    /**
     * To get the int getLifeMin
     *
     * @return Int lifeMin
     */
    public int getLifeMin() {
        return lifeMin;
    }

    /**
     * To get the int getLifeMax
     *
     * @return Int lifeMax
     */
    public int getLifeMax() {
        return lifeMax;
    }

    /**
     *  To get the int getStrengthMin
     *
     * @return Int strengthMin
     */
    public int getStrengthMin() {
        return strengthMin;
    }

    /**
     *  To get the int getStrengthMax
     *
     * @return Int strengthMax
     */
    public int getStrengthMax() {
        return strengthMax;
    }
}
