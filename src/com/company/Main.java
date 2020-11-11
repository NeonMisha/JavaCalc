package com.company;

import java.util.Scanner;

public class Main {

        static float calc(float num1, float num2, char sign){
            float res = 0;
            switch (sign){
                case '+':
                    res = num1 + num2;
                    break;
                case '-':
                    res = num1 - num2;
                    break;
                case '*':
                    res = num1 * num2;
                    break;
                case '/':
                    res = num1 / num2;
                    break;
            }
            return res;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 число");
        float num1 = sc.nextFloat();
        String sign = sc.next();
        float num2 = sc.nextFloat();
        float res = calc(num1, num2, sign.charAt(0));
        System.out.println(res);
    }

}
