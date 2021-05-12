/*
关于java中的二维数组
    1、二维数组其实是一个特殊的一维数组，特殊在这个一维数组当中的每一个元素是一个一维数组。
    2、三维数组是什么？
        三维数组是一个特殊的二维数组，特殊在这个二维数组中每一个元素是一个一维数组。
        实际的开发中使用最多的就是一维数组。二维数组也很少使用。三维数组几乎不用。
    3、二维数组静态初始化
        int[][] array = {{1,1,1},{2,3,4,5},{0,0,0,0},{2,3,4,5},{2,3,4,5},{2,3,4,5},{2,3,4,5}};
 */

package Chapter19.com.huawei.javaSE.array;

public class ArrayTest9 {
    public static void main(String[] args) {
        // 一维数组
        // int[] array = {100, 200, 500};
        
        // 二维数组,第二个维度可以不同。
        int[][] a = {
            {100, 200, 300}, 
            {30, 20, 40, 50, 60},
            {6, 7, 9, 1},
            {0}
        };
        System.out.println("中文变量：");
        int[] 我是第1个一维数组 = a[0];
        int 我是第1个一维数组的第一个元素 = 我是第1个一维数组[0];
        System.out.println(我是第1个一维数组的第一个元素);
        System.out.println("a数组：");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("b数组：");
        int[][] b = new int[6][6];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("b2数组：");
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
