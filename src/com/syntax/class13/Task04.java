package com.syntax.class13;

public class Task04 {

	public static void main(String[] args) {
		/*
		 * How would you reverse a String word by word? for example
         input=>This is sentence i want to reverse
         output=>sihT si ecnetnes i tnaw ot esrever
		 */
		String str="This is sentence i want to reverse";
		String[] str1=str.split(" ");
		int value=str1.length;
		for (int i=0; i<value; i++){
			StringBuilder str2=new StringBuilder(str1[i]);
			System.out.print(str2.reverse()+" ");
		}
		System.out.println();
		String s="This is sentence i want to reverse";
		String[] arr=s.split(" ");
		StringBuilder st=new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			String word=arr[i];
			StringBuilder stringBuilder=new StringBuilder(word);
			stringBuilder.reverse();
			arr[i]=stringBuilder.toString();
			st.append(arr[i]).append(" ");
		}
		System.out.println(st);

	}

}
