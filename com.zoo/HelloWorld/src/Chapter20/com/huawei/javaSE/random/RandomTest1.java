package Chapter20.com.huawei.javaSE.random;

import java.util.Random;

public class RandomTest1 {
    public static void main(String[] args) {
        // �������������
        Random r = new Random();
        // �������һ��int����ȡֵ��Χ�ڵ����֡�
        int nums = r.nextInt();
        System.out.println(nums);

        // ����[0~100]֮�������������ܲ���101��
        // nextInt����Ϊ����һ��int���͵�������101����ʾֻ��ȡ��100.
        int nums2 = r.nextInt(101);
        System.out.println(nums2);
    }
}
