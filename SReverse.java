package code;

import java.util.Scanner;
import java.util.Stack;

public class SReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			stack.push(s.charAt(i));
		}
		System.out.println("Reverse of string is :");
		
		while(!stack.empty())
		{
			System.out.print(stack.pop());
			
		}
		
		

	}

}
