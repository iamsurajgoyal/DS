package common;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121, rev = 0,rem,org;
		
		 org = num;
		while(num != 0)
		{
			rem = num % 10;
			rev = rev*10+rem;
			num = num / 10;
		}
		if(org == rev)
		{
			System.out.println(org+ " No. is palindrome :");
		}
		else
			System.out.println("Not a palindrome :");

	}

}
