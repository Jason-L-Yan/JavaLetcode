/**
 * �������5������ͬ������
 */
package Chapter20.com.huawei.javaSE.random;

// import java.util.Arrays;
import java.util.Random;

public class RandomTest2 {
    public static void main(String[] args) {
        // ����Random����
        Random random = new Random();

        // ׼��һ������Ϊ5��һά���顣
        int[] arr = new int[5]; // Ĭ��ֵ����0
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }

        // ѭ�������������
        int index = 0;
        while(index < arr.length){
            // ���������
            //int num = random.nextInt(101);
            //int num = random.nextInt(6); // ֻ������[0-5]���������
            int num = random.nextInt(5); // ֻ������[0-3]�����������Զ�����ظ��ģ���Զ���ղ���5����
            System.out.println("���ɵ��������" + num);
            // �ж�arr��������û�����num
            // ���û�����num���ͷŽ�ȥ��
            if(!contains(arr, num)){
                arr[index++] = num;
            }
        }
        print(arr);
    }

    public static boolean contains(int[] arr, int key){
        /*
        // �������bug��������������ˡ���
        // �������������
        //Arrays.sort(arr);
        // ���ж��ַ�����
        // ���ַ����ҵĽ�� >= 0˵�������Ԫ���ҵ��ˣ��ҵ��˱�ʾ���ڣ�
        //return Arrays.binarySearch(arr, key) >= 0;
         */

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                // ���������˱�ʾ����������true
                return true;
            }
        }
        // ����ͱ�ʾ��������
        return false;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
