package �迭��ȭ;

import java.util.Scanner;

public class �ִ밪ã��2 {

	public static void main(String[] args) {
		int[] num = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("�����Է�: ");
//			int data = sc.nextInt();
//			num[i] = data;
			num[i] = sc.nextInt();
		}
		
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("�ִ밪�� " + max);
	}

}
