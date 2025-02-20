package ch03;

public class CellPhone {
	
	// 필드
	  String model;
	  String color;
	  
	  // 생성자
	   CellPhone() {
		  
	  }
	  CellPhone(String model, String color) {
		  this.model = model;
		  this.color = color;
		  
	  }
	  
	  // 메서드
	  void powerOn() {
		  System.out.println("전원을 켭니다");
	  }
	  void powerOff() {
		  System.out.println("전원을 끕니다");
	  }
	  
	  
	
	
	

}
