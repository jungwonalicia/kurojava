package �迭��ȭ;

public class �ִ밪ã�� {

	public static void main(String[] args) {
		int[] num = { 77, 88, 99, 55, 22 };
		//���ؼ� �׻� �׶�������
		//�ִ밪�� ����ǵ��� �ϴ� ����
		int max = num[0];
		//for������ �迭�� ��ȸ�ϸ鼭
		//max���� ��
		//�迭�� ���� max������ ũ��
		//�� ���� max������ �ִ´�.
		//for���� ������ max�������� 
		//�ִ밪�� ���´�.
		for (int i = 0; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("�ִ밪�� " + max);
	}

}
