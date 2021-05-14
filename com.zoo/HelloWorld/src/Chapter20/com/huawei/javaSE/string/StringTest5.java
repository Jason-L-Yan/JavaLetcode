package Chapter20.com.huawei.javaSE.string;

public class StringTest5 {
    public static void main(String[] args) {
        // 1 字符串"中国人"是一个String对象，可以调用对象中的实例方法。
        System.out.println("====***1***====");
        char c = "中国人".charAt(1);
        System.out.println(c);
        
        System.out.println("====***2***====");
        // 2 按字典顺序比较两个字符串 int java.lang.String.compareTo(String anotherString),返回int
        // 等于0，字符串相等
        // 小于0，前小后大
        // 大于0，前大后小
        // 先比较字符串第一个字母，分出结果就不在比较。否则比较第二个字母。
        int result = "abd".compareTo("abb");
        System.out.println(result);
        
        System.out.println("====***3***====");
        // 3（掌握）.boolean contains(CharSequence s)
        // 判断前面的字符串中是否包含后面的子字符串。
        System.out.println("HuaWei.java".contains(".java"));  // true
        System.out.println("HuaWei.java".contains(".javax"));  // false
        
        System.out.println("====***4***====");
        // 4（掌握）. boolean endsWith(String suffix)
        // 判断当前字符串是否以某个子字符串结尾。
        System.out.println("test.txt".endsWith(".txt"));  // true
        System.out.println("test.txt".endsWith("xt"));  // true
        System.out.println("testtxt".endsWith(".java"));  // false
        
        System.out.println("====***5***====");
        // 5（掌握）.boolean equals(Object anObject)
        // 比较两个字符串必须使用equals方法，不能使用“==”
        // equals方法有没有调用compareTo方法？ 老版本可以看一下。JDK13中并没有调用compareTo()方法。
        // equals只能看出相等不相等。
        // compareTo方法可以看出是否相等，并且同时还可以看出谁大谁小。
        System.out.println("abc".equals("abc")); // true
        
        System.out.println("====***6***====");
        // 6（掌握）boolean equalsIgnoreCase(String anotherString)
        // 判断两个字符串是否相等，并且同时忽略大小写。
        System.out.println("aFcdR".equals("afcdr"));
        System.out.println("aFcdR".equalsIgnoreCase("afCDr"));
        
        System.out.println("====***7***====");
        // 7（掌握）byte[] getBytes()
        // 将字符串对象转换成字节数组
        byte[] by = "lahagie".getBytes();
        for (int i = 0; i < by.length; i++) {
            System.out.print(by[i] + " ");
        }
        System.out.println();
        
        System.out.println("====***8***====");
        // 8（掌握）int indexOf(String str)
        // 判断某个子字符串在当前字符串中第一次出现处的索引（下标）。
        System.out.println("hijjkhjjh".indexOf("jjh"));

        System.out.println("====***9***====");    
        // 9（掌握）boolean isEmpty()
        // 判断某个字符串是否为“空字符串”。底层源代码调用的应该是字符串的length()方法。
        //String s = "";
        String s = "a";
        System.out.println(s.isEmpty());

        System.out.println("====***10***====");
        // 10（掌握）. int length()
        // 面试题：判断数组长度和判断字符串长度不一样
        // 判断数组长度是length属性，判断字符串长度是length()方法。
        System.out.println("abc".length()); // 3
        System.out.println("".length()); // 0
        
        System.out.println("====***11***====");
        // 11（掌握）int lastIndexOf(String str)
        // 判断某个子字符串在当前字符串中最后一次出现的索引（下标）
        System.out.println("hijjkhjjh".lastIndexOf("jj"));
        System.out.println("oraclejavac++javac#phpjavapython".lastIndexOf("java")); //22
        
        System.out.println("====***12***====");
        
        // 12（掌握）int length()返回此字符串的长度。
        System.out.println("hijjkhjjh".length());
        System.out.println("oraclejavac++javac#phpjavapython".length());
        
        System.out.println("====***13***====");
        // 13（掌握）String replace(CharSequence target, CharSequence replacement)
        // 替换。
        // String的父接口就是：CharSequence
        String newString = "http://www.baidu.com".replace("http://", "https:&&");
        System.out.println(newString);  //https://www.baidu.com
        // 把以下字符串中的“=”替换成“:”
        String newString2 = "name=zhangsan&password=123&age=20".replace("=", ":");
        System.out.println(newString2); //name:zhangsan&password:123&age:20
        
        System.out.println("====***14***====");
        // 14（掌握）String[] split(String regex)
        // 拆分字符串
        String[] ymd = "1980-10-11".split("-");  //"1980-10-11"以"-"分隔符进行拆分。
        for(int i = 0; i < ymd.length; i++){
            System.out.println(ymd[i]);
        }
        String param = "name=zhangsan&password=123&age=20";
        String[] params = param.split("&");
        for(int i = 0; i <params.length; i++){
            System.out.println(params[i]);
            // 可以继续向下拆分，可以通过“=”拆分。
        }
        
        System.out.println("====***15 ***====");
        // 15（掌握）String substring(int beginIndex) 参数是起始下标。
        // 截取字符串
        System.out.println("http://www.baidu.com".substring(7)); //www.baidu.com
        
        System.out.println("====***16***====");
         // 16（掌握）、String substring(int beginIndex, int endIndex)
        // beginIndex起始位置（包括）
        // endIndex结束位置（不包括最后一个索引的字符）
        System.out.println("http://www.baidu.com".substring(7, 10)); //www
        
        System.out.println("====***17***====");
        // 17（掌握）boolean startsWith(String prefix)
        // 判断某个字符串是否以某个子字符串开始。
        System.out.println("http://www.baidu.com".startsWith("http")); // true
        System.out.println("http://www.baidu.com".startsWith("https")); // false
        
        System.out.println("====***18***====");
        // 18(掌握)char[] toCharArray()
        // 将字符串转换成char数组
        char[] chars = "我是中国人".toCharArray();
        for(int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }
        
        System.out.println("====***19***====");
        // 19（掌握）String toLowerCase()
        // 转换为小写。
        System.out.println("ABCDefKXyz".toLowerCase());
        
        System.out.println("====***20***====");
        // 20（掌握）String toUpperCase();
        System.out.println("ABCDefKXyz".toUpperCase());
        
        System.out.println("====***21***====");
        // 21（掌握）. String trim();
        // 去除字符串前后空白
        System.out.println("           hello      world             ".trim());
        
        System.out.println("====***22***====");
        // 21（掌握）. String中只有一个方法是静态的，不需要new对象
        // 这个方法叫做valueOf
        // 作用：将“非字符串”转换成“字符串”
        // valueOf 中 O 是大写字母。
        String s1 = String.valueOf(true);
        String s2 = String.valueOf(100);
        String s3 = String.valueOf(3.14);
        // 以下可以调用length()方法，说明已经被成功转换成字符串了。
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());
        // 这个静态的valueOf()方法，参数是一个对象的时候，会自动调用该对象的toString()方法吗？
        String s4 = String.valueOf(new Customer());
        // System.out.println(s4); // 没有重写toString()方法之前是对象内存地址 com.bjpowernode.javase.string.Customer@10f87f48
        System.out.println(s4); //我是一个VIP客户！！！！


        // 输出到控制台上的东西都是字符串。
        Object obj = new Object();
        // 通过源代码可以看出：为什么输出一个引用的时候，会调用toString()方法!!!!
        //　本质上System.out.println()这个方法在输出任何数据的时候都是先转换成字符串，再输出。
        System.out.println(obj);

        System.out.println(new Customer());
        
    }
 
}

class Customer {
    // 重写toString()方法
    @Override
    public String toString() {
        return "我是一个VIP客户！！！！";
    }
}
