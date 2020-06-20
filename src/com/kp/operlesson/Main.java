package com.kp.operlesson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        switch(x){
            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("its 8");
                x++;
                break;
            default:
                System.out.println("введите или 1, или 8");
        }
    System.out.println(x);
    }
}
