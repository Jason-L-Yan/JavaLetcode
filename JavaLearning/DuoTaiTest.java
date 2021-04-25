/**
 * 多态的基础语法
 * 1. 学习多态基础语法之前，我们需要普及两个概念
 *      - 第一个：向上转型
 *          子-----> 父
 *      - 第二个：向下转型
 *          父-----> 子
 * 注意：java中允许向上转型，也不许向下转型。无论是向上转型，还是向下转型，两种类型之间必须有继承关系，
 * 没有继承关系，编译器会报错。
 */


public class DuoTaiTest {
    
    public static void main(String[] args){
        Animals a1 = new Animals();
        a1.move();

        Cats c1 = new Cats();
        c1.move();

        Birdss b1 = new Birdss();
        b1.move();

        // 代码可以这样写吗？
        /**
         * 1. Animal和Cat之间有继承关系吗？有的。
         * 2. Animal是父类，Cat是子类。
         * 3. Cat is Animal，这句话能不能说通？能。
         * 4. 经测试java支持这样一个用法：
         * 父类型的引用允许指向子类型的对象。
         * Animals a2 = new Cats();
         * a2是父类型的引用。new Cats()是一个子类型的对象。
         * 允许a2这个父类型引用指向子类型的对象。
         */
        System.out.println("****************************************");
        /**
         * 什么是多态？
         * 多种形态，多种状态。
         * 分析 a2.move():
         * java程序分为编译阶段和运行阶段。
         * 先来分析编译阶段：对于编译器来说，编译器只知道a2的类型是Animals，
         * 所以编译器在检查语法的时候，会去Animals.class字节码中找move()方法，
         * 找到之后，绑定上move()方法,编译通过，静态绑定成功。（编译阶段属于静态绑定）
         * 再来分析运行阶段：运行阶段的时候，实际上在堆内存中创建java对象是Cat对象，所以move的时候，
         * 真正参与move()的对象是一只猫，所以运行阶段会动态执行Cat对象的move()方法。这个过程属于运行
         * 阶段绑定。（运行阶段绑定属于动态绑定。）
         * 多态表示多种形态：
         * 编译时一种形态
         * 运行时另一种形态
         * 
         */
        // 向上转型
        Animals a2 = new Cats();
        a2.move();
        
        Animals a3 = new Birdss();
        a3.move();
        
        // ==========================================================
        Animals a5 = new Cats();  // 底层对象是一只猫。
        // a5.catchMouse();  // catchMouse()是Cats.class独有的方法。
        // 分析能否编译通过和运行？
        // 分析程序一定要分析编译阶段的静态绑定和运行阶段的动态绑定。
        // 错误：找不到符号
        // 因为编译器只知道a5的类型是Animals，去Animals.class文件中找不到catchMouse()方法。
        // 所以静态绑定失败，编译报错。
        
        // ==========================================================
        // 假设代码写到这里，我非要调用 catchMouse() 方法怎么办
        // 这个时候就必须使用“向下转型”了。（强制类型转换）
        // 当你需要访问的类型是子类中“特有”的方法，必须使用强制类型转换。
        
        System.out.println("****************************************");
        Cats x = (Cats)a5;
        x.catchMouse();

        // 像下转型有风险吗?
        Animals a6 = new Birdss();
        /**
         * 分析以下程序，编译报错还是运行报错。
         * 编译器检测到a6这个引用是Animal类型，
         * 而Animals和Cats之间存在继承关系，所以可以向下转型。编译没毛病。
         * 在运行阶段时，会报错,因为Birdss与Cats之间没有继承关系。
         * */
        // Cats y = (Cats)a6;
        // y.catchMouse();

        // 怎么避免ClassCastException异常的发生？？？
		/*	
			新的内容，运算符：
				instanceof （运行阶段动态判断）
			第一：instanceof可以在运行阶段动态判断引用指向的对象的类型。
			第二：instanceof的语法：
				(引用 instanceof 类型)
			第三：instanceof运算符的运算结果只能是：true/false
			第四：c是一个引用，c变量保存了内存地址指向了堆中的对象。
				假设(c instanceof Cat)为true表示:
					c引用指向的堆内存中的java对象是一个Cat。
				假设(c instanceof Cat)为false表示:
					c引用指向的堆内存中的java对象不是一个Cat。
			
			程序员要养成一个好习惯：
				任何时候，任何地点，对类型进行向下转型时，一定要使用
				instanceof 运算符进行判断。（java规范中要求的。）
				这样可以很好的避免：ClassCastException
		*/
        System.out.println("****************************************");
        System.out.println(a6 instanceof Cats);
        if(a6 instanceof Cats){  // 如果 a6 是一个Cat，在进行强制类型转换
            Cats y = (Cats)a6;
            y.catchMouse();
        }
        
        
        
    }
}
