package com.dungeon_and_dragon.characters;

import java.util.regex.*;

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
     * getName
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setName
     */
    public void setName(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        } else {
            System.out.println("Pas de valeur nul!");
        }
    }

    /**
     * getHp
     *
     * @return hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * setHp
     */
    public void setHp(int hp) {
        if (hp <= this.lifeMin && hp >= this.lifeMax)
        this.hp = hp;
        else if (hp < this.lifeMin)
            this.hp = this.lifeMin;
        else
            this.hp = this.lifeMax;
    }

    /**
     * getStrengh
     *
     * @return strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * setStrength
     */
    public void setStrength(int strength) {
        if (strength >= this.strengthMin && strength <= this.strengthMax)
        this.strength = strength;
        else if (strength < this.strengthMin)
            this.strength = this.strengthMin;
        else
            this.strength= this.strengthMax;
    }

    /**
     * getLeftHand
     *
     * @return leftHand
     */
    public String getLeftHand() {
        return leftHand;
    }

    /**
     * setLeftHand
     */
    public void setLeftHand(String leftHand) {
        if (name != null && !name.isEmpty()){
            this.leftHand = leftHand;
        } else {
            System.out.println("Pas de valeur nul!");
        }
    }

    /**
     * getRightHand
     *
     * @return rightHand
     */
    public String getRightHand() {
        return rightHand;
    }

    /**
     * setRightHand
     */
    public void setRightHand(String rightHand) {
        if (name != null && !name.isEmpty()){
            this.rightHand = rightHand;
        } else {
            System.out.println("Pas de valeur nul!");
        }
    }

    /**
     * getRightHand
     *
     * @return rightHand
     */
    public String getType() {
        return type;
    }

    /**
     * getLifeMin
     *
     * @return lifeMin
     */
    public int getLifeMin() {
        return lifeMin;
    }

    /**
     * getLifeMax
     *
     * @return lifeMax
     */
    public int getLifeMax() {
        return lifeMax;
    }

    /**
     * getStrengthMin
     *
     * @return strengthMin
     */
    public int getStrengthMin() {
        return strengthMin;
    }

    /**
     * getStrengthMax
     *
     * @return strengthMax
     */
    public int getStrengthMax() {
        return strengthMax;
    }
}
