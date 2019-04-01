package com.tagit.test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Test {

	public static void main(String[] args) {
		
		merchantMessageMerger();
		ReportCodeMerger();
		
	}
	
	
	
	private static void merchantMessageMerger() {
		File xmlFileBD = new File("C:\\Users\\Shwetank.shukla\\Desktop\\Packging\\MerchantMsg\\MerchantMessages_201903281922_BND.xml");
		File xmlFileLDB = new File("C:\\Users\\Shwetank.shukla\\Desktop\\Packging\\MerchantMsg\\MerchantMessages_201903281922 LAO.xml");

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Merchantmessages.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			HashMap<String, Merchantmessage> mapMsgs = new HashMap<>();

			// Logic for BD
			System.out.println("merchantmessage" + xmlFileBD);
			Merchantmessages bDMsgs = (Merchantmessages) jaxbUnmarshaller.unmarshal(xmlFileBD);
			System.out.println("Total No of Reocord in BD::"+bDMsgs.getMerchantmessage().size());
			for (Merchantmessage merchantmessage : bDMsgs.getMerchantmessage()) {				
				mapMsgs.put(merchantmessage.getMerchantErrorCode()+merchantmessage.getLanguageCode(), merchantmessage);
			}

			// Logic for LAO 
			Merchantmessages ldbMsgs = (Merchantmessages) jaxbUnmarshaller.unmarshal(xmlFileLDB);

			System.out.println("Total No of Reocord in LBD::"+ldbMsgs.getMerchantmessage().size());
			for (Merchantmessage merchantmessage : ldbMsgs.getMerchantmessage()) {
				
				mapMsgs.put(merchantmessage.getMerchantErrorCode()+merchantmessage.getLanguageCode(), merchantmessage);
			}
			
			System.out.println("Total No of Reocord::"+mapMsgs.size());
			
			List<Merchantmessage> commnMsg = new ArrayList<>();
			for (Map.Entry<String, Merchantmessage> entry : mapMsgs.entrySet()) {
				commnMsg.add(entry.getValue());			
			}
			
			
			Merchantmessages msg = new Merchantmessages(commnMsg);
			jaxbObjectToXML(msg);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	
	 private static void jaxbObjectToXML(Merchantmessages merchantmessages)
	    {
	        try
	        {
	            //Create JAXB Context
	            JAXBContext jaxbContext = JAXBContext.newInstance(Merchantmessages.class);
	             
	            //Create Marshaller
	            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 
	            //Required formatting??
	            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	 
	           //Store XML to File
	            File file = new File("commonMerchantmessages.xml");
	             
	            //Writes XML file to file-system
	            jaxbMarshaller.marshal(merchantmessages, file);
	        }
	        catch (JAXBException e)
	        {
	            e.printStackTrace();
	        }
	    }
	 
	 
	 private static void ReportCodeMerger() {
			File xmlFileBD = new File("C:\\Users\\Shwetank.shukla\\Desktop\\Packging\\ReportCode\\ReportCode_201904011052BD.xml");
			File xmlFileLDB = new File("C:\\Users\\Shwetank.shukla\\Desktop\\Packging\\ReportCode\\ReportCode_201904011053LDB.xml");

			JAXBContext jaxbContext;
			try {
				jaxbContext = JAXBContext.newInstance(ReportCodes.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

				HashMap<String, ReportCode> mapMsgs = new HashMap<>();

				// Logic for BD
				
				ReportCodes bDReportCodes = (ReportCodes) jaxbUnmarshaller.unmarshal(xmlFileBD);
				System.out.println("Total No of Reocord in BD::"+bDReportCodes.getReportCode().size());
				for (ReportCode reportCode : bDReportCodes.getReportCode()) {				
					mapMsgs.put(reportCode.getRptCode()+reportCode.getLanguageCode()+reportCode.getRptType(), reportCode);
				}

				// Logic for LAO 
				ReportCodes ldbReportCode = (ReportCodes) jaxbUnmarshaller.unmarshal(xmlFileLDB);

				System.out.println("Total No of Reocord in LBD::"+ldbReportCode.getReportCode().size());
				for (ReportCode reportCode : bDReportCodes.getReportCode()) {				
					mapMsgs.put(reportCode.getRptCode()+reportCode.getLanguageCode()+reportCode.getRptType(), reportCode);
					System.out.println("Unique Key::"+reportCode.getRptCode()+reportCode.getLanguageCode());
				}
				
				System.out.println("Total No of Reocord::"+mapMsgs.size());
				
				List<ReportCode> commnReportCode = new ArrayList<>();
				for (Map.Entry<String, ReportCode> entry : mapMsgs.entrySet()) {
					commnReportCode.add(entry.getValue());
					
				}
				
				
				ReportCodes msg =new ReportCodes(commnReportCode);
						jaxbObjectToXMLReportCode(msg);
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}
	 
	 private static void jaxbObjectToXMLReportCode(ReportCodes reportCodes)
	    {
	        try
	        {
	            //Create JAXB Context
	            JAXBContext jaxbContext = JAXBContext.newInstance(ReportCodes.class);
	             
	            //Create Marshaller
	            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 
	            //Required formatting??
	            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	 
	           //Store XML to File
	            File file = new File("commonReportCode.xml");
	             
	            //Writes XML file to file-system
	            jaxbMarshaller.marshal(reportCodes, file);
	        }
	        catch (JAXBException e)
	        {
	            e.printStackTrace();
	        }
	    }

}
