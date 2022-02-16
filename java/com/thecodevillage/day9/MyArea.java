package com.thecodevillage.day9;

import java.text.DecimalFormat;
import java.util.Scanner;


// This is a function that calculates the area of a region
public class MyArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat=new DecimalFormat("#.##");

        double radius=7;

        MyFunctions myFunctions=new MyFunctions();
        System.out.println(decimalFormat.format(myFunctions.getAreaCircle(radius)));
    }

}
