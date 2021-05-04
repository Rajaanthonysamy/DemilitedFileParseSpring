package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.BusinessDetails;
import com.cts.repository.BusinessRepository;
//service class
@Service
public class BusinessService {
	//Repository instance
	@Autowired
	BusinessRepository businessRepository;
	//storing red data 
	public void StoringData(int businessId, String businessName, String addressLine, String postalCode, String town,
			String countryCode) {
		BusinessDetails businessDetails = new BusinessDetails(businessId, businessName, addressLine, postalCode,
				town, countryCode);
		//self Reference
		System.out.println(businessDetails);
		//save to DB
		businessRepository.save(businessDetails);
		
	}
}
