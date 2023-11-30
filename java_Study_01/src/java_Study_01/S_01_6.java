package java_Study_01;

import java.util.Scanner;

public class S_01_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력 하세요");
		int score = scanner.nextInt();
		
		if (score >= 80) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
	}
}
