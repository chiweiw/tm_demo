package com.cww.tmall.util;

import java.util.Scanner;

public class cheak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你要校验的数");
        long  number= scan.nextLong();


        double chaek = Math.sqrt(number);

        for (int i = 2; i <chaek ; i++) {

        }
    }
}
