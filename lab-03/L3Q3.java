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
public class L3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the volume of sales :");
        double v = sc.nextDouble();
        
        double commission = 0;
        
        if (v <= 100){
            commission = v * 0.05;
        }
        else if (v > 100 && v <= 500){
            commission = v * 0.075;
        }
        else if (v > 500 && v <= 1000){
            commission = v * 0.1;
        }
        else{
            commission = v * 0.125;
        }
        System.out.printf("The total commission for " + v + " sale is %.2f \n", commission);
    } 
}
