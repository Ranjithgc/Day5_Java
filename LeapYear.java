package Ranjith;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the year");
		year = sc.nextInt();
		//checking the year is leap year or not
		if(year % 4 == 0  || year % 100 == 0 || year % 400 == 4)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}

	}

}
