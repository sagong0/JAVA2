package sec01_exam06;

public interface RemoteControl {
	// ���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}