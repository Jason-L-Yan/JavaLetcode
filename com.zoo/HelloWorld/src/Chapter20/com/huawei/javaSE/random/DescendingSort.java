package Chapter20.com.huawei.javaSE.random;

import java.util.Arrays;
import java.util.Comparator;

public class DescendingSort {
    public static void main(String[] args) {
        //int包装类对象数组，赋值
        Integer[] arr = {12,15,32,16,20,25, 16};
        //传入引用类型对象arr，用匿名类实现Comparator接口，i1在前则为升序，反正降序
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                int num = i2 - i1;
                return num;
            }
        });
        //打印数组
        System.out.println(Arrays.toString(arr));
    }
}
