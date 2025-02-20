package ch02;

public class EarthEx {
	
	public static void main(String[] args) {
		// 제일 높은 건물의 높이는 ??? 입니다.
		
		System.out.println("제일 높은 건물의 높이:" + Earth.TOP_BUILDING);
		
		Earth earth = new Earth();
		System.out.println("제일 높은 건물의 높이:" + earth.topBuilding);
	}

}
