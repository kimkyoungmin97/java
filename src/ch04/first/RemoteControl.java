package ch04.first;

public interface RemoteControl {
	
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	final String name ="asdf";
	
	//추상 메서드
	public abstract void turnOn();
	void turnOff(); // public abstract 생략 가능
	void setVolume(int volume);
	

}
