package com.OopsDI;



class Y
{
	String yy;
	Y(Z z)
	{
		
	}
}
class
{
	int z; 
	Z(int zz)
	{
		z=zz;
	}
}

public class DepInjection {

	public static void main(String[] args) {
		
		
		Z ob1=new Z(100);
		Y ob2=new Y(ob1);

	}

}
