package group12Project;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries. When an array is created, retrieve all values from it and while 
		 * retrieving those values print capital for each country. (use 2 different loops).
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Name of 1st country?");
		String n1=scan.next();
		System.out.println("Name of 2nd country?");
		String n2=scan.next();
		System.out.println("Name of 3rd country?");
		String n3=scan.next();
		
		String[] countries= {n1, n2, n3};
		for(String name:countries) {
			if(name.equals("Pakistan")) {
				System.out.println("Capital of "+name+" is Islamabad");
			} else if (name.equals("Australia")) {
				System.out.println("Capital of "+name+" is Canberra");
			} else if (name.equals("Germany")) {
				System.out.println("Capital of "+name+" is Berlin");
			}else {
				System.out.println("Invalid country");
			}
			System.out.println(name+" ");
		}
		
	System.out.println("----------------------");
	
	for(int i=0; i<countries.length; i++) {
		if(countries[i].equals("Pakistan")) {
			System.out.println("Capital of "+countries[i]+" is Islamabad");
		} else if (countries[i].equals("Australia")) {
			System.out.println("Capital of "+countries[i]+" is Canberra");
		} else if (countries[i].equals("Germany")) {
			System.out.println("Capital of "+countries[i]+" is Berlin");
		}else {
			System.out.println("Invalid country");
		}
		System.out.println(countries[i]+" ");
	}
	}

}
