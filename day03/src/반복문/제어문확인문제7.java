package �ݺ���;

import java.util.Scanner;

public class ���Ȯ�ι���7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 10000;
		
		while (true) {
			System.out.println("----------------------------");
			System.out.println("1.����|2.���|3.�ܱ�|4.����");
			System.out.println("----------------------------");
			System.out.print("����>> ");
			int data = sc.nextInt();
			if(data == 1) {
				System.out.print("���ݾ��Է�>> ");
				int data2 = sc.nextInt();//���ݾ� �Է�
				money = money + data2;
			}else if (data == 2) {
				System.out.print("��ݾ��Է�>> ");
				int data3 = sc.nextInt();//���ݾ� �Է�
				money = money - data3;
			}else if (data == 3) {
				System.out.println("���� �ܱ�: "  + money + "��");
			}else {
				System.out.println("�ý��� �����մϴ�.");
				break;
				//����
			}
		}
	}

}
