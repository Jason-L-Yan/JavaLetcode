/*
	hashCode������
		��Object�е�hashCode�����������ģ�
			public native int hashCode();

			����������ǳ��󷽷�������native�ؼ��֣��ײ����C++����
		
		hashCode()�������ص��ǹ�ϣ�룺
			ʵ���Ͼ���һ��java������ڴ��ַ��������ϣ�㷨���ó���һ��ֵ��
			����hashCode()������ִ�н�����Ե�ͬ����һ��java������ڴ��ַ��
*/

package Chapter18;

public class TestObject7 {
    public static void main(String[] args) {
        Object obj = new Object();
        int hashCodeValue = obj.hashCode();
        // �����ڴ��ַ������ϣ�㷨ת����һ�����֡����Ե�ͬ�����ڴ��ַ��
        System.out.println(hashCodeValue);  // 681842940

        MyClass mc = new MyClass();
        int hashCodeValue2 = mc.hashCode();
        System.out.println(hashCodeValue2);  // 523429237

    }
}

class MyClass {

}