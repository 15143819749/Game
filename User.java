package com.Game;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String userName;           //用户名
    private String password;           //密码
    private String heroName;           //英雄名
    private int gold;                  //金币数量
    private int blood;                 //血量
    private int attack;                //攻击力
    private int defense;               //防御力
    private int grade;                 //等级
    private int dodge;                 //闪避
    private int empiricalValue;        //经验值
    private Date nowDate;              //本次登陆时间
    private Date lastDate;             //上次登陆时间
    private int  Sword = 0;
    private int Clothes = 0;
    private int Shoe = 0;
    private int count = 1;        //登陆次数

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public int getSword() {
        return Sword;
    }

    public void setSword(int sword) {
        Sword = sword;
    }

    public int getClothes() {
        return Clothes;
    }

    public void setClothes(int clothes) {
        Clothes = clothes;
    }

    public int getShoe() {
        return Shoe;
    }

    public void setShoe(int shoe) {
        Shoe = shoe;
    }

    public User() {

    }

    public User(int gold, int blood, int attack, int defense, int grade, int dodge,int empiricalValue) {
        this.gold = gold;
        this.blood = blood;
        this.attack = attack;
        this.defense = defense;
        this.grade = grade;
        this.empiricalValue = empiricalValue;
        this.dodge = dodge;
    }

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

    public int getEmpiricalValue() {
        return empiricalValue;
    }

    public void setEmpiricalValue(int empiricalValue) {
        this.empiricalValue = empiricalValue;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getNowDate() {
        return nowDate;
    }

    public void setNowDate(Date nowDate) {
        this.nowDate = nowDate;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }


    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", heroName='" + heroName + '\'' +
                '}';
    }

}
