package in.raj.thread;

public class Mythread1 {

	public static void main(String[] args) {

		MyThread th=new MyThread();
		
		
		th.start();
		Mythread3 th1 = new Mythread3();
		th1.start();
	}

}
