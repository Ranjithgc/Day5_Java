package Ranjith;
import java.util.*;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numners");
		int a = sc.nextInt();
		int b = sc.nextInt();
		//Swapping two numbers using third variable
		System.out.println("Before Swapping: " +a+ " " +b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swapping: " +a+ " " +b);
		//Swapping two numbers without using third variable
		a = a + b;
		b = a - b;
		a = a- b;
		System.out.println("After Swapping: " +a+ " " +b);
	}

}
