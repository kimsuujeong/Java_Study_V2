package java_Study_01;

import java.util.Scanner;

public class S_01_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		String result = "";
		
		for(int i = 0; i < a.length(); i++) {
			
			char c = a.charAt(i);
			
			if(Character.isLowerCase(c)) {
				result += Character.toUpperCase(c);
			} else {
				result += Character.toLowerCase(c);
			}
			
		}
		System.out.println(result);

	}

}
