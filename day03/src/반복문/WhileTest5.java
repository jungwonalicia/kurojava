package �ݺ���;

import java.util.Scanner;

public class WhileTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.print("�Է�(���� 0): ");
			int data = sc.nextInt();
			if(data == 0) {
				System.out.println("���α׷� ����.");
				break; //�ݺ��� ����
			}
			System.out.println("Ȯ��: " + data);
			//sum���ٰ� �Է°� ��� ���غ�����.
			sum = sum + data;
			//��������� sum���� ���.
			System.out.println("��������� ��" + sum);
		}
		System.out.println("�������� " + sum);
	}
}
