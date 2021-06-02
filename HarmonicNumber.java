package Ranjith;
import java.util.*;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		//generating the Harmonic Series using for loop
		for(int i = 1; i<=n; i++) {
			int a = 1;
			System.out.println("Harmonic Series is:" +a+ "/" +i);
		}
	}

}
