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
public class L4Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount : ");
        double P = sc.nextDouble();
        
        System.out.println("Enter interest in % : ");
        double i = sc.nextDouble();
        
        System.out.println("Enter total number of month(s) : ");
        int N = sc.nextInt();
        
        if(P < 0 || i < 0 || N < 0){
            System.out.println("Principal amount, rate or month must be in positive.");
        }
        
        double rate = i / (12 * 100);
        double M = (P * rate) / (1 - Math.pow(1 + rate, -N));
        double totalRate = 0;
        
        System.out.println("Month          Monthly Payment          Principal          Interest          Unpaid Balance          Total Interest" );
        
        for(int j = 1 ; j <= N; j++){
            double C = M * Math.pow(1 + rate, -(1 + N - j));
            double L = M - C;
            double R = (L / rate) - C;
            totalRate += L;
            
            System.out.println(j + "     " + M + "     " + C + "     " + L + "     " + Math.abs(L) + "     " + totalRate);
        }
    }
}
