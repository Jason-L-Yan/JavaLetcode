package JavaLearning;
import java.util.Scanner;
import java.util.LinkedList;
public class Josephus{
    public static void main(String[] args){
        Solution6 s = new Solution6();
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
        int m = d.nextInt();
        System.out.println(s.lastRemaining_Solution(n, m) + 1);
        d.close();


    }
}

class Solution6{
    public int lastRemaining_Solution(int n, int m){

        if(n == 0 || m == 0){
            return -1;
        }
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        int removeIndex = 0;
        while(list.size() != 1){
            removeIndex = (removeIndex + m - 1) % list.size();
            list.remove(removeIndex);
        }
        return list.get(0);
    } 
}




