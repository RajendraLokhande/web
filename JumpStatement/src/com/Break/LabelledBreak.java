package com.Break;

public class LabelledBreak {

	

	public static void main(String[] args) {

		
		L2:	for (int i=1; i<=5; i++)
			{
				System.out.println("i : "+i);
				
				
				L1:	for (int j=1; j<=5; j++)
				{
					System.out.println("i :"+i);
					if(j==2);
					{
				
						 break L2;
					//	 break L1;
					}
					
				}
					
				
			}
	}
}


