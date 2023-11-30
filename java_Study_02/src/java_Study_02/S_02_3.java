package java_Study_02;

import java.util.Scanner;

public class S_02_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); //스캐너 생성
		// 5개 숫자를 받을 배열 생성
		int inArray[] = new int[5];
		int max = 0;
		
		System.out.println("양수 5개를 입력 하세요:");
		
		for (int i = 0; i <5; i++) {
			inArray[i] = scanner.nextInt();
			if(inArray[i] > max) // inArray[i]가 현재 가장 큰 수 보다 크면
				max = inArray[i]; // inArray를 max로 변경
		}
		System.out.print("가장 큰 수는"+max+"입니다.");
	}

}
