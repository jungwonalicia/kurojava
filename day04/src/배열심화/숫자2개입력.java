package �迭��ȭ;

import javax.swing.JOptionPane;

public class ����2���Է� {

	public static void main(String[] args) {
		String data1 = JOptionPane.showInputDialog("����1�Է�");
		String data2 = JOptionPane.showInputDialog("����2�Է�");
		
		int n1 = Integer.parseInt(data1);
		int n2 = Integer.parseInt(data2);
		
		int n3 = n1 + n2;
		
		JOptionPane.showMessageDialog(null, "�� ���� ���� " + n3);
	}

}
