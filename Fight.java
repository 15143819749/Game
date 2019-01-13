package com.Game;

public class Fight extends Thread {
    private Boss boss;
    private User user;
    @Override
    public void run() {
        int blood = user.getBlood();
        double fangyuUser = ((double)user.getDefense())/((double) (user.getDefense()+100));
        int shanghaiBoss = (int)(boss.getAttack()*(1-fangyuUser));
        double fangyuBoss = ((double) boss.getDefense())/((double)(boss.getDefense()+100));
        int shanghaiUser = (int)(user.getAttack()*(1-fangyuBoss));

        boolean winFlag = false;
        int goldGet;
        int jingyanGet;

        for (int i = 0; i < 100; i++) {
            int random = (int)(Math.random()*10);
            System.out.println("-------------------------");
            if (random%2 == 1){                           //boss对你进行攻击
                int random1 = (int)(Math.random()*200);
                if(user.getDodge()>random1){
                    System.out.println("闪避成功，"+boss.getName()+"对你没造成伤害");
                }else {
                    System.out.println(boss.getName()+"对你造成了"+shanghaiBoss+"伤害");
                    user.setBlood(user.getBlood()-shanghaiBoss);
                    System.out.println("你的血量为"+user.getBlood());
                }

            }else {                                       //你对boss进行攻击
                System.out.println("你对"+boss.getName()+"造成了"+shanghaiUser+"伤害");
                boss.setBlood(boss.getBlood()-shanghaiUser);
                System.out.println(boss.getName()+"的血量为"+boss.getBlood());
            }
            if (user.getBlood() <= 0){
                winFlag = true;
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("革命尚未成功,少年仍需努力！！！！！！");
                System.out.println("你被"+boss.getName()+"打死了，去购买强力装备再来挑战吧");
                jingyanGet = (boss.getGrade()*5);
                user.setEmpiricalValue(jingyanGet + user.getEmpiricalValue());
                System.out.println("你获得"+jingyanGet+"经验值");
                goldGet = (int)(Math.random()*10);
                user.setGold(user.getGold()+goldGet);
                System.out.println("你获得"+goldGet+"金币");
                break;
            }else if (boss.getBlood() <= 0){
                System.out.println();
                System.out.println();
                System.out.println();
                winFlag = true;
                System.out.println("YOU WINNER!!!!");
                System.out.println("你把"+boss.getName()+"打死了");
                jingyanGet = (boss.getGrade()*10);
                user.setEmpiricalValue(jingyanGet + user.getEmpiricalValue());
                System.out.println("你获得"+jingyanGet+"经验值");
                goldGet = (int)(Math.random()*100);
                user.setGold(user.getGold()+goldGet);
                System.out.println("你获得"+goldGet+"金币");
                break;
            }
        }
        user.setBlood(blood);
        if (!winFlag){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("骚年，你的攻击力不够啊，你和"+boss.getName()+"打平");
            System.out.println("快去更新装备再战吧！！！！！");
        }
        if (user.getEmpiricalValue()>=user.getGrade()*50){    //每升一级所需经验
            System.out.println();
            System.out.println();
            System.out.println();
            user.setGrade(user.getGrade()+1);
            System.out.println("你升级了，现在是"+user.getGrade()+"级");
            user.setEmpiricalValue(user.getEmpiricalValue()-(user.getGrade()-1)*50);
            user.setBlood(blood);
            user.setBlood(user.getBlood()+100);
            user.setAttack(user.getAttack()+10);
            user.setDefense(user.getDefense()+10);
            user.setDodge(user.getDodge()+10);
        }

    }

    public Fight(Boss boss, User user) {
        this.boss = boss;
        this.user = user;
    }
}
