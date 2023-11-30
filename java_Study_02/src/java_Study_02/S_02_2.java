package java_Study_02;

public class S_02_2 {
	public static void main(String[] args) {
		//구구단 출력
		for (int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print(i+"*"+j+"="+i*j);
				System.out.println('\t');
			}
		}
	}

}
