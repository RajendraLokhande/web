package com.SuperKeyword;

class GroupN
{
	void pass()
	{
		System.out.println("i am in Group N costructor");
    }
}
class GroupT extends GroupN
{
	void pass()
	{
		super();
		System.out.println("i am in Group T costructor");
	}
}
class Super3 {

	public static void main(String[] args) {
     
		GroupT gb=new GroupT ();
		
	}

}
