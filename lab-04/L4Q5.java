/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author norla
 */
public class L4Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random ();
        int dice1 = 0;
        int dice2 = 0;
        
        System.out.println("First Player Name : ");
        String p1 = sc.next();
        
        System.out.println("Second Player Name : ");
        String p2 = sc.next();
        
        while(dice1 < 100 && dice2 < 100){
            
            int result1 = 0;
            do{
                result1 = rand.nextInt(6)+1;
                dice1 += result1;
                System.out.println(p1 + " rolled : " + result1 + " (Total : " + dice1 +")");
                
                if (result1 == 6){
                    System.out.println(p1 + " rolled 6! " + p1 + " will get a bonus roll!");
                }
            } while (result1 == 6);
            
            int result2 = 0;
            do{
                 result2 = rand.nextInt(6)+1;
                dice2 += result2;
                System.out.println(p2 + " rolled : " + result2 + " (Total : " + dice2 +")");
                
                if (result2 == 6){
                    System.out.println(p2 + " rolled 6! " + p2 + " will get a bonus roll!");
                }
            } while (result2 == 6);
            
            System.out.println("");
        System.out.println("Final Score -> " + p1 + ": " + dice1 + " | " + p2 + ": " + dice2);
        
        if (dice1 < dice2) {
            System.out.println(p2 + " win with a total score of " + dice2 + " over " + dice1);
            System.out.println("");
        }
        else if (dice1 > dice2) {
            System.out.println(p1 + " win with a total score of " + dice1 + " over " + dice2);
            System.out.println("");
        }
        else {
            System.out.println(p1 + " ties with " + p2 + " with both getting a total score of " + dice1);
            System.out.println("");
        }
            }
            
        }
}

