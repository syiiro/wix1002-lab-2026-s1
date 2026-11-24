/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author norla
 */
public class L6Q6 {
    public static boolean isPrime(int number){
        if(number < 2){
            return false;
        }
        
        for(int i = 2; i * i <= number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static int reverse(int number){
        int reversed = 0;
        
        while(number != 0){
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }
    
    public static boolean isPalindromicPrime(int number){
        return isPrime(number) && number == reverse(number);
    }
    
    public static boolean isEmirp(int number){
        int reversed = reverse(number);
        return isPrime(number) && isPrime(reversed) && number != reversed;
    }
    
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        
        System.out.println("First 20 palindromic primes : ");
        while(count < 20){
            if(isPalindromicPrime(number)){
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        System.out.println();
        
        count = 0;
        number = 2;
        
        System.out.println("First 20 primes : ");
        while(count < 20){
            if(isEmirp(number)){
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        System.out.println();
    }
}