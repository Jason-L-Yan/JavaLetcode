/**
 * 思考：我们在实际的开发中，如果需要进行字符串的频繁拼接，会有什么问题？
 *      因为java中的字符串是不可变的，每一次拼接都会产生新字符串。
 *      这样会占用大量的方法区内存。造成内存空间的浪费。
 *          String s = "abc";
 *          s += "hello";
 *          就以上两行代码，就导致在方法区字符串常量池当中创建了3个对象：
 *              "abc"
 *              "hello"
 *              "abchello"
 * 
 * 
 *
 * 如果以后需要进行大量字符串的拼接操作，建议使用JDK中自带的：
 *      java.lang.StringBuffer
 *      java.lang.StringBuilder
 *
 * 如何优化StringBuffer的性能？
 *      在创建StringBuffer的时候尽可能给定一个初始化容量。
 *      最好减少底层数组的扩容次数。预估计一下，给一个大一些初始化容量。
 *      关键点：给一个合适的初始化容量。可以提高程序的执行效率。
 */
package Chapter20.com.huawei.javaSE.stringbuffer;

public class StringBuffer1 {
    public static void main(String[] args) {
        // 创建一个初始化容量为16个byte[] 数组。（字符串缓冲区对象）
        // 拼接字符串，以后拼接字符串统一调用 append()方法。
        // append是追加的意思。
        StringBuffer buffer = new StringBuffer();
        // append方法底层在进行追加的时候，如果byte数组满了，会自动扩容。
        System.out.println(buffer.append(100L));
        System.out.println(buffer.append(1003333333));
        System.out.println(buffer.append(66.3));
        System.out.println(buffer.append(true));
        System.out.println(buffer.append("你好"));

        // 指定初始化容量的StringBuffer对象（字符串缓冲区对象）
        StringBuffer sb = new StringBuffer(100);  // 指定容量大小为100
        sb.append("hello");
        sb.append("world");
        sb.append("hello");
        sb.append("kitty");

        System.out.println(sb);
        
    }
}
