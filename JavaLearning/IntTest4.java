/*
结论：多种数据类型做混合运算时，最终结果是“最大容量”。
*/
public class IntTest4{
	public static void main(String[] args){
		long a = 10L;
		char c = 'a';
		short s = 30;
		int i = 30;
		System.out.println(a + c + s + i);
		
		// 查看他们相加后的数据类型：
		//int x = a + c + s + i;
		// 报错： 错误: 不兼容的类型: 从long转换到int可能会有损失。
		// 说明以上结果为long类型。
		// 如下操作不报错
		int x = (int)(a + c + s + i);
		System.out.println(x);
		// java 中int类型和int类型最终的结果还是int类型。
		int y = 10 / 3;
		System.out.println(y);
		int temp = 1 / 2;
		System.out.println(temp);

	}
}