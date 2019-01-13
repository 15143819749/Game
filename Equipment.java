package com.Game;

import java.util.Scanner;

public class Equipment {
    public void buySword(User user){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.赤霄剑    攻击力+10    售价10金币");
        System.out.println("2.鱼肠剑    攻击力+20    售价20金币");
        System.out.println("3.太阿剑    攻击力+30    售价30金币");
        System.out.println("4.轩辕剑    攻击力+40    售价40金币");
        System.out.println("5.湛泸剑    攻击力+50    售价50金币");
        int a = scanner.nextInt();
        switch (a){
            case 1:{
                    if (user.getGold()>(a*10)){                                                             //金币够不够买装备
                        if (user.getSword() < a){                                                       //金币够了，判断持有的装备是不是更好
                            user.setGold(user.getGold()-(a*10));
                            System.out.print("客官，您成功购买赤霄剑,");
                            user.setAttack(user.getAttack()-user.getSword()*10+(a*10));
                            System.out.println("现攻击力为:"+user.getAttack());
                            System.out.println("剩余金币："+user.getGold()+"个");
                            user.setSword(a);
                        }else if (user.getSword()== a){
                            System.out.println("您手里有一把赤霄剑（同一类装备只能装备一把），是否重新购买(Y/N):");
                            System.out.print("购买新赤霄剑后，我们将以半价的价格回收旧赤霄剑");
                            String b = scanner.next();
                            if (b.equals("Y")||b.equals("y")){
                                System.out.println("客官，您成功购买赤霄剑,但攻击力不变");
                                user.setGold(user.getGold()-user.getSword()*5);
                                System.out.println("剩余金币："+user.getGold()+"个");
                            }else{
                                System.out.println("您取消了购买赤霄剑");
                            }
                        }else{
                            System.out.println("您现有的装备比赤霄剑好，仍然购买赤霄剑吗？");
                            System.out.print("购买赤霄剑后，我们将以半价的价格回收");
                            switch (user.getSword()){
                                case 1:
                                    System.out.println("赤霄剑");
                                    break;
                                case 2:
                                    System.out.println("鱼肠剑");
                                    break;
                                case 3:
                                    System.out.println("太阿剑");
                                    break;
                                case 4:
                                    System.out.println("轩辕剑");
                                    break;
                                case 5:
                                    System.out.println("湛泸剑");
                                    break;
                            }
                            System.out.println("是否继续（Y/N）：");
                            String c = scanner.next();
                            if (c.equals("Y")||c.equals("y")){
                                user.setGold(user.getGold()+user.getSword()*5-(a*10));
                                System.out.print("您成功购买赤霄剑，");
                                user.setAttack(user.getAttack()-user.getSword()*10+(a*10));
                                System.out.println("现攻击力为:"+user.getAttack());
                                System.out.println("剩余金币："+user.getGold()+"个");
                                user.setSword(a);
                            }
                        }
                    }else {
                        System.out.println("穷逼，没钱买什么名剑");
                    }
                }
            break;
            case 2:{
                if (user.getGold()>(a*10)){                                                             //金币够不够买装备
                    if (user.getSword() < a){                                                       //金币够了，判断持有的装备是不是更好
                        user.setGold(user.getGold()-(a*10));
                        System.out.print("客官，您成功购买鱼肠剑,");
                        user.setAttack(user.getAttack()-user.getSword()*10+20);
                        System.out.println("现攻击力为:"+user.getAttack());
                        System.out.println("剩余金币："+user.getGold()+"个");
                        user.setSword(a);
                    }else if (user.getSword()== a){
                        System.out.println("您手里有一把鱼肠剑（同一类装备只能装备一把），是否重新购买(Y/N):");
                        System.out.print("购买新鱼肠剑后，我们将以半价的价格回收旧鱼肠剑");
                        String b = scanner.next();
                        if (b.equals("Y")||b.equals("y")){
                            System.out.println("客官，您成功购买鱼肠剑,但攻击力不变");
                            user.setGold(user.getGold()-user.getSword()*5);
                            System.out.println("剩余金币："+user.getGold()+"个");
                        }else{
                            System.out.println("您取消了购买鱼肠剑");
                        }
                    }else{
                        System.out.println("您现有的装备比鱼肠剑好，仍然购买鱼肠剑吗？");
                        System.out.print("购买鱼肠剑后，我们将以半价的价格回收");
                        switch (user.getSword()){
                            case 1:
                                System.out.println("赤霄剑");
                                break;
                            case 2:
                                System.out.println("鱼肠剑");
                                break;
                            case 3:
                                System.out.println("太阿剑");
                                break;
                            case 4:
                                System.out.println("轩辕剑");
                                break;
                            case 5:
                                System.out.println("湛泸剑");
                                break;
                        }
                        System.out.println("是否继续（Y/N）：");
                        String c = scanner.next();
                        if (c.equals("Y")||c.equals("y")) {
                            user.setGold(user.getGold() + user.getSword() * 5 - (a*10));
                            System.out.print("您成功购买鱼肠剑，");
                            user.setAttack(user.getAttack() - user.getSword() * 10 + (a*10));
                            System.out.println("现攻击力为:" + user.getAttack());
                            System.out.println("剩余金币："+user.getGold()+"个");
                            user.setSword(a);
                        }
                    }
                }else {
                    System.out.println("穷逼，没钱买什么名剑");
                }
            }
                break;
            case 3:{
                if (user.getGold()>(a*10)){                                                             //金币够不够买装备
                    if (user.getSword() < a){                                                       //金币够了，判断持有的装备是不是更好
                        user.setGold(user.getGold()-(a*10));
                        System.out.print("客官，您成功购买太阿剑,");
                        user.setAttack(user.getAttack()-user.getSword()*10+(a*10));
                        System.out.println("现攻击力为:"+user.getAttack());
                        System.out.println("剩余金币："+user.getGold()+"个");
                        user.setSword(a);
                    }else if (user.getSword()== a){
                        System.out.println("您手里有一把太阿剑（同一类装备只能装备一把），是否重新购买(Y/N):");
                        System.out.print("购买新太阿剑后，我们将以半价的价格回收旧太阿剑");
                        String b = scanner.next();
                        if (b.equals("Y")||b.equals("y")){
                            System.out.println("客官，您成功购买太阿剑,但攻击力不变");
                            user.setGold(user.getGold()-user.getSword()*5);
                            System.out.println("剩余金币："+user.getGold()+"个");
                        }else{
                            System.out.println("您取消了购买鱼肠剑");
                        }
                    }else{
                        System.out.println("您现有的装备比太阿剑好，仍然购买太阿剑吗？");
                        System.out.print("购买太阿剑后，我们将以半价的价格回收");
                        switch (user.getSword()){
                            case 1:
                                System.out.println("赤霄剑");
                                break;
                            case 2:
                                System.out.println("鱼肠剑");
                                break;
                            case 3:
                                System.out.println("太阿剑");
                                break;
                            case 4:
                                System.out.println("轩辕剑");
                                break;
                            case 5:
                                System.out.println("湛泸剑");
                                break;
                        }
                        System.out.println("是否继续（Y/N）：");
                        String c = scanner.next();
                        if (c.equals("Y")||c.equals("y")) {
                            user.setGold(user.getGold() + user.getSword() * 5 - (a*10));
                            System.out.print("您成功购买太阿剑，");
                            user.setAttack(user.getAttack() - user.getSword() * 10 + (a*10));
                            System.out.println("现攻击力为:" + user.getAttack());
                            System.out.println("剩余金币："+user.getGold()+"个");
                            user.setSword(a);
                        }
                    }
                }else {
                    System.out.println("穷逼，没钱买什么名剑");
                }
            }
                break;
            case 4:{
                if (user.getGold()>(a*10)){                                                             //金币够不够买装备
                    if (user.getSword() < a){                                                       //金币够了，判断持有的装备是不是更好
                        user.setGold(user.getGold()-(a*10));
                        System.out.print("客官，您成功购买轩辕剑,");
                        user.setAttack(user.getAttack()-user.getSword()*10+(a*10));
                        System.out.println("现攻击力为:"+user.getAttack());
                        System.out.println("剩余金币："+user.getGold()+"个");
                        user.setSword(a);
                    }else if (user.getSword()== a){
                        System.out.println("您手里有一把轩辕剑（同一类装备只能装备一把），是否重新购买(Y/N):");
                        System.out.print("购买新轩辕剑后，我们将以半价的价格回收旧轩辕剑");
                        String b = scanner.next();
                        if (b.equals("Y")||b.equals("y")){
                            System.out.println("客官，您成功购买轩辕剑,但攻击力不变");
                            user.setGold(user.getGold()-user.getSword()*5);
                            System.out.println("剩余金币："+user.getGold()+"个");
                        }else{
                            System.out.println("您取消了购买轩辕剑");
                        }
                    }else{
                        System.out.println("您现有的装备比轩辕剑好，仍然购买轩辕剑吗？");
                        System.out.print("购买轩辕剑后，我们将以半价的价格回收");
                        switch (user.getSword()){
                            case 1:
                                System.out.println("赤霄剑");
                                break;
                            case 2:
                                System.out.println("鱼肠剑");
                                break;
                            case 3:
                                System.out.println("太阿剑");
                                break;
                            case 4:
                                System.out.println("轩辕剑");
                                break;
                            case 5:
                                System.out.println("湛泸剑");
                                break;
                        }
                        System.out.println("是否继续（Y/N）：");
                        String c = scanner.next();
                        if (c.equals("Y")||c.equals("y")) {
                            user.setGold(user.getGold() + user.getSword() * 5 - (a*10));
                            System.out.print("您成功购买轩辕剑，");
                            user.setAttack(user.getAttack() - user.getSword() * 10 + (a*10));
                            System.out.println("现攻击力为:" + user.getAttack());
                            System.out.println("剩余金币："+user.getGold()+"个");
                            user.setSword(a);
                        }
                    }
                }else {
                    System.out.println("穷逼，没钱买什么名剑");
                }
            }
                break;
            case 5:{
                if (user.getGold()>(a*10)){                                                             //金币够不够买装备
                    if (user.getSword() < a){                                                       //金币够了，判断持有的装备是不是更好
                        user.setGold(user.getGold()-(a*10));
                        System.out.print("客官，您成功购买湛泸剑,");
                        user.setAttack(user.getAttack()-user.getSword()*10+(a*10));
                        System.out.println("现攻击力为:"+user.getAttack());
                        System.out.println("剩余金币："+user.getGold()+"个");
                        user.setSword(a);
                    }else{
                        System.out.println("您手里有一把湛泸剑（同一类装备只能装备一把），是否重新购买(Y/N):");
                        System.out.print("购买新湛泸剑后，我们将以半价的价格回收旧湛泸剑");
                        String b = scanner.next();
                        if (b.equals("Y")||b.equals("y")){
                            System.out.println("客官，您成功购买湛泸剑,但攻击力不变");
                            user.setGold(user.getGold()-user.getSword()*5);
                            System.out.println("剩余金币："+user.getGold()+"个");
                        }else{
                            System.out.println("您取消了购买轩辕剑");
                        }
                    }
                }else {
                    System.out.println("穷逼，没钱买什么名剑");
                }
            }
                break;
                default:
                    break;
        }
    }
    public void buyClothes(User user){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.森马    防御力+10    售价10金币");
        System.out.println("2.罗蒙    防御力+20    售价20金币");
        System.out.println("3.美邦    防御力+30    售价30金币");
        System.out.println("4.艾米    防御力+40    售价40金币");
        System.out.println("5.因为    防御力+50    售价50金币");
        int a = scanner.nextInt();
        switch (a){
            case 1:{
                if (user.getGold()>(a*10)){                                                             //金币够不够买装备
                    if (user.getClothes() < a){                                                       //金币够了，判断持有的装备是不是更好
                        user.setGold(user.getGold()-(a*10));
                        System.out.print("客官，您成功购买森马,");
                        user.setDefense(user.getDefense()-user.getClothes()*10+(a*10));
                        System.out.println("现防御力为:"+user.getDefense());
                        System.out.println("剩余金币："+user.getGold()+"个");
                        user.setClothes(a);
                    }else if (user.getClothes()== 1){
                        System.out.println("您身上穿着森马（同一类装备只能装备一件），是否重新购买(Y/N):");
                        System.out.print("购买新森马后，我们将以半价的价格回收旧森马");
                        String b = scanner.next();
                        if (b.equals("Y")||b.equals("y")){
                            System.out.println("客官，您成功购买森马,但防御力不变");
                            user.setGold(user.getGold()-user.getClothes()*5);
                            System.out.println("剩余金币："+user.getGold()+"个");
                        }else{
                            System.out.println("您取消了购买森马");
                        }
                    }else{
                        System.out.println("您现有的装备比森马好，仍然购买森马吗？");
                        System.out.print("购买森马后，我们将以半价的价格回收");
                        switch (user.getClothes()){
                            case 1:
                                System.out.println("森马");
                                break;
                            case 2:
                                System.out.println("罗蒙");
                                break;
                            case 3:
                                System.out.println("美邦");
                                break;
                            case 4:
                                System.out.println("艾米");
                                break;
                            case 5:
                                System.out.println("因为");
                                break;
                        }
                        System.out.println("是否继续（Y/N）：");
                        String c = scanner.next();
                        if (c.equals("Y")||c.equals("y")){
                            user.setGold(user.getGold()+user.getClothes()*5-(a*10));
                            System.out.print("您成功购买森马，");
                            user.setDefense(user.getDefense()-user.getClothes()*10+(a*10));
                            System.out.println("现防御力为:"+user.getDefense());
                            System.out.println("剩余金币："+user.getGold()+"个");
                            user.setClothes(a);
                        }
                    }
                }else {
                    System.out.println("穷逼，没钱买什么名牌服装");
                }
            }
            break;
            case 2:{
                if (user.getGold()>(a*10)){                                                             //金币够不够买装备
                    if (user.getClothes() < a){                                                       //金币够了，判断持有的装备是不是更好
                        user.setGold(user.getGold()-(a*10));
                        System.out.print("客官，您成功购买罗蒙,");
                        user.setDefense(user.getDefense()-user.getClothes()*10+(a*10));
                        System.out.println("现防御力为:"+user.getDefense());
                        System.out.println("剩余金币："+user.getGold()+"个");
                        user.setClothes(a);
                    }else if (user.getClothes()== 2){
                        System.out.println("您身上穿着罗蒙（同一类装备只能装备一件），是否重新购买(Y/N):");
                        System.out.print("购买新罗蒙后，我们将以半价的价格回收旧罗蒙");
                        String b = scanner.next();
                        if (b.equals("Y")||b.equals("y")){
                            System.out.println("客官，您成功购买罗蒙,但防御力不变");
                            user.setGold(user.getGold()-user.getClothes()*5);
                            System.out.println("剩余金币："+user.getGold()+"个");
                        }else{
                            System.out.println("您取消了购买罗蒙");
                        }
                    }else{
                        System.out.println("您现有的装备比罗蒙好，仍然购买罗蒙吗？");
                        System.out.print("购买罗蒙后，我们将以半价的价格回收");
                        switch (user.getClothes()){
                            case 1:
                                System.out.println("森马");
                                break;
                            case 2:
                                System.out.println("罗蒙");
                                break;
                            case 3:
                                System.out.println("美邦");
                                break;
                            case 4:
                                System.out.println("艾米");
                                break;
                            case 5:
                                System.out.println("因为");
                                break;
                        }
                        System.out.println("是否继续（Y/N）：");
                        String c = scanner.next();
                        if (c.equals("Y")||c.equals("y")){
                            user.setGold(user.getGold()+user.getClothes()*5-(a*10));
                            System.out.print("您成功购买罗蒙，");
                            user.setDefense(user.getDefense()-user.getClothes()*10+(a*10));
                            System.out.println("现防御力为:"+user.getDefense());
                            System.out.println("剩余金币："+user.getGold()+"个");
                            user.setClothes(a);
                        }
                    }
                }else {
                    System.out.println("穷逼，没钱买什么名牌服装");
                }
            }
            break;
            case 3:{
                if (user.getGold()>(a*10)){                                                             //金币够不够买装备
                    if (user.getClothes() < a){                                                       //金币够了，判断持有的装备是不是更好
                        user.setGold(user.getGold()-(a*10));
                        System.out.print("客官，您成功购买美邦,");
                        user.setDefense(user.getDefense()-user.getClothes()*10+(a*10));
                        System.out.println("现防御力为:"+user.getDefense());
                        System.out.println("剩余金币："+user.getGold()+"个");
                        user.setClothes(a);
                    }else if (user.getClothes()== 2){
                        System.out.println("您身上穿着美邦（同一类装备只能装备一件），是否重新购买(Y/N):");
                        System.out.print("购买新美邦后，我们将以半价的价格回收旧美邦");
                        String b = scanner.next();
                        if (b.equals("Y")||b.equals("y")){
                            System.out.println("客官，您成功购买美邦,但防御力不变");
                            user.setGold(user.getGold()-user.getClothes()*5);
                            System.out.println("剩余金币："+user.getGold()+"个");
                        }else{
                            System.out.println("您取消了购买美邦");
                        }
                    }else{
                        System.out.println("您现有的装备比美邦好，仍然购买美邦吗？");
                        System.out.print("购买美邦后，我们将以半价的价格回收");
                        switch (user.getClothes()){
                            case 1:
                                System.out.println("森马");
                                break;
                            case 2:
                                System.out.println("罗蒙");
                                break;
                            case 3:
                                System.out.println("美邦");
                                break;
                            case 4:
                                System.out.println("艾米");
                                break;
                            case 5:
                                System.out.println("因为");
                                break;
                        }
                        System.out.println("是否继续（Y/N）：");
                        String c = scanner.next();
                        if (c.equals("Y")||c.equals("y")){
                            user.setGold(user.getGold()+user.getClothes()*5-(a*10));
                            System.out.print("您成功购买美邦，");
                            user.setDefense(user.getDefense()-user.getClothes()*10+(a*10));
                            System.out.println("现防御力为:"+user.getDefense());
                            System.out.println("剩余金币："+user.getGold()+"个");
                            user.setClothes(a);
                        }
                    }
                }else {
                    System.out.println("穷逼，没钱买什么名牌服装");
                }
            }
            break;
            case 4:{
                if (user.getGold()>(a*10)){                                                             //金币够不够买装备
                    if (user.getClothes() < a){                                                       //金币够了，判断持有的装备是不是更好
                        user.setGold(user.getGold()-(a*10));
                        System.out.print("客官，您成功购买艾米,");
                        user.setDefense(user.getDefense()-user.getClothes()*10+(a*10));
                        System.out.println("现防御力为:"+user.getDefense());
                        System.out.println("剩余金币："+user.getGold()+"个");
                        user.setClothes(a);
                    }else if (user.getClothes()== 2){
                        System.out.println("您身上穿着艾米（同一类装备只能装备一件），是否重新购买(Y/N):");
                        System.out.print("购买新艾米后，我们将以半价的价格回收旧艾米");
                        String b = scanner.next();
                        if (b.equals("Y")||b.equals("y")){
                            System.out.println("客官，您成功购买艾米,但防御力不变");
                            user.setGold(user.getGold()-user.getClothes()*5);
                            System.out.println("剩余金币："+user.getGold()+"个");
                        }else{
                            System.out.println("您取消了购买艾米");
                        }
                    }else{
                        System.out.println("您现有的装备比艾米好，仍然购买艾米吗？");
                        System.out.print("购买艾米后，我们将以半价的价格回收");
                        switch (user.getClothes()){
                            case 1:
                                System.out.println("森马");
                                break;
                            case 2:
                                System.out.println("罗蒙");
                                break;
                            case 3:
                                System.out.println("美邦");
                                break;
                            case 4:
                                System.out.println("艾米");
                                break;
                            case 5:
                                System.out.println("因为");
                                break;
                        }
                        System.out.println("是否继续（Y/N）：");
                        String c = scanner.next();
                        if (c.equals("Y")||c.equals("y")){
                            user.setGold(user.getGold()+user.getClothes()*5-(a*10));
                            System.out.print("您成功购买艾米，");
                            user.setDefense(user.getDefense()-user.getClothes()*10+(a*10));
                            System.out.println("现防御力为:"+user.getDefense());
                            System.out.println("剩余金币："+user.getGold()+"个");
                            user.setClothes(a);
                        }
                    }
                }else {
                    System.out.println("穷逼，没钱买什么名牌服装");
                }
            }
            break;
            case 5:{
                if (user.getGold()>(a*10)){                                                             //金币够不够买装备
                    if (user.getClothes() < a){                                                       //金币够了，判断持有的装备是不是更好
                        user.setGold(user.getGold()-(a*10));
                        System.out.print("客官，您成功购买因为,");
                        user.setDefense(user.getDefense()-user.getClothes()*10+(a*10));
                        System.out.println("现防御力为:"+user.getDefense());
                        System.out.println("剩余金币："+user.getGold()+"个");
                        user.setClothes(a);
                    }else if (user.getClothes()== 2){
                        System.out.println("您身上穿着因为（同一类装备只能装备一件），是否重新购买(Y/N):");
                        System.out.print("购买新因为后，我们将以半价的价格回收旧因为");
                        String b = scanner.next();
                        if (b.equals("Y")||b.equals("y")){
                            System.out.println("客官，您成功购买因为,但防御力不变");
                            user.setGold(user.getGold()-user.getClothes()*5);
                            System.out.println("剩余金币："+user.getGold()+"个");
                        }else{
                            System.out.println("您取消了购买因为");
                        }
                    }else{
                        System.out.println("您现有的装备比因为好，仍然购买因为吗？");
                        System.out.print("购买因为后，我们将以半价的价格回收");
                        switch (user.getClothes()){
                            case 1:
                                System.out.println("森马");
                                break;
                            case 2:
                                System.out.println("罗蒙");
                                break;
                            case 3:
                                System.out.println("美邦");
                                break;
                            case 4:
                                System.out.println("艾米");
                                break;
                            case 5:
                                System.out.println("因为");
                                break;
                        }
                        System.out.println("是否继续（Y/N）：");
                        String c = scanner.next();
                        if (c.equals("Y")||c.equals("y")){
                            user.setGold(user.getGold()+user.getClothes()*5-(a*10));
                            System.out.print("您成功购买因为，");
                            user.setDefense(user.getDefense()-user.getClothes()*10+(a*10));
                            System.out.println("现防御力为:"+user.getDefense());
                            System.out.println("剩余金币："+user.getGold()+"个");
                            user.setClothes(a);
                        }
                    }
                }else {
                    System.out.println("穷逼，没钱买什么名牌服装");
                }
            }
            break;
            default:
                break;
        }
    }
    public void buyShoes(User user){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.耐克    闪避+10    售价10金币");
        System.out.println("2.李宁    闪避+20    售价20金币");
        System.out.println("3.安踏    闪避+30    售价30金币");
        System.out.println("4.匡威    闪避+40    售价40金币");
        System.out.println("5.回力    闪避+50    售价50金币");
        int a = scanner.nextInt();
        switch (a){
            case 1:{
                if (user.getGold()>(a*10)){                                                             //金币够不够买装备
                    if (user.getShoe() < a){                                                       //金币够了，判断持有的装备是不是更好
                        user.setGold(user.getGold()-(a*10));
                        System.out.print("客官，您成功购买耐克,");
                        user.setDodge(user.getDodge()-user.getShoe()*10+(a*10));
                        System.out.println("现闪避为:"+user.getDodge());
                        System.out.println("剩余金币："+user.getGold()+"个");
                        user.setShoe(a);
                    }else if (user.getShoe()== a){
                        System.out.println("您身上穿着耐克（同一类装备只能装备一件），是否重新购买(Y/N):");
                        System.out.print("购买新耐克后，我们将以半价的价格回收旧耐克");
                        String b = scanner.next();
                        if (b.equals("Y")||b.equals("y")){
                            System.out.println("客官，您成功购买耐克,但闪避不变");
                            user.setGold(user.getGold()-user.getShoe()*5);
                            System.out.println("剩余金币："+user.getGold()+"个");
                        }else{
                            System.out.println("您取消了购买森马");
                        }
                    }else{
                        System.out.println("您现有的装备比耐克好，仍然购买耐克吗？");
                        System.out.print("购买耐克后，我们将以半价的价格回收");
                        switch (user.getClothes()){
                            case 1:
                                System.out.println("耐克");
                                break;
                            case 2:
                                System.out.println("李宁");
                                break;
                            case 3:
                                System.out.println("安踏");
                                break;
                            case 4:
                                System.out.println("匡威");
                                break;
                            case 5:
                                System.out.println("回力");
                                break;
                        }
                        System.out.println("是否继续（Y/N）：");
                        String c = scanner.next();
                        if (c.equals("Y")||c.equals("y")){
                            user.setGold(user.getGold()+user.getShoe()*5-(a*10));
                            System.out.print("您成功购买耐克，");
                            user.setDodge(user.getDodge()-user.getShoe()*10+(a*10));
                            System.out.println("现闪避为:"+user.getDodge());
                            System.out.println("剩余金币："+user.getGold()+"个");
                            user.setShoe(a);
                        }
                    }
                }else {
                    System.out.println("穷逼，没钱买什么名牌鞋");
                }
            }
                break;
            case 2:{
                if (user.getGold()>(a*10)){                                                             //金币够不够买装备
                    if (user.getShoe() < a){                                                       //金币够了，判断持有的装备是不是更好
                        user.setGold(user.getGold()-(a*10));
                        System.out.print("客官，您成功购买李宁,");
                        user.setDodge(user.getDodge()-user.getShoe()*10+(a*10));
                        System.out.println("现闪避为:"+user.getDodge());
                        System.out.println("剩余金币："+user.getGold()+"个");
                        user.setShoe(a);
                    }else if (user.getShoe()== a){
                        System.out.println("您身上穿着李宁（同一类装备只能装备一件），是否重新购买(Y/N):");
                        System.out.print("购买新李宁后，我们将以半价的价格回收旧李宁");
                        String b = scanner.next();
                        if (b.equals("Y")||b.equals("y")){
                            System.out.println("客官，您成功购买李宁,但闪避不变");
                            user.setGold(user.getGold()-user.getShoe()*5);
                            System.out.println("剩余金币："+user.getGold()+"个");
                        }else{
                            System.out.println("您取消了购买李宁");
                        }
                    }else{
                        System.out.println("您现有的装备比李宁好，仍然购买李宁吗？");
                        System.out.print("购买李宁后，我们将以半价的价格回收");
                        switch (user.getClothes()){
                            case 1:
                                System.out.println("耐克");
                                break;
                            case 2:
                                System.out.println("李宁");
                                break;
                            case 3:
                                System.out.println("安踏");
                                break;
                            case 4:
                                System.out.println("匡威");
                                break;
                            case 5:
                                System.out.println("回力");
                                break;
                        }
                        System.out.println("是否继续（Y/N）：");
                        String c = scanner.next();
                        if (c.equals("Y")||c.equals("y")){
                            user.setGold(user.getGold()+user.getShoe()*5-(a*10));
                            System.out.print("您成功购买李宁，");
                            user.setDodge(user.getDodge()-user.getShoe()*10+(a*10));
                            System.out.println("现闪避为:"+user.getDodge());
                            System.out.println("剩余金币："+user.getGold()+"个");
                            user.setShoe(a);
                        }
                    }
                }else {
                    System.out.println("穷逼，没钱买什么名牌鞋");
                }
            }
                break;
            case 3:{
                if (user.getGold()>(a*10)){                                                             //金币够不够买装备
                    if (user.getShoe() < a){                                                       //金币够了，判断持有的装备是不是更好
                        user.setGold(user.getGold()-(a*10));
                        System.out.print("客官，您成功购买安踏,");
                        user.setDodge(user.getDodge()-user.getShoe()*10+(a*10));
                        System.out.println("现闪避为:"+user.getDodge());
                        System.out.println("剩余金币："+user.getGold()+"个");
                        user.setShoe(a);
                    }else if (user.getShoe()== a){
                        System.out.println("您身上穿着安踏（同一类装备只能装备一件），是否重新购买(Y/N):");
                        System.out.print("购买新安踏后，我们将以半价的价格回收旧安踏");
                        String b = scanner.next();
                        if (b.equals("Y")||b.equals("y")){
                            System.out.println("客官，您成功购买安踏,但闪避不变");
                            user.setGold(user.getGold()-user.getShoe()*5);
                            System.out.println("剩余金币："+user.getGold()+"个");
                        }else{
                            System.out.println("您取消了购买安踏");
                        }
                    }else{
                        System.out.println("您现有的装备比安踏好，仍然购买安踏吗？");
                        System.out.print("购买安踏后，我们将以半价的价格回收");
                        switch (user.getClothes()){
                            case 1:
                                System.out.println("耐克");
                                break;
                            case 2:
                                System.out.println("李宁");
                                break;
                            case 3:
                                System.out.println("安踏");
                                break;
                            case 4:
                                System.out.println("匡威");
                                break;
                            case 5:
                                System.out.println("回力");
                                break;
                        }
                        System.out.println("是否继续（Y/N）：");
                        String c = scanner.next();
                        if (c.equals("Y")||c.equals("y")){
                            user.setGold(user.getGold()+user.getShoe()*5-(a*10));
                            System.out.print("您成功购买安踏，");
                            user.setDodge(user.getDodge()-user.getShoe()*10+(a*10));
                            System.out.println("现闪避为:"+user.getDodge());
                            System.out.println("剩余金币："+user.getGold()+"个");
                            user.setShoe(a);
                        }
                    }
                }else {
                    System.out.println("穷逼，没钱买什么名牌鞋");
                }
            }
                break;
            case 4:{
                if (user.getGold()>(a*10)){                                                             //金币够不够买装备
                    if (user.getShoe() < a){                                                       //金币够了，判断持有的装备是不是更好
                        user.setGold(user.getGold()-(a*10));
                        System.out.print("客官，您成功购买匡威,");
                        user.setDodge(user.getDodge()-user.getShoe()*10+(a*10));
                        System.out.println("现闪避为:"+user.getDodge());
                        System.out.println("剩余金币："+user.getGold()+"个");
                        user.setShoe(a);
                    }else if (user.getShoe()== a){
                        System.out.println("您身上穿着匡威（同一类装备只能装备一件），是否重新购买(Y/N):");
                        System.out.print("购买新匡威后，我们将以半价的价格回收旧匡威");
                        String b = scanner.next();
                        if (b.equals("Y")||b.equals("y")){
                            System.out.println("客官，您成功购买匡威,但闪避不变");
                            user.setGold(user.getGold()-user.getShoe()*5);
                            System.out.println("剩余金币："+user.getGold()+"个");
                        }else{
                            System.out.println("您取消了购买匡威");
                        }
                    }else{
                        System.out.println("您现有的装备比匡威好，仍然购买匡威吗？");
                        System.out.print("购买匡威后，我们将以半价的价格回收");
                        switch (user.getClothes()){
                            case 1:
                                System.out.println("耐克");
                                break;
                            case 2:
                                System.out.println("李宁");
                                break;
                            case 3:
                                System.out.println("安踏");
                                break;
                            case 4:
                                System.out.println("匡威");
                                break;
                            case 5:
                                System.out.println("回力");
                                break;
                        }
                        System.out.println("是否继续（Y/N）：");
                        String c = scanner.next();
                        if (c.equals("Y")||c.equals("y")){
                            user.setGold(user.getGold()+user.getShoe()*5-(a*10));
                            System.out.print("您成功购买匡威，");
                            user.setDodge(user.getDodge()-user.getShoe()*10+(a*10));
                            System.out.println("现闪避为:"+user.getDodge());
                            System.out.println("剩余金币："+user.getGold()+"个");
                            user.setShoe(a);
                        }
                    }
                }else {
                    System.out.println("穷逼，没钱买什么名牌鞋");
                }
            }
                break;
            case 5:{
                if (user.getGold()>(a*10)){                                                             //金币够不够买装备
                    if (user.getShoe() < a){                                                       //金币够了，判断持有的装备是不是更好
                        user.setGold(user.getGold()-(a*10));
                        System.out.print("客官，您成功购买回力,");
                        user.setDodge(user.getDodge()-user.getShoe()*10+(a*10));
                        System.out.println("现闪避为:"+user.getDodge());
                        System.out.println("剩余金币："+user.getGold()+"个");
                        user.setShoe(a);
                    }else{
                        System.out.println("您身上穿着回力（同一类装备只能装备一件），是否重新购买(Y/N):");
                        System.out.print("购买新回力后，我们将以半价的价格回收旧回力");
                        String b = scanner.next();
                        if (b.equals("Y")||b.equals("y")){
                            System.out.println("客官，您成功购买回力,但闪避不变");
                            user.setGold(user.getGold()-user.getShoe()*5);
                            System.out.println("剩余金币："+user.getGold()+"个");
                        }else{
                            System.out.println("您取消了购买回力");
                        }
                    }
                }else {
                    System.out.println("穷逼，没钱买什么名牌鞋");
                }
            }
                break;
            default:
                break;
        }
    }
}
