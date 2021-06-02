package Ranjith;
import java.util.*;

public class Largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//Checking a is largest and printing if it is largest
		if(a > b && a > c) {
			System.out.println(a+ "Largest");
		}
		//checking b is largest and printing if it is largest
		else if(b > c) {
			System.out.println(b+ "Largest");
		}
		//checking c is largest and printing if it is largest
		else {
			System.out.println(c+ "Largest");
		}
	}

}
