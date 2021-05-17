/**
 * 随机生成5个不相同的数；
 */
package Chapter20.com.huawei.javaSE.random;

// import java.util.Arrays;
import java.util.Random;

public class RandomTest2 {
    public static void main(String[] args) {
        // 创建Random对象
        Random random = new Random();

        // 准备一个长度为5的一维数组。
        int[] arr = new int[5]; // 默认值都是0
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }

        // 循环，生成随机数
        int index = 0;
        while(index < arr.length){
            // 生成随机数
            //int num = random.nextInt(101);
            //int num = random.nextInt(6); // 只能生成[0-5]的随机数！
            int num = random.nextInt(5); // 只能生成[0-3]的随机数！永远都有重复的，永远都凑不够5个。
            System.out.println("生成的随机数：" + num);
            // 判断arr数组中有没有这个num
            // 如果没有这个num，就放进去。
            if(!contains(arr, num)){
                arr[index++] = num;
            }
        }
        print(arr);
    }

    public static boolean contains(int[] arr, int key){
        /*
        // 这个方案bug。（排序出问题了。）
        // 对数组进行升序
        //Arrays.sort(arr);
        // 进行二分法查找
        // 二分法查找的结果 >= 0说明，这个元素找到了，找到了表示存在！
        //return Arrays.binarySearch(arr, key) >= 0;
         */

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                // 条件成立了表示包含，返回true
                return true;
            }
        }
        // 这个就表示不包含！
        return false;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
