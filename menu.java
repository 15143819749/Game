package com.Game;

import java.io.*;
import java.util.*;

public class menu{
    /**
     * 一级菜单
     */
    public void menu() {
        initializeBoss();
        initializeUser();
        System.out.println("欢迎来到打怪勇士");
        for (;;){
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~");
            System.out.println("1.注册");
            System.out.println("2.登陆");
            System.out.println("3.退出");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            switch (a){
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    return;
                case 404:
                    show();
                    break;
                default:
                    break;
            }
        }

    }


    /**
     * 初始化boss数据，创建boss文件，将boss属性写入文件
     */
    private void initializeBoss() {
        File file = new File(".\\src\\com\\Game\\index\\boss.txt");
        try {
            boolean newFile = file.createNewFile();
            if (!newFile){
                file.delete();
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectOutputStream stream = null;
        try {
            stream = new ObjectOutputStream(new FileOutputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Boss> boss = new ArrayList<>();
        Boss boss1 = new Boss("雄城",200,10,0,1);
        boss.add(boss1);
        Boss boss2 = new Boss("文益菌",400,20,10,2);
        boss.add(boss2);
        Boss boss3 = new Boss("发发",800,40,20,3);
        boss.add(boss3);
        Boss boss4 = new Boss("海海",1600,80,40,4);
        boss.add(boss4);
        Boss boss5 = new Boss("李老铁",3200,160,80,5);
        boss.add(boss5);

        Collections.sort(boss, new Comparator<Boss>() {
            @Override
            public int compare(Boss o1, Boss o2) {
                return o1.getGrade()-o2.getGrade();
            }
        });
        try {
            stream.writeObject(boss);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    /**
     * 初始化用户，如果不存在properties文件，就创建properties文件，properties文件用来存储用户数量，初始化的时，num为1
     */
    private void initializeUser() {
        File file = new File(".\\src\\com\\Game\\index\\info.properties");
        try {
            boolean newFile = file.createNewFile();
            if (newFile){                  //生成文件成功
                Properties prop = new Properties();
                try {
                    InputStream fis = new FileInputStream(file);
                    // 从输入流中读取属性列表（键和元素对）
                    prop.load(fis);
                    // 调用 Hashtable 的方法 put。使用 getProperty 方法提供并行性。
                    // 强制要求为属性的键和值使用字符串。返回值是 Hashtable 调用 put 的结果。
                    OutputStream fos = new FileOutputStream(file);
                    prop.setProperty("num", "1");
                    // 以适合使用 load 方法加载到 Properties 表中的格式，
                    // 将此 Properties 表中的属性列表（键和元素对）写入输出流
                    prop.store(fos, "Update '" + "ddd" + "' value");
                    fos.close();
                    fis.close();
                } catch (IOException e) {
                    System.err.println("Visit " + file + " for updating " + "ddd"
                            + " value error");
                }
            }else {                        //生成文件失败

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 注册方法
     *      用户注册的方法，用户如果不是第一个注册的，就将文件中的用户集合存到新的集合中，在将本次注册的用户
     *      添加到用户集合，并将用户集合存到文件中（覆盖）
     */
    public void register(){
        ArrayList<User> user1 = new ArrayList<User>();
        User user = new User(50,100,5,5,1,5,0);
        Scanner scanner = new Scanner(System.in);
        String name = "";

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File(".\\src\\com\\Game\\index\\info.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int num = Integer.parseInt(properties.getProperty("num"));
        if (num != 1){
            while(true){
                System.out.println("请输入用户名：");
                name = scanner.next();


                File file = new File(".\\src\\com\\Game\\index\\user.txt");

                ObjectInputStream in = null;
                try {
                    in = new ObjectInputStream(new FileInputStream(file));
                } catch (IOException e) {
                    break;
                }
                ArrayList<User> us = null;
                try {
                    us = (ArrayList<User>) in.readObject();
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

                boolean nameRepet = false;
                for (int i = 0; i < us.size(); i++) {
                    if (us.get(i).getUserName().equals(name)) {
                        nameRepet = true;
                    }
                }

                if (nameRepet){
                    System.out.println("您的用户名已经被占用，请重新输入");
                }else {
                    ObjectInputStream in1 = null;
                    try {
                        in1 = new ObjectInputStream(new FileInputStream(file));
                    } catch (IOException e) {
                    }
                    ArrayList<User> us1 = null;
                    try {
                        us1 = (ArrayList<User>) in1.readObject();
                        in1.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }

                    for (int i = 0; i < us.size(); i++) {
                        user1.add(us.get(i));
                    }
                    num++;

                    try {

                        OutputStream fos = new FileOutputStream(new File(".\\src\\com\\Game\\index\\info.properties"));
                        String s = String.valueOf(num);
                        properties.setProperty("num", s);
                        properties.store(fos, "Update '" + "ddd" + "' value");
                        fos.close();
                    } catch (IOException e) {
                        System.err.println("Visit " + " for updating " + "ddd"
                                + " value error");
                    }
                    break;
                }

            }


        }else{
            System.out.println("请输入用户名：");
            name = scanner.next();
            num++;

            try {
                File file = new File(".\\src\\com\\Game\\index\\info.properties");
                OutputStream fos = new FileOutputStream(file);
                String s = String.valueOf(num);
                properties.setProperty("num", s);
                properties.store(fos, "Update '" + "ddd" + "' value");
                fos.close();
            } catch (IOException e) {
                System.err.println("Visit " + " for updating " + "ddd"
                        + " value error");
            }


        }




        user.setUserName(name);
        System.out.println("请输入密码：");
        user.setPassword(scanner.next());





        user1.add(user);

        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(".\\src\\com\\Game\\index\\user.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.writeObject(user1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 登陆方法
     *      用户登陆，将文件中的用户集合取出，遍历，依据用户名找到用户对象，判断用户对象的密码是否正确，
     *      密码正确，则调用menu2()方法
     */
    public void login(){
        Scanner scanner = new Scanner(System.in);
        boolean nameFlag = false;
        int j = 1;
        File file = new File(".\\src\\com\\Game\\index\\user.txt");
        if (file.length()!=0){
            ObjectInputStream in = null;
            try {
                in = new ObjectInputStream(new FileInputStream(file));
            } catch (IOException e) {
                e.printStackTrace();
            }
            ArrayList<User> us = null;
            try {
                us = (ArrayList<User>) in.readObject();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            while (true){
                System.out.println("输入用户名：");
                String loginName = scanner.next();
                for (int i = 0; i < us.size(); i++) {
                    if (us.get(i).getUserName().equals(loginName)){
                        nameFlag = true;
                        while (true){
                            System.out.println("请输入密码：");
                            String loginpassword = scanner.next();
                            if (us.get(i).getPassword().equals(loginpassword)){
                                Date date = new Date();
                                us.get(i).setNowDate(date);
                                if (us.get(i).getCount()==1){
                                    System.out.println("您第"+us.get(i).getCount()+"次登陆");
                                    System.out.println("请输入您的英雄名称：");
                                    us.get(i).setHeroName(scanner.next());
                                }else {
                                    System.out.println("您第"+us.get(i).getCount()+"次登陆");
                                    System.out.print("上次登陆时间是：");
                                    System.out.println(us.get(i).getLastDate());
                                }
                                us.get(i).setLastDate(date);
                                menu2 menu2 = new menu2();

                                us.get(i).setCount(us.get(i).getCount()+1);

                                us.set(i,menu2.menu2(us.get(i)));


                                ObjectOutputStream out = null;
                                try {
                                    out = new ObjectOutputStream(new FileOutputStream(".\\src\\com\\Game\\index\\user.txt"));
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                try {
                                    out.writeObject(us);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                try {
                                    out.flush();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                try {
                                    out.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }


                                return;
                            }else {
                                if (j == 3){
                                    System.out.println("您已经输入错误三次，请确认用户名是否正确");
                                    return;
                                }else {
                                    System.out.println("输入错误，请重新输入");
                                    j++;
                                }

                            }
                        }
                    }
                }
                if (!nameFlag){
                    if (j==3){
                        System.out.println("您已经输入错误三次，请确认是否注册");
                        return;
                    }else {
                        System.out.println("用户名输入错误，请重新输入");
                        j++;
                    }

                }
            }
        }else {
            System.out.println("请先注册");
        }

    }


    /**
     * 展示方法
     *      用于演示，可以查看所有用户的用户名，密码以及用户英雄名
     */
    private void show() {

        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(".\\src\\com\\Game\\index\\user.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<User> us = null;
        try {
            us = (ArrayList<User>) in.readObject();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < us.size(); i++) {
            System.out.println(us.get(i));
        }
    }
}
