package com.java8;

public interface DbDriver 
   {
		
		
		void getDriverClass();
		void getDriverUrl();

		public default void getDriverDetail() 
		{
			
		}
		
   }	

	class MysqlConnection implements DbDriver 
	
	{

		
		public void getDriverClass() 
		{
			
			System.out.println("com.mysql.jdbc.Driver");
			
		}
		
		public void getDriverUrl() 
		{
			
			System.out.println("jdbc:mysql://localhost:3306/db_demo");
			
		}
	}		
		class OracleConnection implements DbDriver
		{
			
			public void getDriverClass() 
			{
				
				System.out.println("oraqcle.jdbc.Oracle.Driver	");
				
			}
			
			public void getDriverUrl() 
			{
				
			System.out.println("jdbc:oracle:thin:@localhost:1521:xe");
			
		    }
		
			
		public class Test
		{
			
			public static void main(String [] args) 
			{
				
				MysqlConnection msql=new MysqlConnection ();
				
				msql.getDriverClass();
				msql.getDriverUrl();
				
				
				OracleConnection oc=new OracleConnection ();
				
				oc.getDriverClass();
				oc.getDriverUrl();
			}
		  }
	}
		

	

