package com.BinhAn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("mời nhập số");
        int number = sc.nextInt();
        if (number<2){
            System.out.println(number + "không phải là số nguyên tố");
        }else{
            int i=2;
            boolean check = true;
            while (i<= Math.sqrt(number)){
                if (number%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println("là số nguyên tố");
            }else {
                System.out.println("không là số nguyên tố");
            }
    }
}
}
