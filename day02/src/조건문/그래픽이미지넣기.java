package ���ǹ�;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class �׷����̹����ֱ� {

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.setSize(500, 500);
		
		JButton button = new JButton("\uC774\uBBF8\uC9C0\uB123\uAE30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("������ �����̱���.");
				Random r = new Random();
				//0->����, 1->����, 2->��
				int computer = r.nextInt(3);
				if(computer == 0) { //����
					f.setTitle("�����");
					System.out.println("�����.");
				}else if(computer == 1) { //����
					f.setTitle("f.setTitle(\"�����\");");
					System.out.println("��ǻ�� ��.");
				}else {
					f.setTitle("���� ��.");
					System.out.println("���� ��.");
				}
			}
		});
		button.setIcon(new ImageIcon("D:\\aliciawill\\day02\\\uAC00\uC704.jpg"));
		f.getContentPane().add(button, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("\uBC14\uC704");
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("\uBCF4");
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		
		f.setVisible(true);		
	}

}
