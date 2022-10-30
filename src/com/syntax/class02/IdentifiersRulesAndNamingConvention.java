package com.syntax.class02;

public class IdentifiersRulesAndNamingConvention {

	//Rules for Identifiers = names (variables, methods and classes)
			//1. cannot use keywords for identifiers
			// String case = "hello"; -> error
			
			//2. cannot have spaces in identifiers
			// String last name = "talha riaz"; -> error
			
			//3. identifiers cannot start with numbers
			// int 1number1 = 23; -> error
			int number1 = 23; // number can be anywhere after 1st character 
			
			/*4. identifiers cannot contain any special characters 
			 * boolean hello! = true; -> error
			 * char #chara='A'; -> error
			 * except $ or _
			 */
			boolean hello$ = true;
			float _price1 = 1.99f;
			
			/*Naming Conventions
			 * Class should start with Uppercase and follow CamelCasing
			 * Variables should start with lowercase and then follow camelcasing
			 */
			
			String Weather = "hot"; // not preferred
			String myWeather = "cold"; // preferred way
	
}
