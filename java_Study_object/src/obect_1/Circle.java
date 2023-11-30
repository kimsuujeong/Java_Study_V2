package obect_1;

public class Circle {
	int radius;
	String name;
	
	public Circle() { // 매개변수 없는 생성자 , 생성자 이름은 클래스 이름과 동일
		radius = 1; name = "" ; // 필드 초기화	
	}
	
	public Circle(int r, String n) { // 매개변수가 있는 생성자
		radius = r; name = n; // 매개 변수로 필드 초기화
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle(10 , "자바피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.name = "도넛피자"; // 이름 변경
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
	}

}
