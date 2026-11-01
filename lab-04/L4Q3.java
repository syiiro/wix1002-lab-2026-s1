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
public class L4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int max = 0;
        int min = 0;
        double avg = 0;
        double total = 0;
        double totalSquared = 0;
        
        System.out.println("Enter a score (negative score to quit) : ");
        int score = sc.nextInt();
        
        while(score >= 0){
            if(index == 0 || score < min){
                min = score;
            }
            else if(index == 0 || score > max){
                score = max;
            }
            index++;
            total += score;
            totalSquared += (double) total * total;
            avg = total / index;
            
            System.out.println("Enter a score (negative score to quit) : ");
            score = sc.nextInt();
        }
        
        if(index == 0){
        System.out.println("No scores entered.");
        }
        
        System.out.println("Minimum Score : " + min);
        System.out.println("Maximum Score : " + max);
        System.out.printf("Average Score : %.2f\n", avg);
        
        if(index > 1){
            double var = (totalSquared - total * total / index) / (index - 1);
            double sd = Math.sqrt(var);
            System.out.printf("Standard Deviation : %.2f", sd);
        }
        else {
            System.out.println("Not enough score for Standard Deviation");
        }
    }
}
