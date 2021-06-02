package Ranjith;
import java.util.*;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		//Checking number is even or odd
		if(num % 2 == 0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}
