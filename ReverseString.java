package common;

public class ReverseString {
	public static void main(String []args)
	{
		String str1 = "Congizant";
		
		StringBuilder sb = new StringBuilder();
		sb.append(str1);
		sb = sb.reverse();
		System.out.println(str1);
		System.out.println(sb);
		
		
	}

}
