package object_2;

public class Bus {
	
	int BusNumber;
	int passengerCount;
	int money;
	
	// 버스번호를 매개변수로 받는 생성자
	public Bus(int busNumber) {
		this.BusNumber = busNumber;
	}

	public void take(int money) {
		// TODO Auto-generated method stub
		this.money += money; // 버스 수입 증가
		passengerCount++; // 승객 수 증가
		
	}
	
	public void showInfo() {
		System.out.println("버스 " + BusNumber + " 번의 승객은" + passengerCount + " 명이고, 수입은 " + money + "입니다.");
	}

}
