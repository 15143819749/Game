package com.Game;

import java.io.Serializable;

public class Boss implements Serializable {
    private String name ;              //boss名字
    private int blood;                 //血量
    private int attack;                //攻击力
    private int defense;               //防御力
    private int grade;                 //等级

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Boss(String name, int blood, int attack, int defense, int grade) {
        this.name = name;
        this.blood = blood;
        this.attack = attack;
        this.defense = defense;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
