package programmers_01_level;

public class Level_01_04 {
	public static boolean solution(int x) {

		int sum = 0;
		int one = x % 10;
		
		while (x>0) {
			
			sum += x%10;
			x /= 10;
			
		}
		System.out.println(sum);
		
		return x % (sum) == 0;
	}

	public static void main(String[] args) {
		int x = 14;
		System.out.println(solution(x));
	}
}
