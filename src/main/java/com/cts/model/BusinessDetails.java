package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

//Dao Model Class
@Entity
@Table(name = "businesstable")
@ToString
@Data
@AllArgsConstructor
public class BusinessDetails {
	@Id
	private int BusinessIdendificationNumber;
	private String BusinessName;
	private String AddressLine;
	private String PostalCode;
	private String Town;
	private String CountryCode;

}
