package ch04.first;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv를 켭니다.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Tv를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

	}

}
