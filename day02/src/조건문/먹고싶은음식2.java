package ���ǹ�;

import java.util.Scanner;

public class �԰��������2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�԰� ���� ���� �����ϼ���. ");
		System.out.print("�н�, �ѽ�, �Ͻ�, ��Ÿ >> ");
		String food = sc.next();
		
		switch (food) {
		case "�н�":
			System.out.println("�н�������");
			break;
		case "�ѽ�":
			System.out.println("�ѽ�������");
			break;
		case "�Ͻ�":
			System.out.println("�Ͻ�������");
			break;
		default:
			System.out.println("������");
			break;
		}
	}

}
