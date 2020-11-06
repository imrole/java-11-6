package com.company;

import java.util.Scanner;

public class FormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = -1;
        System.out.println("请输入一个整数：");
        String t = scanner.nextLine();
        try {
            w = Integer.parseInt(t);
            scanner.close();
        }
        catch (NumberFormatException ex){
            ex.getMessage();
            System.out.println("输入内容不是整数！");
        }finally {
            System.exit(0);
        }
    }
}
