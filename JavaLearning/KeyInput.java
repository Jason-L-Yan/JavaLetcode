public class KeyInput{
	public static void main(String[] args){
		// s是变量名。
		java.util.Scanner s = new  java.util.Scanner(System.in);
		// 接收一个正整数。
		int i = s.nextInt();
		System.out.println("您输入的数字是："+i);
		// 接收字符串
		String str = s.next();
		System.out.println(str);
	}
}