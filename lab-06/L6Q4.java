/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author norla
 */
public class L6Q4 {
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        System.out.println("GCD of (24, 8) is : " + gcd(24, 8));
        System.out.println("GCD of (200, 625) is : " + gcd(200, 625));
    }
}