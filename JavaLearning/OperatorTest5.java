/*
	+运算符：
		1. +运算符在java语言中有两个作用
			作用1：求和
			作用2：字符串拼接
		2. 什么时候求和？什么时候拼接？
			当+运算符两边都是数字类型时，求和；
			当+运算符两边==任意一边==是字符串类型，那么这个+会进行拼接操作。
		3. 一定要记住:字符串拼接之后的结果还是一个字符串。
*/
public class OperatorTest5{
	public static void main(String[] args){
		int a = 100;
		int b = 200;
		System.out.println(a + "+" + b +"=" + (a + b) );  // 100+200=300

		String name = "jason";
		// 加一个双引号，双引号之间放两个加号，然后两个加号中间放变量名。
		//System.out.println("登录成功，欢迎" + name + "回来！！");
		System.out.println("登录成功，欢迎"+name+"回来！！");

	}
}