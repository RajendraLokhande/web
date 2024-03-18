package com.springboot;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class ReportDaoImpl implements ReportDao {

	public ReportDaoImpl() {
		System.out.println("OracleReportDaoImpl::Constructor");
		
	}
	
	@Override 
	public String findData() {
		System.out.println("fitching report from oracle db");
		return "Report data";
	}
	
}
