package �ݺ���;

import java.util.Scanner;

public class �ӵ��������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int speed = 100;
		while(true) {
			System.out.println("------------------------");
			System.out.println("1.����, 2.����, 3.����");
			System.out.println("------------------------");
			System.out.print("����>> ");
			int data = sc.nextInt();
			if(data == 1) {
				//����ó��
				System.out.print("���Ӱ�: ");
				int data2 = sc.nextInt();
				speed = speed + data2;
				System.out.println("���� �ӵ�: " + speed);
			}else if(data == 2) {
				//����ó��
				System.out.print("���Ӱ�: ");
				int data3 = sc.nextInt();
				speed = speed - data3;
				System.out.println("���� �ӵ�: " + speed);
			}else if(data == 3) {
				//����
				System.out.println("���α׷� �����մϴ�.");
				break;
			}else {
				System.out.println("�ش� ������ �����ϴ�.");
			}
		}
	}

}
