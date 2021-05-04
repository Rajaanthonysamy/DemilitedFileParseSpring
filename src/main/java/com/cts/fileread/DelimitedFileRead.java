package com.cts.fileread;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


import com.cts.service.BusinessService;


public class DelimitedFileRead {
  public static void readfile() {
    Scanner sc = null;
    try {
    	// file selection
      sc = new Scanner( new File("sample.txt"));
      
      // Check if there is another line of input
      while(sc.hasNextLine()){
        String str = sc.nextLine();
        // parse each line using delimiter
        parseData(str);
      }
     
    } catch (IOException  exp) {
      // TODO Auto-generated catch block
      exp.printStackTrace();
    }finally{
      if(sc != null)
        sc.close();
    }	  		
  }
	

  public static void parseData(String str){	
    String BusinessID,BusinessName,AddressLine,PostalCode,Town,CountryCode;
    // scanner 
    Scanner lineScanner = new Scanner(str);
    //using delimitter to spliting garpage 
    lineScanner.useDelimiter("\\|");
    while(lineScanner.hasNext()){
    	
      BusinessID = lineScanner.next();
      BusinessName = lineScanner.next();
      AddressLine = lineScanner.next();
      PostalCode=lineScanner.next();
      Town=lineScanner.next();
      CountryCode=lineScanner.next();
      int a=Integer.parseInt(BusinessID);
      //Business Instance
      BusinessService service=new BusinessService();
      //passing the pased data in to service
      service.StoringData(a,BusinessName,AddressLine,PostalCode,Town,CountryCode);
      System.out.println(BusinessID);
    }
 
    lineScanner.close();
  }
}