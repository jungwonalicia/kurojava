package �迭��ȭ;

import java.util.Scanner;

public class ������ձ��ϱ� {

	public static void main(String[] args) {
		int[] num = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("�����Է�: ");
			num[i] = sc.nextInt();
			sum = sum + num[i];
		}
		
		
		System.out.println("���� ����� " + sum/num.length);
	}

}
