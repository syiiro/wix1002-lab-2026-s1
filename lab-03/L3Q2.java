/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek3;

import java.util.Random;

/**
 *
 * @author norla
 */
public class L3Q2 {
    public static void main(String[] args) {
        Random rand = new Random ();
        int a = rand.nextInt(6);
        
        switch (a){
            case 0:
                System.out.println(a+ " is zero.");
                break;
            case 1:
                System.out.println(a+ " is one.");
                break;
            case 2:
                System.out.println(a+ " is two.");
                break;
            case 3:
                System.out.println(a+ " is three.");
                break;
            case 4:
                System.out.println(a+ " is four.");
                break;
            case 5:
                System.out.println(a+ " is five.");
                break;
        }
    }
}
