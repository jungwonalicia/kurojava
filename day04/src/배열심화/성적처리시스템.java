package �迭��ȭ;

import java.util.Scanner;

public class ����ó���ý��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = null;
		while (true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("----------------------------------------------");
			System.out.print("����>> ");
			int data = sc.nextInt();
			if (data == 1) {
				System.out.print("�л���: ");
				int data2 = sc.nextInt();
				score = new int[data2];
			}else if (data == 2) {
				//for�� �ʿ�-�迭�� ������ŭ 
				//�Է��ĳ־���.
				for (int i = 0; i < score.length; i++) {
					System.out.print("���� �Է�>> ");
					score[i] = sc.nextInt();
				}
			}else if (data == 3) { 
				//for�� �ʿ�-��¸� ��.
				for (int i = 0; i < score.length; i++) {
					System.out.println(score[i]);
				}
			}else if (data == 4) {
				//�м�-�ִ밪, ���
				//for�� �ʿ�(�ִ밪)
				int max = score[0];
				for (int i = 0; i < score.length; i++) {
					if(score[i] > max) {
						max = score[i];
					}
				}
				System.out.println("�ִ밪: " + max);
				//for�� �ʿ�(���)
				int sum = 0;
				for (int i = 0; i < score.length; i++) {
					sum = sum + score[i];
				}
				System.out.println("���: " + sum/score.length);
			}else { //5���϶�.
				System.out.println("�ý��� ����");
				break;
			}
		}
	}

}
