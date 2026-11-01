/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek4;

import java.util.Scanner;

/**
 *
 * @author norla
 */
public class L4Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        System.out.println("Enter the first day of the year(0 = Sunday... 6 = Saturday):");
        int first = sc.nextInt();
        
        if (first < 0 || first > 6) {
            System.out.println("Please enter a valid number!");
        }
        
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        int february = 0;
        
        if (leapYear) { 
            february = 29;
        } else {
            february = 28;
        }
        
        int May = (first + 31 + february + 31 + 30) % 7;
        int Aug = (May + 31 + 30 + 31) % 7;
        
        for (int i = 0; i < 2; i++) {
            String month;
            int start;
            
            if (i == 0) {
                month = "May";
                start = May;
            } else {
                month = "August";
                start = Aug;
            }
            
            System.out.println("");
            System.out.println("     " + month + " " + year);
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
            
            for (int blank = 0; blank < start; blank++) {
                System.out.print("    ");
            }
            
            for (int day = 1; day <= 31; day++) {
                System.out.printf("%4d", day);
                if ((start + day) % 7 == 0) {
                    System.out.println();
                }
            }
            
            if ((start + 31) % 7 != 0) {
                System.out.println();
            }
        }
    }
}
