public class IntTest2{
	public static void main(String[] args){
		int a;
		a = 100;  // 100Ĭ����int����������
		System.out.println(a);
    
		//int b;  // long b����㲻�ᱨ��
		//b = 100L;  // ����100LΪlong�ͣ�������Ϊint�ͣ����Իᱨ��
		//System.out.println(b);
    
		long c = 100;  // ���ַ�ʽ���ԣ������Զ���������ת��������û����������ת����
		System.out.println(c);
    
		long d = 2147483647;  // 2147483647��int�����ֵ��
		System.out.println(d);
    
		long e = 21474836478L;  // ������int�����ֵ��һλ���ᱨ����Ϊ21474836478Ĭ��Ϊint�ͣ�������������int����ֵ��Χ������Ӹ�L�Ͳ�����
		System.out.println(e);
	}
}