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
public class L3Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        double rad = sc.nextDouble();
        
        System.out.println("Enter the coordinate of x : ");
        int x = sc.nextInt();
        
        System.out.println("Enter the coordinate of y : ");
        int y = sc.nextInt();
        
        double D = rad*rad;
        double P = x*x + y*y; 
        
        if (D > P){
            System.out.println("Point (" + x + "," + y + ") is inside the circle!");
        }
        else if (D < P){
            System.out.println("Point (" + x + "," + y + ") is outside the circle!");
        }
        else
            System.out.println("Point (" + x + "," + y + ") is exactly on the circle!");
    }
}
