package �迭;

import java.util.Scanner;

public class �迭6 {

	public static void main(String[] args) {
		//���� ���� ���α׷�
		int[] eng = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < eng.length; i++) {
			System.out.print("���� �Է�>> ");
			int data = sc.nextInt();
			eng[i] = data;
		}
		
		//0�� ó��
		eng[2] = 0;
		
		System.out.println("���� ���------");
		for (int i = 0; i < eng.length; i++) {
			System.out.println(eng[i]);
		}
	}
}
