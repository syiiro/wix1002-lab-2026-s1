/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author norla
 */
public class L6Q1 {
    public static int triangular(int n){
        int total = 0;
        
        for(int i = 1; i <= n; i++){
            total += i;
        }
        return total;
    }
    
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++){
            System.out.println("Triangular number " + i + " : " + triangular(i));
        }
    }
}