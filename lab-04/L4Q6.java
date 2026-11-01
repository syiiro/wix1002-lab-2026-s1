/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek4;

import java.util.Random;

/**
 *
 * @author norla
 */
public class L4Q6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt();
        
        if(number < 0){
            number = number * -1;
        }
        
        int digit = 0;
        int balance = number;
        
        do{
            digit++;
            balance /= 10;
        } while (balance != 0);
        
        System.out.println("Number is : " + number);
        System.out.println("Number of digits is : " + digit);
    }
}
