package �������̽�����;

import java.util.Random;

public class PlusGame implements IGame {
	// �˰��� �����
	
	//�ʵ�
	protected Random ran = new Random();
	protected int num1;
	protected int num2;

	@Override
	public void makeRandom() {
		//���� �����ϴ� ���
		num1 = ran.nextInt(9) + 1;
		num2 = ran.nextInt(9) + 1;
	}

	@Override
	public String getQuizMsg() {
		//������ ������ ���ڿ� ���·� �ǵ����ֱ�
		//����1+����2=
		//String result = num1 + "+" + num2+"=";
		return  num1 + "+" + num2+"=";

	}

	@Override
	public boolean checkAnswer(int answer) {
		//�Ű������� �޾ƿ� ���ڿ� ���� ����1+����2 ��ġ
		//����üũ�ϴ� ���
		return num1 + num2 == answer ? true : false;//�񱳿����ڴ� ��������� boolean���� �ǵ����ش�.

	}

}
