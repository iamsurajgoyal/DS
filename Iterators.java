package code;

import java.util.ArrayList;
import java.util.Iterator;

class Product
{
	int pid;
	float price;
	String name;
	Product(int pid,float price,String name)
	{
		this.pid=pid;
		this.price=price;
		this.name=name;
		
	}
	public String toString() {
		return (pid+" "+name+" "+price);
	}
}

public class Iterators {
	static void forEach(ArrayList<Product> store)
	{
		for(Product p:store)
		{
			System.out.println(p);
		}
	}
	static void iteratorInterface(ArrayList<Product> store)
	{
		Iterator<Product> itr = store.iterator();
		while(itr.hasNext())
		{
			Product p = itr.next();
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> store = new ArrayList<Product>();
		store.add(new Product(101,50000,"laptop"));
		store.add(new Product(102,60000,"mobile"));
		store.add(new Product(103,70000,"desktop"));
		store.add(new Product(104,80000,"car"));
		Iterators.forEach(store);
		System.out.println("----------------------");
		Iterators.iteratorInterface(store);

	}

}
