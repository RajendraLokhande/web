package com.springboot.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.springboot.ReportDao;


	
 @Repository
 @Primary
  public class MysqlReportDaoImpl implements ReportDao{
	 
	 public MysqlReportDaoImpl(){
	 System.out.println("MysqlReportDaompl::Constructor");
	}
	
	 
   @Override
	public String findData() 
   {
		System.out.println("fetching  report data from my sql db...");
		return "Report data";		
	}
	
	

}
