/*
���ۣ����������������������ʱ�����ս���ǡ������������
*/
public class IntTest4{
	public static void main(String[] args){
		long a = 10L;
		char c = 'a';
		short s = 30;
		int i = 30;
		System.out.println(a + c + s + i);
		
		// �鿴������Ӻ���������ͣ�
		//int x = a + c + s + i;
		// ���� ����: �����ݵ�����: ��longת����int���ܻ�����ʧ��
		// ˵�����Ͻ��Ϊlong���͡�
		// ���²���������
		int x = (int)(a + c + s + i);
		System.out.println(x);
		// java ��int���ͺ�int�������յĽ������int���͡�
		int y = 10 / 3;
		System.out.println(y);
		int temp = 1 / 2;
		System.out.println(temp);

	}
}