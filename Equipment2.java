package com.Game;

import java.util.Scanner;

public class Equipment2 {
    static String[] sword = new String[]{"", "赤霄剑", "鱼肠剑", "太阿剑", "轩辕剑", "湛泸剑"};

    static String[] clothes = new String[]{"", "森马", "罗蒙", "美邦", "艾米", "因为"};

    static String[] shoe = new String[]{"", "耐克", "李宁", "安踏", "匡威", "回力"};

    static String[] caidan = {"攻击力","防御力","闪避","名剑","名牌","鞋","熊成：","张传薪：","于谨豪："};

    public void buySword(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("熊成：哎哟，客官，您来啦，快楼上请！！！");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("熊成：洒家这里是卖剑的，快挑一把趁手的宝剑，你就会更强");
        System.out.println("1.赤霄剑    攻击力+10    售价10金币");
        System.out.println("2.鱼肠剑    攻击力+20    售价20金币");
        System.out.println("3.太阿剑    攻击力+30    售价30金币");
        System.out.println("4.轩辕剑    攻击力+40    售价40金币");
        System.out.println("5.湛泸剑    攻击力+50    售价50金币");
        int b = 0;
        int a = scanner.nextInt();
        switch (a) {
            case 1:user.setSword(caseThing(a,user,b,sword,user.getSword()));
                break;
            case 2:user.setSword(caseThing(a,user,b,sword,user.getSword()));
                break;
            case 3:user.setSword(caseThing(a,user,b,sword,user.getSword()));
                break;
            case 4:user.setSword(caseThing(a,user,b,sword,user.getSword()));
                break;
            case 5:user.setSword(caseThing(a,user,b,sword,user.getSword()));
                break;
        }
    }

    public void buyClothes(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("张传薪：哎哟，客官，您来啦，快楼上请！！！");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("张传薪：洒家这里是卖衣服的，快挑一件合身的衣服，你就会更抗揍");
        System.out.println("1.森马    防御力+10    售价10金币");
        System.out.println("2.罗蒙    防御力+20    售价20金币");
        System.out.println("3.美邦    防御力+30    售价30金币");
        System.out.println("4.艾米    防御力+40    售价40金币");
        System.out.println("5.因为    防御力+50    售价50金币");
        int b = 1;
        int a = scanner.nextInt();                                                              //a：要买的装备的序号
        switch (a) {
            case 1:user.setClothes(caseThing(a,user,b,clothes,user.getClothes()));
                break;
            case 2:user.setClothes(caseThing(a,user,b,clothes,user.getClothes()));
                break;
            case 3:user.setClothes(caseThing(a,user,b,clothes,user.getClothes()));
                break;
            case 4:user.setClothes(caseThing(a,user,b,clothes,user.getClothes()));
                break;
            case 5:user.setClothes(caseThing(a,user,b,clothes,user.getClothes()));
                break;
        }
    }

    public void buyShoes(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("于谨豪：哎哟，客官，您来啦，快楼上请！！！");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("于谨豪：洒家这里是卖鞋的，快挑一把趁脚的好鞋，你就会跑的更快");
        System.out.println("1.耐克    闪避+10    售价10金币");
        System.out.println("2.李宁    闪避+20    售价20金币");
        System.out.println("3.安踏    闪避+30    售价30金币");
        System.out.println("4.匡威    闪避+40    售价40金币");
        System.out.println("5.回力    闪避+50    售价50金币");
        int b = 2;
        int a = scanner.nextInt();
        switch (a) {
            case 1:user.setShoe(caseThing(a,user,b,shoe,user.getShoe()));
                break;
            case 2:user.setShoe(caseThing(a,user,b,shoe,user.getShoe()));
                break;
            case 3:user.setShoe(caseThing(a,user,b,shoe,user.getShoe()));
                break;
            case 4:user.setShoe(caseThing(a,user,b,shoe,user.getShoe()));
                break;
            case 5:user.setShoe(caseThing(a,user,b,shoe,user.getShoe()));
                break;
        }
    }

    public int caseThing(int a,User user,int d,String[] thing,int p){                        //p:现有的装备的序号
        Scanner scanner = new Scanner(System.in);
        if (user.getGold()>=(a*10)){                                                         //金币够不够买装备
            if (p < a){                                                                      //金币够了，判断持有的装备是不是更好
                user.setGold(user.getGold()-(a*10));
                System.out.print(caidan[d+6]+"客官，您成功购买"+thing[a]);
                qufen(d,user,p,a);
                System.out.println("剩余金币："+user.getGold()+"个");
                return a;
            }else if (user.getSword()== a){
                System.out.println(caidan[d+6]+"您手里有一把"+thing[a]+"（同一类装备只能装备一把），是否重新购买(Y/N):");
                System.out.print(caidan[d+6]+"购买新"+thing[a]+"后，我将以半价的价格回收旧"+thing[a]);
                String b = scanner.next();
                if (b.equals("Y")||b.equals("y")){
                    System.out.println(caidan[d+6]+"客官，您成功购买"+thing[a]+",但"+caidan[d]+"不变");
                    user.setGold(user.getGold()-user.getSword()*5);
                    System.out.println("剩余金币："+user.getGold()+"个");
                }else{
                    System.out.println(caidan[d+6]+"傻逼，不买"+thing[a]+"滚");
                    return p;
                }
            }else{
                System.out.println(caidan[d+6]+"您现有的装备比"+thing[a]+"好，仍然购买"+thing[a]+"吗？");
                System.out.print(caidan[d+6]+"购买"+thing[a]+"后，我将以半价的价格回收");
                switch (p){
                    case 1:
                        System.out.println(thing[1]);
                        break;
                    case 2:
                        System.out.println(thing[2]);
                        break;
                    case 3:
                        System.out.println(thing[3]);
                        break;
                    case 4:
                        System.out.println(thing[4]);
                        break;
                    case 5:
                        System.out.println(thing[5]);
                        break;
                }
                System.out.println("是否继续（Y/N）：");
                String c = scanner.next();
                if (c.equals("Y")||c.equals("y")){
                    user.setGold(user.getGold()+user.getSword()*5-(a*10));
                    System.out.print(caidan[d+6]+"您成功购买"+thing[a]+"，");
                    qufen(d,user,p,a);
                    System.out.println("剩余金币："+user.getGold()+"个");
                    return a;
                }else return p;
            }
        }else {
            System.out.println(caidan[d+6]+"穷逼，没钱买什么"+caidan[d+3]);
            return p;
        }
        return p;
    }

    private void qufen(int d,User user,int p,int a) {
        switch (d){
            case 0:
                user.setAttack(user.getAttack()-p*10+(a*10));                 //现在买装备就加攻击力
                System.out.println("现"+caidan[d]+"为:"+user.getAttack());
                break;
            case 1:
                user.setDefense(user.getDefense()-p*10+(a*10));                 //现在买衣服就加防御力
                System.out.println("现"+caidan[d]+"为:"+user.getDefense());
                break;
            case 2:
                user.setDodge(user.getDodge()-p*10+(a*10));                 //现在买鞋就加闪避
                System.out.println("现"+caidan[d]+"为:"+user.getDodge());
                break;
        }
    }
}
