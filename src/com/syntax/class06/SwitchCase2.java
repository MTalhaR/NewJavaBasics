package com.syntax.class06;

public class SwitchCase2 {

	public static void main(String[] args) {

		   // matching cases must be of the same data type as a variable in switch
        // no duplicated case in switch

        char choice='Y';
        String answer;

        switch(choice) {
        case 'Y':
            answer="Yes";
          
        case 'N':
            answer="No";
          
        case 'M':
            answer="Maybe";
          
        default:
            answer="Unkown";
           
        }
    System.out.println(answer);

    /*
     * Limitations of SWITCH CASE
     * Switch Case can not use logical operators
     * Switch Case can not use any relational operators
     * Switch Case can not work with boolean values
     * Switch Case can not work with float/double and long
     */
    
    
	}

}
