public class IntTest2{
	public static void main(String[] args){
		int a;
		a = 100;  // 100默认是int型数据量。
		System.out.println(a);
    
		//int b;  // long b下面便不会报错。
		//b = 100L;  // 报错。100L为long型，而定义为int型，所以会报错。
		//System.out.println(b);
    
		long c = 100;  // 这种方式可以，可以自动数据类型转换。上面没有数据类型转换。
		System.out.println(c);
    
		long d = 2147483647;  // 2147483647是int型最大值。
		System.out.println(d);
    
		long e = 21474836478L;  // 报错。比int型最大值多一位，会报错，因为21474836478默认为int型，但是它超过了int的数值范围。后面加个L就不报错。
		System.out.println(e);
	}
}