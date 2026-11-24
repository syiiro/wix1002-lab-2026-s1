/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author norla
 */
public class L6Q3 {
    public static int reverseNumber(int number){
        int reversed = 0;
        
        while(number != 0){
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }
    
    public static void reverse(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = reverseNumber(numbers[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = {1234, 567, 89, 1000, 45, 9, 300, 12, 70001, 98765};
        
        System.out.print("Before : ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        reverse(numbers);
        
        System.out.print("After : ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}