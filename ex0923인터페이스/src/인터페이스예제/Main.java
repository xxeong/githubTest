package �������̽�����;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ����� ���
		// ����Ƚ�� üũ, 5������ ������ �� �ְԲ� �����ۼ�!
		Scanner sc = new Scanner(System.in);
		//GameDummy p1 = new GameDummy(); // --->�ӽ� �׽�Ʈ�뵵!
		PlusGame pl = new PlusGame();
		int count = 0; // ������ ������ üũ�ϴ� ���
		// 1. �� 5������ ����
		for (int i = 0; i < 5; i++) {

			// 2. ���� �����ϴ� ���
			pl.makeRandom();
			// 3. ���� ���
			// String quiz = p1.getQuizMsg();
			for (int j = 0; j < 3; j++) {
				System.out.print(pl.getQuizMsg());
				int answer = sc.nextInt();

				// 4. �� ������ ������ ���� �� �ִ� ��ȸ�� 3��
				if (pl.checkAnswer(answer)) {
					// ������ �����!
					count++;
					break;
				} else {
					// ������ ������ ���ߴ�!
					System.out.println("�����Դϴ�~");
				}
			}
			}
		// 5. ���� ���� Ƚ���� ���
		System.out.println("������ ������ "+count+"�� �Դϴ�~");
	}

}
