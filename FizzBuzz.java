/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examtest;

/**
 *
 * @author David
 */
public class FizzBuzz {

     public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) { //Basic For Loop 1 - 100
          
            int Fizz = 3;
           int Buzz = 5;
            
            
            if ((i % Fizz == 0) && (i % Buzz == 0)){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 ==0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else {
              System.out.println(i);  
            }  
                        
           
        }
    }
    
    
    
    
    
    
}
