
/*
	接口的基础语法：
		1、类和类之间叫做继承，类和接口之间叫做实现。
		别多想：你仍然可以将"实现"看做“继承”。
		继承使用extends关键字完成。
		实现使用implements关键字完成。

		2、五颗星（*****）：当一个非抽象的类实现接口的话，必须将接口中所有的
		抽象方法全部实现（覆盖、重写）。
*/
public class InterfaceTest2{
    public static void main(String[] args){
        //错误: MyMath2是抽象的; 无法实例化
        //new MyMath2();

        // 能使用多态吗？可以。
        //Animal a = new Cat();

        // 父类型的引用指向子类型的对象(接口使用多态)
        MyMath2 mm = new MyMathImpl();
        // 调用接口里面的方法（面向接口编程。）
        int result1 = mm.sum(10, 20);  // 编译的时候是接口MyMath2中的sum，运行的时候是类MyMathImpl中的sum。
        System.out.println(result1);

        int result2 = mm.sub(20, 10);
        System.out.println(result2);
    }
}


// 特殊的抽象类，完全抽象的，叫做接口。
interface MyMath2{
    double PI = 3.1415926;
    int sum(int a, int b);
    int sub(int a, int b);
}


// 这样没问题
/*
abstract class MyMathImpl implements MyMath2 {
}
*/

// 编写一个类（这个类是一个“非抽象”的类）
// 这个类的名字是随意的。
//错误: MyMathImpl不是抽象的, 并且未覆盖MyMath2中的抽象方法sub(int,int)
/*
class MyMathImpl implements MyMath2 {
}
*/


//修正
class MyMathImpl implements MyMath2 {

    //错误：正在尝试分配更低的访问权限; 以前为public。访问权限可以更高，不能更低。
	/*
	int sum(int a, int b){
		return a + b;
	}
	*/

    // 重写/覆盖/实现 接口中的方法（通常叫做实现。）
    public int sum(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }
}