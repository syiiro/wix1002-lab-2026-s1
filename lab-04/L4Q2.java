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
public class L4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int number = sc.nextInt();
        
        int first = 0;
        int result = 0;
        
        for(int i = 0; i <= number; i++){
            first += i;
            result += first;
    }
        System.out.println(result);
    }
}
