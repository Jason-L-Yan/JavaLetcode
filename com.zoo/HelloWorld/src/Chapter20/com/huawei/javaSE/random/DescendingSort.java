package Chapter20.com.huawei.javaSE.random;

import java.util.Arrays;
import java.util.Comparator;

public class DescendingSort {
    public static void main(String[] args) {
        //int��װ��������飬��ֵ
        Integer[] arr = {12,15,32,16,20,25, 16};
        //�����������Ͷ���arr����������ʵ��Comparator�ӿڣ�i1��ǰ��Ϊ���򣬷�������
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                int num = i2 - i1;
                return num;
            }
        });
        //��ӡ����
        System.out.println(Arrays.toString(arr));
    }
}
