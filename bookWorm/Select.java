/*
 * 2417 ������
 * 
 * å�� �д� ���� �����ִ� ���α׷�����, å�� ���� �ð��� ���Ͽ� �ش� �ð��� �˶��� ��� å �д� ���� ���� �ʵ��� ������.
 * �̵��ð��� �� ���, å�� ì���� �ȳ�����.
 * ������ �����Ͽ� �����ͺ��̽��� �ִ� å �� ��õ����.
 * å�� ���̵��� �����Ͽ� �����ͺ��̽��� �ִ� å �� ��õ����.
 * ���α׷��� ������ �ű⵵�� �Ͽ� �� ������ �� �ֵ��� ��.
 * 
 * Select.java ������ �����ϸ� 5���� ����� ������ �� ����.
 * 1 ���� ��) �ÿ� ���� ���� -> ���ݱ��� ������ �˶� �ð��� ���δ� / ������ �ʴ´� -> 1�� ��� ����
 * 2 ���� ��) �̵��ð� �д����� ���� -> 60�� �̻��̸� å�� ���õ� �޽����� �����ָ� å�� ì��� ���� ���� �ʵ��� �� -> 2�� ��� ����
 * 3 ���� ��) å�� ���� ���� (�帣 ���� -> ���� ����) -> å ����Ʈ ������
 * 4 ���� ��) å�� ���̵� ���� (���� ���� -> å �д� �󵵼� ���� ) -> ���� ������ �´� å ����Ʈ ������
 * 5 ���� ��) ���� �� ���� �Է� -> 3�� �̸��� ��� ������ �� �Է� / ���Է� -> ���� ��� ������ -> 5�� ��� ����
 * 0 ���� ��) ���α׷� ����
 */

package bookWorm;

import java.util.*;

public class Select {
	// ����ڰ� ������ �� �ִ� ����� �����ִ� �Լ�
	public void selectDo() {
		System.out.println("<�ൿ>\n �˶� ���� : 1 \t �̵� �ð� ���� : 2 \t ���� ���� : 3 \t"
				+ "å�� ���� ���� : 4 \t ���� �ֱ� : 5 \t ���� : 0");
	}
	
	// main �Լ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Select sl = new Select();
		Alarm a = new Alarm();
		MovingTime mt = new MovingTime();
		Taste t = new Taste();
		Level l = new Level();
		Star s = new Star();
		
		while (true) {
//			0�� ������ ����
//			1�� ������ �˶� ���� (�︱ �ð� �Է� -> �︱ �� �Է� -> 'n�� n�п� �˶��� �︳�ϴ�' ���), �˶� ���� ���� �����ֱ�			*�߰��ϰ� ���� �κ� : '������ �ð����� n�ð� n�� ���ҽ��ϴ�' ���
//			2�� ������ �̵� �ð� ���� (���� �̵� �ð� �Է� -> 1�ð� �̻��� ��� -> å�� ���õ� ��Ʈ ���� ���)						*�߰��ϰ� ���� �κ� : ������ �����Ͽ� �������� ���� ���� ã�� �� �ְ� �ϰ� �ʹ�.
//			5�� ������ ���� �ֱ� (���񽺿� �����ϴ��� �� �Է� -> 3�� �̸��� ��� ������ �� �ۼ� -> �ۼ� �ź� �� ���� -> ���� ��� �����ֱ�), (���� ��ƺ���)
//			----------------------- ������� �����ߴٿ�
//			3�� ������ ���� ���� (�帣 ���� -> ���� ���� -> ���� ���� å ��õ)
//			4�� ������ å�� ���� ���� (���� ���� -> å �д� �󵵼� ���� -> ���� �´� ���� ��õ)
			
			//������ �����ִ� �Լ� �ҷ���.
			sl.selectDo();
			int selectNum = Integer.parseInt(sc.nextLine());
			if (selectNum == 0) {
				System.out.println("���α׷��� ����˴ϴ�. �����մϴ�.");
				break;
			}
			
			switch (selectNum) {
			case 1 : 
//				�˶� ��� �Լ� �ҷ���.
				a.setAlarm();
				break;

			case 2 :
//				�̵��ð� �����ϴ� �Լ� �ҷ���.
				mt.setTime();
				break;
				
			case 3 :
//				���� �����ϴ� �Լ� �ҷ���.
				t.selecTaste();
				break;
				
			case 4 :
//				���� �����ϴ� �Լ� �ҷ���.
				l.selectLevel();
				break;
				
			case 5 :
//				�����ű�� �Լ� �ҷ���.
				s.giveStar();
				break;
			}
		} //while ����
		
	}

}