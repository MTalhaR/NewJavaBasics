package com.syntax.class12;

public class Task4new {

	public static void main(String[] args) {
		
		String motherName = "Mary";
        String fatherName = "Daniel";
        boolean isBoy = true;

        if (isBoy) {
            String firstHalf = fatherName.substring(0, fatherName.length() / 2);
            String secondHalf = motherName.substring(motherName.length() / 2);
            System.out.println(firstHalf + secondHalf);

        } else {
            String firstHalf = motherName.substring(0, motherName.length() / 2);
            String secondHalf = fatherName.substring(fatherName.length() / 2);
            System.out.println(firstHalf + secondHalf);

        }
		
	}

}
