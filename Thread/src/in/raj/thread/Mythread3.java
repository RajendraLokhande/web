package in.raj.thread;

public class Mythread3 extends Thread{
	
	public void run()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}}
