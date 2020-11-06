package cn.campsg.java.experiment;

import cn.campsg.java.experiment.exception.RoseException;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Rose rose = new Rose(200);
        Scanner scan=new Scanner(System.in);
        System.out.println("你想送女朋友多少朵玫瑰（数字）：");
        try {
            // 获取用户输入的玫瑰花
            int num = scan.nextInt();
            // 开始送花
            rose.giveRose(num);
        } catch (RoseException e) {
            System.out.println(e.getMessage());
        } finally {
            scan.close();
            System.out.println("无论如何，我都是爱你的！\n");
        }
    }
}
