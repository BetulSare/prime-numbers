
package prime.numbers;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {


        boolean prime=true;
        Scanner scan =new Scanner(System.in);
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    prime=false;
                }
                 
            }
            if(prime){
                System.out.print(i+" ");
            }
           prime=true;
        }
                
    }
    
}
