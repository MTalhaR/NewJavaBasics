package com.syntax.class10;

public class Arrays2DDemo1 {

	public static void main(String[] args) {
		
		String[][] countries= {
								{"USA", "Canada"}, //1 array with index 0
								{"Peru", "Brazil", "Colombia", "Ecuador"}, //2array with index 1
								{"Ethopia", "Egypt", "Kenya"},
								{"Germany", "Turkiye", "Moldava", "Ukraine"},
								{"Kazakhstan", "Afghanistan", "Korea"},
		};
		System.out.println(countries.length);
		
		int elementOf1Array=countries[0].length;
		System.out.println("# of elements from 1 array = "+elementOf1Array);
		
		int elementOf2Array=countries[1].length;
		System.out.println("# of elements from 2 array = "+elementOf2Array);
		
		System.out.println("------------getting all values fom 2d array-------------");
		
		for (int r=0; r<countries.length; r++) {
			for (int c=0; c<countries[r].length; c++) {
				System.out.print(countries[r][c]+"  ");
			}
			System.out.println();
		}
		
		
		
	}

}
