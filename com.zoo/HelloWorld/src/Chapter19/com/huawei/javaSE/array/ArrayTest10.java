package Chapter19.com.huawei.javaSE.array;

/*
��̬��ʼ����ά���顣
 */
public class ArrayTest10 {
    public static void main(String[] args) {
        // 3��4�С�
        // 3��һά���飬ÿһ��һά���鵱��4��Ԫ�ء�
        int[][] array = new int[3][4];

        // ��ά�������
        /*
        for (int i = 0; i < array.length; i++) { // ѭ��3�Ρ�
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
         */

        // ��̬��ʼ��
        int[][] a = {{1,2,3,4},{4,5,6,76},{1,23,4}};
        printArray(a);
        System.out.println("==================================");
        // û�������﷨
        //printArray({{1,2,3,4},{4,5,6,76},{1,23,4}});

        // ��������д��
        printArray(new int[][]{{1,2,3,4},{4,5,6,76},{1,23,4}});
    }

    public static void printArray(int[][] array){
        // ������ά���顣
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

