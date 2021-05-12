/*
1�����鹤���ࣺ�Լ�д�ġ�����SUN�ġ�

2�����ڲ����㷨�еģ����ַ����ҡ�
    10(�±�0) 11 12 13 14 15 16 17 18 19 20(�±�10)   arr���顣

    ͨ�����ַ����ң��ҳ�18���Ԫ�ص��±꣺
        (0 + 10) / 2 --> �м�Ԫ�ص��±꣺ 5

    �����м����Ԫ�غ�Ŀ��Ҫ���ҵ�Ԫ�ؽ��жԱȣ�
        �м�Ԫ���ǣ�arr[5] --> 15
        15 < 18(�����ҵ�Ԫ��)
        �����ҵ�Ԫ��18��Ŀǰ�м�Ԫ��15���ұߡ�
        ���Կ�ʼԪ�ص��±��0��� 5 + 1.

    �����¼���һ���м�Ԫ�ص��±꣺
        ��ʼ�±��ǣ�5 + 1
        �����±��ǣ�10
        (6 + 10) / 2 --> 8

    8�±��Ӧ��Ԫ��arr[8]��18
        �ҵ����м�Ԫ�����úͱ��ҵĵ�Ԫ��18��ȣ���ʾ�ҵ��ˣ��±�Ϊ8

    ���ַ����ҵ���ֹ������һֱ�۰룬ֱ���м���Ǹ�Ԫ��ǡ���Ǳ����ҵ�Ԫ�ء�

3�����ַ������㷨�ǻ�������Ļ���֮�ϡ���û��������������޷����ҵġ���

 */
package com.huawei.javaSE.array;

public class ArraySearch2 {
    public static void main(String[] args) {
        int[] array = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        for (int i = 10; i < 23; i++) {
            int index = binarySearch(array, i);
            System.out.println("Ԫ��" + i + "��������" + (index == -1 ? "��Ԫ�ز�����" : "��Ԫ���±��ǣ�" + index));
        }
    }

    /**
     * �������м���ĳ��Ԫ�ص��±�
     * @param array �����ҵ�����
     * @param i Ŀ��Ԫ��
     * @return ���ش��ڵ���0������ʾ�±꣬���򷵻�-1����ʾԪ�ز����ڡ�
     */
    private static int binarySearch(int[] array, int i) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (int) (low + (high - low) / 2);
            if (array[mid] > i) {
                high = mid - 1;
            } else if (array[mid] < i) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
