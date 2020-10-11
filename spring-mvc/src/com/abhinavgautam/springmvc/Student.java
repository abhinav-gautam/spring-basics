package com.abhinavgautam.springmvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] knownLanguages;

	public String[] getKnownLanguages() {
		return knownLanguages;
	}

	public void setKnownLanguages(String[] knwonLanguages) {
		this.knownLanguages = knwonLanguages;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	LinkedHashMap<String, String> countries;

	public Student() {
		countries = new LinkedHashMap<String, String>();
		countries.put("IN", "India");
		countries.put("FR", "France");
		countries.put("US", "United States of America");
		countries.put("DE", "Gremany");
		countries.put("BR", "Brazil");
		countries.put("RSA", "South Afirca");
	}

	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
