package Ranjith;
import java.util.*;

public class PrimeFactors {
	public static void main(String[] args) {
		int number;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ");
	      number = sc.nextInt();
	      //checking the number is prime and checking the prime factors using for loop
	      for(int i = 2; i< number; i++) {
			if( number % i == 0) {
				for(int j = 2; j < number; j++) {
					if(i % j == 0) {
						System.out.println("prime" +i);
					} else {
						System.out.println("not a prime");
					}
				} 	
				System.out.println(i+" ");
	            		number = number/i;
	         	}
	      }
	      //printing prime factors
	      if(number > 2) {
	         System.out.println(number);
	      }
	}

}
