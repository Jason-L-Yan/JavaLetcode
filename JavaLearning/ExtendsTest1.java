public class ExtendsTest1 {
    // 分析这个代码可以执行吗？
    // ExtendsTest1默认继承object祖类，祖类中有一个实例方法（引用.），可以直接调用
    
    // 这是默认从祖类中继承的 toString() 方法。
    /*public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }*/

    public static void main(String[] args){
        ExtendsTest1 et = new ExtendsTest1();
        // 先 new 一个对象，再调用 toString() 方法。
        String retValue = et.toString();
        // 279f2327 可以“等同”看做对象在堆内存当中的内存地址。
        // 实际上是内存地址经过“哈希算法”得出的十六进制结果。
        System.out.println(retValue);  // ExtendsTest1@279f2327

        Product pro = new Product();
        System.out.println(pro.toString());  // Product@54bedef2
        // 当输出引用时，引用会自动调用 ".toString()" 方法。
        System.out.println(pro);
    }
    
}


class Product{

}
