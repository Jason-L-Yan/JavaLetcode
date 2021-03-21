/*
	逻辑运算符：
		&  逻辑与（并且）:一假俱假
		|  逻辑或（或者）
		！ 逻辑非
		&& 短路与
		|| 短路或
	逻辑运算符两边要求都是布尔类型，并且最终结果也是布尔类型。
*/
public class OperatorTest{
	public static void main(String[] args){

		byte x = 100;
		System.out.println(x);  // 100

		// x = x + 1;  // 报错，因为 1 是 int 类型。
		x += 1;  // 正确的
		System.out.println(x);

		// 超出了byte的取值范围，但是不报错，因为此句话约等于 x = (byte)(x + 199)
		// 会损失精度。
		x += 199;  
		System.out.println(x);
	}
}

