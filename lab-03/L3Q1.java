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
public class L3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number :");
        int a = sc.nextInt();
        
        System.out.print("Enter operand:");
        char symbol = sc.next().charAt(0);
        
        System.out.print("Enter the second number :");
        int b = sc.nextInt();
        
        int result = 0;
        
        switch (symbol){
            case ('+'):
                result = a + b;
                System.out.println("The result is : " +result);
                break;
            case ('-'):
                result = a - b;
                System.out.println("The result is : " +result);
                break;
            case ('*'):
                result = a * b;
                System.out.println("The result is : " +result);
                break;
            case ('/'):
                result = a / b;
                System.out.println("The result is : " +result);
                break;
            case ('%'):
                result = a % b;
                System.out.println("The result is : " +result);
                break;
            default:
                System.out.println("The operator is invalid!");
        }
        sc.close();
    }
}
