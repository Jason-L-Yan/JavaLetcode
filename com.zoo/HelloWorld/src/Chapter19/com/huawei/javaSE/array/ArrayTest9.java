/*
����java�еĶ�ά����
    1����ά������ʵ��һ�������һά���飬���������һά���鵱�е�ÿһ��Ԫ����һ��һά���顣
    2����ά������ʲô��
        ��ά������һ������Ķ�ά���飬�����������ά������ÿһ��Ԫ����һ��һά���顣
        ʵ�ʵĿ�����ʹ�����ľ���һά���顣��ά����Ҳ����ʹ�á���ά���鼸�����á�
    3����ά���龲̬��ʼ��
        int[][] array = {{1,1,1},{2,3,4,5},{0,0,0,0},{2,3,4,5},{2,3,4,5},{2,3,4,5},{2,3,4,5}};
 */

package Chapter19.com.huawei.javaSE.array;

public class ArrayTest9 {
    public static void main(String[] args) {
        // һά����
        // int[] array = {100, 200, 500};
        
        // ��ά����,�ڶ���ά�ȿ��Բ�ͬ��
        int[][] a = {
            {100, 200, 300}, 
            {30, 20, 40, 50, 60},
            {6, 7, 9, 1},
            {0}
        };
        System.out.println("���ı�����");
        int[] ���ǵ�1��һά���� = a[0];
        int ���ǵ�1��һά����ĵ�һ��Ԫ�� = ���ǵ�1��һά����[0];
        System.out.println(���ǵ�1��һά����ĵ�һ��Ԫ��);
        System.out.println("a���飺");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("b���飺");
        int[][] b = new int[6][6];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("b2���飺");
        int[][] b2 = new int[][]{
            {100, 200, 300}, 
            {30, 20, 40, 50, 60},
            {6, 7, 9, 1},
            {0}
        };  
        for (int i = 0; i < b2.length; i++) {
            for (int j = 0; j < b2[i].length; j++) {
                System.out.print(b2[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
