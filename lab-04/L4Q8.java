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
public class L4Q8 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int number = rand.nextInt(101); 
        System.out.println("Number is : " + number);
        
        int totalPrime = 0;
        int checker = 2;
        
        while (totalPrime < number) {
            boolean prime = true;
            
            for (int i = 2; i < checker; i++) {
                if (checker % i == 0) {
                    prime = false;
                }
            }
            
            if (prime) {
                System.out.print(checker + " ");
                totalPrime++;
            }
            checker++;
        }
        System.out.println();
    }
}
