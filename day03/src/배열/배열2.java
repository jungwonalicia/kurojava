package �迭;

public class �迭2 {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5};
				
		System.out.println(num[0]);
		System.out.println(num[3]);
		
		
		
		double[] eye = {0.5, 0.6, 1.0, 2.0, 0.8};
		System.out.println(eye[2]);
		//�迭�� ��ġ���� ������ ����
		//��ġ��=index
		//index�� 0���� ����
		//index�� ���������� ����-1
		System.out.println(eye.length);
		
		String[] name = {"ȫ�浿", "��浿"};
		System.out.println(name.length);
		
		char[] gender = {'��', '��'};
		System.out.println(gender[0]);
		System.out.println(gender[1]);
		
		for (int i = 0; i < gender.length; i++) {
			System.out.println(i + ": " + gender[i]);
			
		}
		
		
		
	}

}
