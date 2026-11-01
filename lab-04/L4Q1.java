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
public class L4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = sc.nextInt();
        
        if(number >= 0){
            for(int x = 2; x <= number; x++){
                if(number % x == 0){ 
                System.out.println(x);
                }
            }
        }
            System.out.println("Please enter a positive integer");
    }
}
