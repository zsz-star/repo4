package com.chinasoft;
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = in.next();
        System.out.println("请输入密码");
        int num = in.nextInt();
        System.out.println("请输入新密码");
        int num1 = in.nextInt();
        System.out.println("请再次输入新密码");
        int num2 = in.nextInt();
        if (num1 == num2) {
            System.out.println("修改密码成功，您的新密码为：" + num1);
        } else {
            while (num1 != num2) {
                System.out.println("你两次输入的密码不一致，请重新输入！");
                System.out.println("请输入新密码");
                int num3 = in.nextInt();
                num1 = num3;
                System.out.println("请再次输入新密码");
                int num4 = in.nextInt();
                num2 = num4;
                System.out.println("修改密码成功，您的新密码为：" + num4);
            }
        }
    }
}