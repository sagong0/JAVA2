package ch08_07;

public class Oracle implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oracle DB ���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB ���� ����");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB ���� ����");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB ���� ����");
	}

}
