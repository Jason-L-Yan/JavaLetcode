/*
	�߼��������
		&  �߼��루���ң�:һ�پ��
		|  �߼��򣨻��ߣ�
		�� �߼���
		&& ��·��
		|| ��·��
	�߼����������Ҫ���ǲ������ͣ��������ս��Ҳ�ǲ������͡�
*/
public class OperatorTest{
	public static void main(String[] args){

		byte x = 100;
		System.out.println(x);  // 100

		// x = x + 1;  // ������Ϊ 1 �� int ���͡�
		x += 1;  // ��ȷ��
		System.out.println(x);

		// ������byte��ȡֵ��Χ�����ǲ�������Ϊ�˾仰Լ���� x = (byte)(x + 199)
		// ����ʧ���ȡ�
		x += 199;  
		System.out.println(x);
	}
}

