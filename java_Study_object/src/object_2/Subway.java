package object_2;

public class Subway {
	
	String lineNumber;
	int passengerCount;
	int money;
	
	// 지하철 노선 번호를 매개변수로 받는 생성자
	public Subway (String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		// TODO Auto-generated method stub
		this.money += money; // 버스 수입 증가
		passengerCount++; // 승객 수 증가
		
	}
	
	public void showInfo() {
		System.out.println(lineNumber + " 의 승객은" + passengerCount + " 명이고, 수입은 " + money + "입니다.");
	}



}
