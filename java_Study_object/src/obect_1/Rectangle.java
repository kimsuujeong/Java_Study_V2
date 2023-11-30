package obect_1;

import java.util.Scanner;

public class Rectangle {
	
	int width;
	int height;
	
	public int getArea() {
		return width*height; // 사각형의 크기 식
	}
	
	public static void main (String[] args) {
		
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">>");
		
		rect.height = sc.nextInt();
		rect.width = sc.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		
	}
}

