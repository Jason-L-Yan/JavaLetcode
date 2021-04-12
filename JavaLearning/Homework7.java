package JavaLearning;

// public class Homework7 {
//     public static void main(String[] args){
//         for(int i = 2; i < 100000; i++){
//             if(peaNumber(10, i) != 0){
//                 System.out.println("猴子摘的桃子数目为："+i);
//                 break;
//             }
//         }
    
        
//     }

//     // 递归的方法
//     public static int peaNumber(int day, int pea){

//         if(day <= 0 || pea <= 0){
//             return 0;
//         }

//         if(day == 1 && pea == 1){
//             return pea;
//         }

//         return peaNumber(day - 1, (pea / 2 - 1));
//         // return pea;
//     }
// }
public class Homework7 {
	public static void main(String[] args){
		int total = 1;
		int day = 10;
		for(int i = 10; i > 0; i--){
			System.out.println("第"+day+"天,有桃子"+total+"颗");
			total = (total + 1) * 2;
			day--;
		}
	}
}