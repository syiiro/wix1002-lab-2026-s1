/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author norla
 */
public class L3Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random ();
        int dice1 = 0;
        int dice2 = 0;
        
        System.out.println("First Player Name : ");
        String p1 = sc.next();
        
        System.out.println("Second Player Name : ");
        String p2 = sc.next();
        
        for (int i = 1; i <= 2; i++){
            int result = rand.nextInt(6)+1;
            System.out.println("Roll for " + i + " is " + result);
            dice1 += result;
        }
        System.out.println("Total role for " + p1 + " is " + dice1);
        
        for (int j = 1; j <= 2; j++){
            int result = rand.nextInt(6)+1;
            System.out.println("Roll for " + j + " is " + result);
            dice2 += result;
        }
        System.out.println("Total role for " + p2 + " is " + dice2);
        
        if (dice1 < dice2){
            System.out.println(p2 + " win with a total score of " + dice2 + " over " + dice1);
        }
        else if (dice2 > dice2){
            System.out.println(p1 + " win with a total score of " + dice1 + " over " + dice2);
        }
        else
            System.out.println(p1 + " ties with " + p2 + " with both getting a total score of " + dice1);
    }
}
