package oops2023;


	class A
{
		void show1()
		{
		  System.out.println("i am in class A");
	    }
}	
	class B extends A
{
	  void show2()
		{
		
		 System.out.println("i am in class B");
    	}
	
}
	class SingleInheritance { 

	   public static void main(String[] args) {
		
		A ob1=new A();
		ob1.show1();
		
		B ob2=new B();
		ob2.show2();
		ob2.show1();			
			
			
			
		}

	
		
	}


