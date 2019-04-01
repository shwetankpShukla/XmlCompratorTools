package com.tagit.test;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "reportCodes")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReportCodes implements Serializable {
	
	@XmlElement
	private List<ReportCode> reportCode;
	
	
	public ReportCodes() {
		super();		
	}

	public ReportCodes(List<ReportCode> reportCode) {
		super();
		this.reportCode = reportCode;
	}

	public List<ReportCode> getReportCode() {
		return reportCode;
	}

	public void setReportCode(List<ReportCode> reportCode) {
		this.reportCode = reportCode;
	}	

}
