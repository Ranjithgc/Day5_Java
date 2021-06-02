package Ranjith;
import java.util.*;

public class VowelsOrConsonent {
	public static void main(String[] args)
    {
        String a = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Alphabet");
        a = sc.nextLine();
        char[] ch = a.toCharArray();
        //Checking the alphabet is vowel or consonent
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
            {
            	System.out.println("Vowel");
            }
            else
            {
            	System.out.println("Consonent");
            }
        }
    }

}
