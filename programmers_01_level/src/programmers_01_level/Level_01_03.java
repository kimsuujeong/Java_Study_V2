package programmers_01_level;

public class Level_01_03 {

	public static double solution(int[] arr) {

		double answer = 0;

		for (int i = 1; i <= arr.length; i++) {
			answer += arr[i];
		}

		return answer / arr.length;
	}
	public static void main(String[] args) {
		
		int[] arr = {5,5};

		System.out.println(solution(arr));
		
	}
}