package com.tagit.test;



import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "merchantmessages")
@XmlAccessorType(XmlAccessType.FIELD)
public class Merchantmessages implements Serializable {
	
	@XmlElement
	private List<Merchantmessage> merchantmessage;

	public List<Merchantmessage> getMerchantmessage() {
		return merchantmessage;
	}

	public void setMerchantmessage(List<Merchantmessage> merchantmessage) {
		this.merchantmessage = merchantmessage;
	}

	public Merchantmessages(List<Merchantmessage> merchantmessage) {
		super();
		this.merchantmessage = merchantmessage;
	}
	
	public Merchantmessages() {
		super();
		
	}
	
	

}
