package com.springboot.dao;

import org.springframework.stereotype.Repository;

import com.springboot.ReportDao;


@Repository("oracle")
public class OracleReportDaoImpl implements ReportDao {
	
	public OracleReportDaoImpl() {
		System.out.println("OracleReportDaoImpl::Constructor");
	}

	@Override
	public String findData() {
		System.out.println("detching report data from oracle db...");
		return "Report data";
	}

}
