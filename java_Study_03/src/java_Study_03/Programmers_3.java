package java_Study_03;

public class Programmers_3 {
	public static String main(String my_string, String overwrite_string, int s) {

		// 문자열 겹쳐쓰기
		// my_String, overwrite_string -> 문자열
		// s -> 정수
		// 문자열 my_string의 인덱스 s 부터

//		String answer = "";
//        char ch[] = overwrite_string.toCharArray();
//        char ch1[] = my_string.toCharArray();
//        for(int i = 0;i < ch.length;i++){
//            ch1[s] = ch[i];
//            s++;
//        }
//        answer = new String(ch1);
//        return answer;

		String before = my_string.substring(0, s);
		String after = my_string.substring(s + overwrite_string.length());
		
		return before + overwrite_string + after;
	
	}

}
