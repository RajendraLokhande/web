package com.Break;

public class Break2 {

	public static void main(String[] args) {

		outer:
			for (int i=1; i<=5; i++)
			{
				System.out.println("i : "+i);
				
				inner:
					for (int j=1; j<=5; j++)
				{
					System.out.println("i :"+i);
					if(j==2);
					{
					//	break outer;
						
						break inner;
					}
					}
				}
					
				
			}
	}


