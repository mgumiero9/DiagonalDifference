package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /***** input *****/
        Scanner sc = new Scanner(System.in).useDelimiter("\\p{javaWhitespace}+");
        //String line = sc.nextLine();
        int     t = sc.nextInt();
        int     diagDown = 0,
                diagUp = 0 ;
        int[][] a = new int[t][t];

        for (int i = 0; i < t ; i++) {
            for (int j = 0; j < t ; j++) {
                a[i][j] = sc.nextInt();
            }
        }
/*        *//******** test *******//*
        for (int i = 0; i < t ; i++) {
            for (int j = 0; j < t ; j++) {
                System.out.println(a[i][j]);
            }
        }*/
        /********** calculations *********/
        for (int i = 0; i < t ; i++) {
                diagDown = diagDown + a[i][i];
        }
        //System.out.println(diagDown);

        for (int i = 1; i <= t; i++) {
            diagUp = diagUp + a[i - 1][(t - i)];
        }
        //System.out.println(diagUp);
        System.out.println(Math.abs(diagDown - diagUp));
    }
}
