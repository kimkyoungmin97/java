package ch04.fifth;

public class People {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = new User();
		Admin admin = new Admin();
		
		user.showMyName();
		admin.showMyName();
		
		System.out.println("------------");
		
//		Member member = new User();
		Member member = new Admin();
		member.showMyName();

	}

}
