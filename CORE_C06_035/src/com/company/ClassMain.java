package com.company;

import java.lang.management.BufferPoolMXBean;
import java.util.Scanner;

public class ClassMain {

    public static void main(String[] args) {
	// write your code here
        Rose rose = new Rose(1000);
        Scanner scanner=new Scanner(System.in);
        int num = -1;
        while (true){
            try {
                System.out.println("你想送女朋友多少朵玫瑰（数字）：");
                String w = scanner.nextLine();
                num = Integer.parseInt(w);
            }
            catch (NumberFormatException ex){
                System.out.println("方法接受到非法参数，请给出数字形式的玫瑰花数量！");
            }
            finally {
                try {
                    rose.giveRose(num);
                }
                catch (RoseException ex){
                    System.out.println(ex.getMessage());
                }finally {
                    System.out.println("我爱你！");
                    scanner.close();
                    System.exit(0);
                }
            }
        }
    }
}
