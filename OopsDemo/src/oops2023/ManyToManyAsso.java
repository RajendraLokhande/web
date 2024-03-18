package oops2023;

class Student
{
	String rollno;
	String name;
	
	Languages[] lang;
	Student(String rollno1, String name1, Languages[] lang1)
	{
		rollno=rollno1;
		name=name1;
		lang=lang1;
	}
	
	void getStudentDetails()
	{
		System.out.println("Student Rollno: "+rollno);
		System.out.println("Student Name : "+name);
		System.out.println("Languages Details");
		for(int i=0; i<lang.length; i++)
		
		{
			System.out.println("Language Name : "+lang[i].langname+" and Language code : "+lang[i].langcode);
		}
		System.out.println("--------------------------------------------");
				
	}
}
class Languages
{
	String langcode;
	String langname;
	
	Languages(String langcode1, String langname1)
	{
		langcode=langcode1;
		langname=langname1;
	}

}
public class ManyToManyAsso {

	public static void main(String[] args) {

	Languages l1=new Languages ("java01", "java");
	Languages l2=new Languages ("py02", "python");
	Languages l3=new Languages ("cpp03", "C++");
	Languages []lang= {l1,l2,l3};
	
	Student s1=new Student("101", "rajendra",lang);
    Student s2=new Student("102", "ramesh" ,lang);
    Student s3=new Student("103", "rajesh" ,lang);

	s1.getStudentDetails();	
	s2.getStudentDetails();		
	s3.getStudentDetails();		
		
	}

}
