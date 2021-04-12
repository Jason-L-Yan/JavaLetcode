package JavaLearning;

// public class Test12{
//     public static void main(String[] args){
//         java.util.Scanner s = new java.util.Scanner(System.in);
//         String str = s.next();

//         java.util.BitSet bitSet = new java.util.BitSet(128);
//         for(char c:str.toCharArray()){
//             // 如果是 false，设置为True
//             if(!bitSet.get(c)){

//                 bitSet.set(c);
//             }
//         }
//         System.out.println(bitSet.cardinality());
//         for(int i = 0;i<bitSet.length();i++) {
//             if(bitSet.get(i)) {
//             		System.out.println("此时i的值： "+ i);
//              }
//        }
        
//     }
// }

// public class Test12{
//     public static void main(String[] args){
//         java.util.Scanner s = new java.util.Scanner(System.in);
//         String str = s.next();
//         System.out.println(str);
//     }
// }






// public class Test12{
//     public static void main(String[] args){
//         int[][] num=new int[][]{{3,8,1,2},{6,9,2,1},{9,8,0,6}};
//         System.out.println(num.length);
//         System.out.println(num[0].length);
//     }
// }

public class Test12 {
    public static void main(String[] args){

        // int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] matrix = new int[][]{{1,3}};
        System.out.println(searchMatrix(matrix, 2));
        

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rowLen = matrix.length - 1;
        int column = matrix[0].length - 1;
        // System.out.println(matrix[rowLen][column]);
        int flag = 0;
        for(int i = rowLen; i >= 0; i--){
            int mid = 0;
            int low = 0;
            int high = column;
            flag = 0;
            // System.out.println("你好");
            if(matrix[i][column] < target){
                return false;
            }else if(matrix[i][column] == target){
                return true;
            }else{
                
                while(low <= high){
                    
                    // flag = 0;
                    mid = (high + low) / 2;
                    if(matrix[i][mid] == target){
                        return true;
                    }
                    if(matrix[i][mid] > target){
                        high = mid - 1;
                    }else{
                        low = mid + 1;
                    }
                    // if(low == high){
                    //     flag += 1;
                    // }
                    // if(flag == 2){
                    //     break;
                    // }
                }
                

            }
        }

        return false;   
    }
    
}












