/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author norla
 */
public class L6Q5 {
    public static boolean check(int first, int second, int answer){
        return first * second == answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        int answer = 0;
        
        do{
            System.out.println("Enter negative number to quit.");
            int first = rand.nextInt(13);
            int second = rand.nextInt(13);
            
            System.out.print(first + " x " + second + " = ");
            answer = sc.nextInt();
            
            if(check(first, second, answer)){
                score++;
            }
        } while(answer >= 0);
        
        System.out.println("Your Score is " + score);
    }
}