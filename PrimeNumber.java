package common;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 13;
		boolean flag = false;
		for(int i=2;i<num;i++)
		{
			if(num % i ==0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println(num+ " Is a prime number :");
		else
			System.out.println(num+ "Not a prime number : ");

	}

}
