/*
�����Ԫ�ز���
    ����Ԫ�ز��������ַ�ʽ��
        ��һ�ַ�ʽ��һ��һ�������ң�ֱ���ҵ�Ϊֹ��
        �ڶ��ַ�ʽ�����ַ����ң��㷨�������Ч�ʽϸߡ�
 */

package Chapter19.com.huawei.javaSE.array;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 5, 87, 8, 9, 7, 0 };
        int index = arraySearch(arr, 8);
        // if (index != -1)
        // System.out.println(index);
        // else
        // System.out.println("��Ԫ�ز�����");
        
        // ��Ŀ����������
        System.out.println(index == -1 ? "��Ԫ�ز�����" : "��Ԫ���±��ǣ�" + index);
    }

    /**
     * �������м���ĳ��Ԫ�ص��±�
     * @param arr ������������
     * @param destination ��������Ԫ��
     * @return ���ش��ڵ���0������ʾ�±꣬���򷵻�-1����ʾԪ�ز����ڡ�
     */
    private static int arraySearch(int[] arr, int destination) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == destination) {
                return i;
            }
        }
        return -1;
    }

}
