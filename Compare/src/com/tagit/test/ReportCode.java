package com.tagit.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "reportCode")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReportCode {
	
	@XmlAttribute (name="display_seq")
	private String displaySeq;
	@XmlAttribute
	private String flags;
	@XmlAttribute (name="flex_field1")
	private String flexField1;
	@XmlAttribute (name="flex_field2")
	private String flexField2;
	@XmlAttribute (name="flex_field3")
	private String flexField3;
	@XmlAttribute(name="language_code")
	
	private String languageCode;
	@XmlAttribute (name="rpt_code")
	private String rptCode;
	@XmlAttribute (name="rpt_descr")
	private String rptDescr;
	@XmlAttribute (name="rpt_type")
	private String rptType;
	@XmlAttribute
	private String status;
	
	public ReportCode() {
		super();
	}
	
	public ReportCode(String displaySeq, String flags, String flexField1, String flexField2, String flexField3,
			String languageCode, String rptCode, String rptDescr, String rptType, String status) {
		super();
		this.displaySeq = displaySeq;
		this.flags = flags;
		this.flexField1 = flexField1;
		this.flexField2 = flexField2;
		this.flexField3 = flexField3;
		this.languageCode = languageCode;
		this.rptCode = rptCode;
		this.rptDescr = rptDescr;
		this.rptType = rptType;
		this.status = status;
	}
	public String getDisplaySeq() {
		return displaySeq;
	}
	public void setDisplaySeq(String displaySeq) {
		this.displaySeq = displaySeq;
	}
	public String getFlags() {
		return flags;
	}
	public void setFlags(String flags) {
		this.flags = flags;
	}
	public String getFlexField1() {
		return flexField1;
	}
	public void setFlexField1(String flexField1) {
		this.flexField1 = flexField1;
	}
	public String getFlexField2() {
		return flexField2;
	}
	public void setFlexField2(String flexField2) {
		this.flexField2 = flexField2;
	}
	public String getFlexField3() {
		return flexField3;
	}
	public void setFlexField3(String flexField3) {
		this.flexField3 = flexField3;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public String getRptCode() {
		return rptCode;
	}
	public void setRptCode(String rptCode) {
		this.rptCode = rptCode;
	}
	public String getRptDescr() {
		return rptDescr;
	}
	public void setRptDescr(String rptDescr) {
		this.rptDescr = rptDescr;
	}
	public String getRptType() {
		return rptType;
	}
	public void setRptType(String rptType) {
		this.rptType = rptType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	

}
