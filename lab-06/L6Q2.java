/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author norla
 */
public class L6Q2 {
    public static void multiPrint(int n, char c){
        for(int i = 0; i < n; i++){
            System.out.print(c);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        
        if(size > 0){
            System.out.println("Triangle");
            for(int row = 1; row <= size; row++){
                multiPrint(row, '*');
                System.out.println();
            }
            
            System.out.println("");
            System.out.println("Pyramid");
            for(int row = 1; row <= size; row++){
                multiPrint(size - row, ' ');
                multiPrint(2 * row - 1, '*');
                System.out.println();
            }
            
            System.out.println("");
            System.out.println("Diamond");
            for(int row = 1; row <= size; row++){
                multiPrint(size - row, ' ');
                multiPrint(2 * row - 1, '*');
                System.out.println();
            }
            for(int row = size - 1; row >= 1; row--){
                multiPrint(size - row, ' ');
                multiPrint(2 * row - 1, '*');
                System.out.println();
            }
        }
        else{
            System.out.println("Please enter a positive integer");
        }
    }
}