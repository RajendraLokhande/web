package com.springboot.service;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springboot.ReportDao;







@Service
public class ReportService {

	

private ReportDao reportDao;


/*	@Autowired
	@Qualifier ("Oracle")
	public void setReportDao(ReportDao reportDao) {
		System.out.println("setReportDao() method called...");
		this.reportDao=reportDao;
		
 */
	public ReportService(ReportDao reportDao) {
		System.out.println("ReportDao:: Param Costructor called...");
		this.reportDao = reportDao;
	}
	
	
	public void generatedReport() {
		
	String FindData = reportDao.findData();
	System.out.println("generating report...");
	
  }	
	
}
