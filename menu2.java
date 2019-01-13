package com.Game;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class menu2 {

    /**
     * 二级菜单
     * @param user 成功登陆的用户对象
     * @return 登陆后操作改变属性的用户对象
     */
    public User menu2(User user){
        Scanner scanner = new Scanner(System.in);
        for (;;){
            System.out.println();
            System.out.println("----------------");
            System.out.println("1.购买装备");
            System.out.println("2.查看金币");
            System.out.println("3.挑战Boss");
            System.out.println("4.查看英雄信息");
            System.out.println("5.退出登陆");
            int a = scanner.nextInt();
            switch (a){
                case 1:
                    buymenu(user);
                    break;
                case 2:
                    showGold(user);
                    break;
                case 3:
                    challengeBoss(user);
                    break;
                case 4:
                    showHero(user);
                    break;
                case 5:
                    return user;
                default:
                    break;
            }
        }

    }

    /**
     * 购买装备菜单，不循环，购买成功与否都回到二级菜单
     * @param user 成功登陆的用户对象
     */
    public void buymenu(User user){
        Equipment2 equipment = new Equipment2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.剑（提升攻击）");
        System.out.println("2.衣物（提升护甲）");
        System.out.println("3.鞋（提升闪避）");
        System.out.println("4.退出购买");
        int a = scanner.nextInt();
        switch (a){
            case 1:
                equipment.buySword(user);
                break;
            case 2:
                equipment.buyClothes(user);
                break;
            case 3:
                equipment.buyShoes(user);
                break;
            case 4:
                return;
            default:
                break;
        }
    }

    /**
     * 展示金币数量
     * @param user 登陆的用户数
     */
    private void showGold(User user) {
        System.out.println("您有金币共"+user.getGold()+"个");
    }


    /**
     * 挑战boss
     * @param user 成功登陆的用户对象
     */
    private void challengeBoss(User user) {
        Scanner scanner = new Scanner(System.in);
        FileInputStream file = null;
        try {
           file = new FileInputStream(".\\src\\com\\Game\\index\\boss.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectInputStream in = null;
        try {
           in = new ObjectInputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Boss> boss = null;
        try {
            boss = (ArrayList<Boss>)in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < boss.size(); i++) {
            System.out.println((i+1) + "." + boss.get(i).getName());
        }
        System.out.println("请选择你要挑战的Boss:");
        int a = scanner.nextInt();
        switch (a){
            case 1:
                fight(boss.get(a-1),user);
                break;
            case 2:
                fight(boss.get(a-1),user);
                break;
            case 3:
                fight(boss.get(a-1),user);
                break;
            case 4:
                fight(boss.get(a-1),user);
                break;
            case 5:
                fight(boss.get(a-1),user);
                break;
                default:
                    break;

        }

    }

    /**
     * 查看当前英雄信息
     * @param user 成功登陆的用户对象
     */
    private void showHero(User user){
        String[] sword = new String[]{"", "赤霄剑", "鱼肠剑", "太阿剑", "轩辕剑", "湛泸剑"};
        String[] clothes = new String[]{"", "森马", "罗蒙", "美邦", "艾米", "因为"};
        String[] shoe = new String[]{"", "耐克", "李宁", "安踏", "匡威", "回力"};
        System.out.println("英雄名称："+user.getHeroName());
        System.out.println("英雄等级："+user.getGrade());
        System.out.println("经验值："+user.getEmpiricalValue());
        System.out.println("英雄血量:"+user.getBlood());
        System.out.println("攻击力:"+user.getAttack());
        System.out.println("防御力:"+user.getDefense());
        System.out.println("闪避:"+user.getDodge());
        System.out.println("金币数量："+user.getGold());
        System.out.println("剑："+sword[user.getSword()]);
        System.out.println("衣物："+clothes[user.getClothes()]);
        System.out.println("鞋："+shoe[user.getShoe()]);

    }

    /**
     * 打boss方法
     * @param boss 用户选择的boss
     * @param user 成功登陆的用户对象
     */
    private void fight(Boss boss, User user) {

        Fight thread = new Fight(boss,user);
        thread.start();
        try {
            Thread.currentThread().sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
