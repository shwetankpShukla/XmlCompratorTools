package com.tagit.test;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "merchantmessage")
@XmlAccessorType(XmlAccessType.FIELD)
public class Merchantmessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XmlAttribute 
	
	private String createdBy;
	
	private Date createdDate;
	@XmlAttribute  
	private String departmentId;
	@XmlAttribute  
	private String errorMessage;
	@XmlAttribute  
	private String flexField1;
	@XmlAttribute  
	private String flexField2;
	@XmlAttribute  
	private String languageCode;
	@XmlAttribute  
	private String merchantErrorCode;
	@XmlAttribute  
	private String merchantId;
	@XmlAttribute  
	private String messageType;
	@XmlAttribute  
	private String module;
	@XmlAttribute  
	private String subModulel;
	@XmlAttribute  
	private String unicodeMessage;
	@XmlAttribute  
	private String updatedBy;
	
	private Date  updatedDate;
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public String getMerchantErrorCode() {
		return merchantErrorCode;
	}
	public void setMerchantErrorCode(String merchantErrorCode) {
		this.merchantErrorCode = merchantErrorCode;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getSubModulel() {
		return subModulel;
	}
	public void setSubModulel(String subModulel) {
		this.subModulel = subModulel;
	}
	public String getUnicodeMessage() {
		return unicodeMessage;
	}
	public void setUnicodeMessage(String unicodeMessage) {
		this.unicodeMessage = unicodeMessage;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Merchantmessage() {
		super();
	}
	
	
	public Merchantmessage(String createdBy, ZonedDateTime createdDate, String departmentId, String errorMessage,
			String flexField1, String flexField2, String languageCode, String merchantErrorCode, String merchantId,
			String messageType, String module, String subModulel, String unicodeMessage, String updatedBy,
			ZonedDateTime updatedDate) {
		super();
		this.createdBy = createdBy;
		
		this.departmentId = departmentId;
		this.errorMessage = errorMessage;
		this.flexField1 = flexField1;
		this.flexField2 = flexField2;
		this.languageCode = languageCode;
		this.merchantErrorCode = merchantErrorCode;
		this.merchantId = merchantId;
		this.messageType = messageType;
		this.module = module;
		this.subModulel = subModulel;
		this.unicodeMessage = unicodeMessage;
		this.updatedBy = updatedBy;
		
	}
	
	

}
