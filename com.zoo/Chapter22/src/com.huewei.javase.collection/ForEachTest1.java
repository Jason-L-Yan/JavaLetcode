/*
JDK5.0֮���Ƴ���һ�������ԣ�������ǿforѭ�������߽���foreach
 */
public class ForEachTest1 {
    public static void main(String[] args) {
        int[] arr = { 432, 4, 65, 46, 54, 76, 54 };
        // �������飨��ͨforѭ����
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("=================================");
        // ��ǿfor(foreach)
        // ��ǿfor��foreach��
        // �������﷨
        // for(Ԫ������ ������ : ����򼯺�){
        //     System.out.println(������);
        // }

        // foreach��ȱ�����û���±ꡣ
        for (int data : arr) {
            // data ���������е�Ԫ�أ������е�ÿһ��Ԫ�أ�
            System.out.println(data);
        }

    }
}
