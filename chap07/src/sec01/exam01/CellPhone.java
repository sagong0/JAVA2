package sec01.exam01;

public class CellPhone {
	// �ʵ�
	String model;
	String color;
	
	//������
//	CellPhone(){}
	public CellPhone(String model, String color){
		this.model = model;
		this.color = color;
	}
	//method
	void powerOn() {System.out.println("������ �մϴ�");}
	void powerOff() {System.out.println("������ ���ϴ�");}
	void bell() {System.out.println("���� �︳�ϴ�.");}
	void sendVoicd(String message) {System.out.println("�ڱ�: " + message);}
	void receivveVoice(String message) {System.out.println("����: " + message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�.");}
}