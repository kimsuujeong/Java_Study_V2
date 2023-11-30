package java_Study_01;

import java.util.Scanner;

public class S_01_4 {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();//이름
		String city = scanner.next();//도시
		int age = scanner.nextInt();//나이
		double weight = scanner.nextDouble();//체중
		boolean isSingle = scanner.nextBoolean();//싱글여부
		
		scanner.close();
		
		System.out.println("이름= "+name);
		System.out.println("도시= "+city);
		System.out.println("나이= "+age);
		System.out.println("체중= "+weight);
		System.out.println("싱글 여부= "+isSingle);

	}
}
