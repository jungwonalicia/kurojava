package ���ǹ�;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ���ǹ�3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է°�: ");
		int data = sc.nextInt();
		if (data >= 1000) {
			System.out.println("�����޼�!");
			double bonus = data * 0.2;
			System.out.println("����� ���ʽ��� " + (int)bonus + "����");
		} else {
			System.out.println("�����̴޼�!");
		}
	}

}
