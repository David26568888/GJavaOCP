package day25.case2;

public class Student extends Thread{
	private PhilippineTour tour;
	private String name;
	private int signupCount = 2;
	
	public Student(PhilippineTour tour,String name) {
		this.tour = tour;
		this.name = name;
	}
	
	@Override
	public void run() {
		while(signupCount!=0) {
			boolean success = tour.signup(name);
			if(success) {
				signupCount--;
				continue;
			}else {
				//如果報名失敗表示沒有名額,停止報名!
				break;
			}
			
		}
		
	}
}
