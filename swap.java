package common;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1,y=2;
		System.out.println(x+"  Value of x and y "+y+" before swaping");
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println(x+", "+y+" after swaping");
		

	}

}
