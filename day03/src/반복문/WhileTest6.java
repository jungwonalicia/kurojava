package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class WhileTest6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int data2 = r.nextInt(100);
		int target = data2;
		int count = 0;
		
		// ��Ʈ��+����Ʈ+f :�ڵ� ����
		while (true) { // ��� �Է�
			count++;
			System.out.print("������ �����Է�: ");
			int data = sc.nextInt();
			if (data == target) {
				System.out.println("�����մϴ�. �����Դϴ�.");
				System.out.println("����� �õ��� Ƚ����: " + count + "ȸ");
				
				break;
			} else {
				if (data > target) {
					System.out.println("�ʹ� Ů�ϴ�.");
				}else {
					System.out.println("�ʹ� �۽��ϴ�.");
				}
				System.out.println("��Ÿ�����ϴ�. ������ �ƴմϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
	}
}
