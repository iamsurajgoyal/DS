package code;
class Job implements Runnable
{
	int start;
	int end;
	Job(int s, int e)
	{
		start = s;
		end = e;
	}
	
	public void run()
	{
		for(int i =start;i<end;i++)
		{
			System.out.println("Thread : "+Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
		System.out.println(Thread.currentThread().getName()+"Finished :");
	}
}

public class RunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job a = new Job(1,5);
		Job b = new Job(6,10);
		
		Thread th1 = new Thread(a);
		Thread th2 = new Thread(b);
		th1.start();
		th2.start();

	}

}
