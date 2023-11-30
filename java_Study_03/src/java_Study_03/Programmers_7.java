package java_Study_03;

public class Programmers_7 {
	public static int[] main(int[] numbers) {

		int[] answer = {};
		// answer에 numbers길이만큼 넣어준다
		answer = new int[numbers.length];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = numbers[i]*2;
		}

		return answer;

	}

}
