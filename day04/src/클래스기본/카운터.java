package Ŭ�����⺻;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ī���� {
	static int count = 0;
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
//		������ ��ǰ 1
		JLabel result = new JLabel("0");
		JFrame	f = new JFrame();
		f.getContentPane().setBackground(Color.CYAN);
		f.setTitle("���� ī����");
		f.setSize(369, 527);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7901");
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBackground(new Color(124, 252, 0));
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("����", Font.BOLD, 35));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel label = new JLabel("\uC22B\uC7902");
		f.getContentPane().add(label);
		
		t2 = new JTextField();
		t2.setBackground(new Color(124, 252, 0));
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("����", Font.BOLD, 35));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\aliciawill\\day04\\004.png"));
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("-�� �����̱���.");
				//count--;
				//�� ���� ���ڰ��� ������ �;��Ѵ�.
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1 + ", " + s2);
				
				//��� �Է°��� �� String->int�� ��ȯ
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				//-����
				int n3 = n1 - n2;
				
				//result�� ����� �־���.
				
				result.setText(n3+"");
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("����", Font.BOLD, 99));
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("0");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("0�� �����̱���.");
				//count = 0;
				result.setText(0+"");
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 99));
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("+��ư�� �����̱���.");
//				count++;
				//�� ���� ���ڰ��� ������ �;��Ѵ�.
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1 + ", " + s2);
				
				//��� �Է°��� �� String->int�� ��ȯ
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				//+����
				int n3 = n1 + n2;
				
				//result�� ����� �־���.
				
				result.setText(n3+"");
			}
		});
		btnNewButton_2.setBackground(Color.MAGENTA);
		btnNewButton_2.setFont(new Font("����", Font.BOLD, 99));
		f.getContentPane().add(btnNewButton_2);
		
		
		result.setForeground(Color.RED);
		result.setFont(new Font("����", Font.BOLD, 99));
		f.getContentPane().add(result);
//		��ġ ��ǰ 1
//		��(�̹���, ����) ��ǰ 2
//		�̹��� ��ǰ 1
//		��ư ��ǰ 3
		
		
		f.setVisible(true);
	}

}
