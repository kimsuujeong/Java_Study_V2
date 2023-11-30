package java_Study_02;

public class S_02_1 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i); // 10까지 i++
			if (i <= 9) {
				System.out.print("+"); // 9까지 계속 출력
			} else {
				System.out.print("=");
				System.out.print(sum);
			}
		}

	}
}