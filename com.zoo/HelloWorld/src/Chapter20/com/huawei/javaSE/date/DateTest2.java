/*
��ȡ��1970��1��1�� 00:00:00 000����ǰϵͳʱ����ܺ�������
1�� = 1000����

���ܽ�һ��System���������Ժͷ�����
    System.out ��out��System��ľ�̬��������
    System.out.println() ��println()��������System��ģ���PrintStream��ķ�������
    System.gc() ������������������
    System.currentTimeMillis() ��ȡ��1970��1��1�յ�ϵͳ��ǰʱ����ܺ�������
    System.exit(0) �˳�JVM��
 */

package Chapter20.com.huawei.javaSE.date;

public class DateTest2 {
    public static void main(String[] args) {
        // ��ֱ�ӵ��Ǿ�̬������
        long nowTimeMilis = System.currentTimeMillis();
        System.out.println(nowTimeMilis);  // 1621066266656
        long begin = System.currentTimeMillis();
        print();
        System.out.println("�ķ�ʱ����" + (System.currentTimeMillis() - begin)); 
    }

    // ͳ��һ������ִ�кķ�ʱ��
    public static void print() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("i = " + i);
        }
    }
    
}

