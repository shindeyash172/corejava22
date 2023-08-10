package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Country;
import com.aurionpro.model.Region;


public class RegionCountryTest {

	public static void main(String[] args) {
		List<Region> regionList = Arrays.asList(new Region(1, "Europe"), 
				new Region(2, "Americas"),
				new Region(3, "Asia"),
				new Region(4, "Middle East and Africa")
				);
		List<Country> countryList=Arrays.asList(
				new Country("IT", "Italy", 1),
				new Country("JP", "Japan", 3),
				new Country("US", "United States of America", 2),
				new Country("CA", "Canada", 2),
				new Country("CN", "China", 3),
				new Country("IN", "India", 3),
				new Country("AU", "Australia", 3),
				new Country("ZW", "Zimbabwe",4),
				new Country("SG", "Singapore", 3),
				new Country("UK", "United Kingdom",1),
				new Country("FR", "France", 1),
				new Country("DE", "Germany", 1),
				new Country("ZM", "Zambia", 4),
				new Country("EG", "Egypt", 4),
				new Country("BR", "Brazil", 2),
				new Country("CH", "Switzerland",1), 
				new Country("NL", "Netherlands", 1),
				new Country("MX", "Mexico", 2),
				new Country("KW", "Kuwait", 4),
				new Country("IL", "Israel", 4),
				new Country("DK", "Denmark", 1),
				new Country("HK", "HongKong", 3),
				new Country("NG", "Nigeria", 4),
				new Country("AR", "Argentina", 2),
				new Country("BE", "Belgium", 1)
				);

		for (Country c : countryList) {
			Region region = regionList.get(c.getRegionId()-1);
			List<Country> tempCountries = region.getCountries();
			tempCountries.add(c);
		}

		int choice = 0;
		while (choice != 4) {
			System.out.println("------------------------------------------");
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to country app");
			System.out.println("1: find country by code");
			System.out.println("2 :find all countries by regionId");
			System.out.println("3 : find count of countries in region id");
			System.out.println("4:exit");

			choice = sc.nextInt();
			switch(choice) {
				
				case 1:
					System.out.println("Enter country code:");
					String code=sc.next();
					boolean found=false;
					for(Country c:countryList) {
						if(c.getCode().toUpperCase().equals(code.toUpperCase())) {
							found=true;
							System.out.println(c);
						}
					}
					if(!found) {
						System.out.println("Country code not found..");
					}
					break;
				case 2:
					System.out.println("Enter region id from 1-4 :");
					int id=sc.nextInt();
					found=false;
					for(Region r:regionList) {
						if(r.getId()==id) {
							found=true;
							System.out.println(r.getCountries());
						}
					}
					if(!found) {
						System.out.println("Invalid region Id");
					}
					break;
				case 3:
					System.out.println("Enter region id from 1-4 :");
					id=sc.nextInt();
					found=false;
					for(Region r:regionList) {
						if(r.getId()==id) {
							found=true;
							System.out.println("Total countries :"+r.getCountries().size());
						}
					}
					if(!found) {
						System.out.println("Invalid region Id");
					}
					break;
				case 4:
					System.out.println("Thank you for using our app");
					break;
				default:
					System.out.println("Invalid choice");
					
			}

		}
	}

}
