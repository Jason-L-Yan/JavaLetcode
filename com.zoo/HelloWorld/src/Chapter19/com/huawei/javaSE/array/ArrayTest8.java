/**
 * ����һά��������ݡ�
 * ��java�����У����鳤��һ��ȷ�����ɱ䣬��ô����������ô�죿
 *      �������ˣ���Ҫ���ݡ�
 *      java�ж�����������ǣ�
 *          ���½�һ�������������飬Ȼ��С���������е�����һ��һ�������������鵱�С�
 *
 * ���ۣ���������Ч�ʽϵ͡���Ϊ�漰�����������⡣�������Ժ�Ŀ�������ע�⣺�������ٵĽ�������Ŀ�����
 * �����ڴ�����������ʱ��Ԥ�������¶೤���ʣ����Ԥ��׼ȷ���������Լ�����������ݴ��������Ч�ʡ�
 */
package Chapter19.com.huawei.javaSE.array;

public class ArrayTest8 {
    public static void main(String[] args) {
        // java�е���������ô���п������أ�
        // System.arraycopy(5������);
        
        // ����Դ������������п�����
        int[] sources = {1, 11, 22, 3, 4};
        // ����Ŀ�꣨���������Ŀ�������ϣ�
        int[] destination = new int[20];  // ��̬��ʼ��һ������Ϊ20�����飬ÿһ��Ԫ��Ĭ��ֵ0

        // ����JDK System���е�arraycopy���������������Ŀ���
        // void java.lang.System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        // System.arraycopy(sources, 1, destination, 3, 2);
        // ���������е�ȫ������
        System.arraycopy(sources, 0, destination, 0, sources.length);
        // ����Ŀ������
        for (int i = 0; i < destination.length; i++) {
            System.out.println(destination[i]);
        }

        System.out.println("===========================�����д洢���ý��п���================================");
        // ����������洢��Ԫ�������ã����Կ����𣿵�Ȼ���ԡ�
        String[] strs = {"hello", "world!", "study", "java", "oracle", "mysql", "jdbc"};
        String[] newStrs = new String[20];
        System.arraycopy(strs, 0, newStrs, 0, strs.length);
        for (int i = 0; i < newStrs.length; i++) {
            System.out.println(newStrs[i]);
        }

        System.out.println("===============================================================================");
        Object[] objs = {new Object(), new Object(), new Object()};
        Object[] newObjs = new Object[5];
        // ˼��һ�£���������ʱ���ǿ������󣬻��ǿ�������ĵ�ַ������ַ����
        System.arraycopy(objs, 0, newObjs, 0, objs.length);
        for (int i = 0; i < newObjs.length; i++) {
            System.out.println(newObjs[i]);
        }
    }
}
