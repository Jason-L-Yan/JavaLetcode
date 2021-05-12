package Chapter19.com.huawei.javaSE.array;

// ��һ�������ϣ�������������һ�������ʱ��

public class ArrayTest3 {
    // main�����ı�д��ʽ�������Բ���C++���﷨��ʽŶ��
    public static void main(String args[]) {  // String[] args ����java�еķ�ʽ��

        System.out.println("hello world!");

        // java�ķ��
        int[] a1 = {1,23,3};
        for (int i = 0; i < a1.length ; i++) {
            System.out.println(a1[i]);
        }

        // C++��д���������顣
        int a2[] = {3,4,2};
        for (int i = 0; i < a2.length ; i++) {
            System.out.println(a2[i]);
        }

        System.out.println("===================================");
        // ���÷���ʱ��һ������
        int[] x = {1,2,3,4};
        printArray(x);

        // ����String����
        String[] stringArray = {"abc", "def", "hehe", "haha"};
        printArray(stringArray);

        String[] strArray = new String[10];
        printArray(strArray); // 10��null

        System.out.println("================================");
        printArray(new String[3]);
        System.out.println("***********************************");
        printArray(new int[4]);

    }
	
	// ��ӡ����Ԫ��,����
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void printArray(String[] args){
        for(int i = 0; i < args.length; i++){
            System.out.println("String�����е�Ԫ�أ�" + args[i]);
        }
    }

}
