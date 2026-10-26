/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek3;

import java.util.Scanner;

/**
 *
 * @author norla
 */
public class L3Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a : ");
        double a = sc.nextDouble();
        
        System.out.println("Enter value for b : ");
        double b = sc.nextDouble();
        
        System.out.println("Enter value for c : ");
        double c = sc.nextDouble();
        
        System.out.println("Enter value for d : ");
        double d = sc.nextDouble();
        
        System.out.println("Enter value for e : ");
        double e = sc.nextDouble();
        
        System.out.println("Enter value for f : ");
        double f = sc.nextDouble();
        
        double D = a*d - b*c;
        double x = 0, y = 0;
        
        if (D == 0){
            System.out.println("The equation has no solution");
        }
        else{
            x = (e*d - b*f) / D;
            y = (a*f - e*c) / D;
        }
            System.out.println("The value for x is : " + x + " and the value for y is : " + y);
    }
}
