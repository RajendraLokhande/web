package FibonaciSeries;

public class FibonaciSeriesDemo {

	public static void main(String[] args) {

//	Two sum + and plus prevoius number -->	0, 1, 1, 2 ,3 ,5 ,8, 13,...(infinite times)
		
		int no1=0;
		int no2=1;
		
		System.out.print(no1+" "+no2);
		
		for (int i=1; i<=10; i++)
		{
			int c = no1+no2;
			no1=no2;
			no2=c;
			
			System.out.print(" " +c);
			
		}
			// swapping the number 
	}

}
