package JavaLearning;

public class SumWei {
    public static void main(String[] args){
        Solution2 s2 = new Solution2();
        System.out.println(s2.add(20, 17));
    }
}

class Solution2 {
    public int add(int a, int b) {
        while(b != 0) { // 当进位为 0 时跳出
            int c = (a & b) << 1;  // c = 进位
            a ^= b; // a = 非进位和
            b = c; // b = 进位
        }
        return a;
    }
}

