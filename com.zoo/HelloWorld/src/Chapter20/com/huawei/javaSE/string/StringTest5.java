package Chapter20.com.huawei.javaSE.string;

public class StringTest5 {
    public static void main(String[] args) {
        // 1 �ַ���"�й���"��һ��String���󣬿��Ե��ö����е�ʵ��������
        System.out.println("====***1***====");
        char c = "�й���".charAt(1);
        System.out.println(c);
        
        System.out.println("====***2***====");
        // 2 ���ֵ�˳��Ƚ������ַ��� int java.lang.String.compareTo(String anotherString),����int
        // ����0���ַ������
        // С��0��ǰС���
        // ����0��ǰ���С
        // �ȱȽ��ַ�����һ����ĸ���ֳ�����Ͳ��ڱȽϡ�����Ƚϵڶ�����ĸ��
        int result = "abd".compareTo("abb");
        System.out.println(result);
        
        System.out.println("====***3***====");
        // 3�����գ�.boolean contains(CharSequence s)
        // �ж�ǰ����ַ������Ƿ������������ַ�����
        System.out.println("HuaWei.java".contains(".java"));  // true
        System.out.println("HuaWei.java".contains(".javax"));  // false
        
        System.out.println("====***4***====");
        // 4�����գ�. boolean endsWith(String suffix)
        // �жϵ�ǰ�ַ����Ƿ���ĳ�����ַ�����β��
        System.out.println("test.txt".endsWith(".txt"));  // true
        System.out.println("test.txt".endsWith("xt"));  // true
        System.out.println("testtxt".endsWith(".java"));  // false
        
        System.out.println("====***5***====");
        // 5�����գ�.boolean equals(Object anObject)
        // �Ƚ������ַ�������ʹ��equals����������ʹ�á�==��
        // equals������û�е���compareTo������ �ϰ汾���Կ�һ�¡�JDK13�в�û�е���compareTo()������
        // equalsֻ�ܿ�����Ȳ���ȡ�
        // compareTo�������Կ����Ƿ���ȣ�����ͬʱ�����Կ���˭��˭С��
        System.out.println("abc".equals("abc")); // true
        
        System.out.println("====***6***====");
        // 6�����գ�boolean equalsIgnoreCase(String anotherString)
        // �ж������ַ����Ƿ���ȣ�����ͬʱ���Դ�Сд��
        System.out.println("aFcdR".equals("afcdr"));
        System.out.println("aFcdR".equalsIgnoreCase("afCDr"));
        
        System.out.println("====***7***====");
        // 7�����գ�byte[] getBytes()
        // ���ַ�������ת�����ֽ�����
        byte[] by = "lahagie".getBytes();
        for (int i = 0; i < by.length; i++) {
            System.out.print(by[i] + " ");
        }
        System.out.println();
        
        System.out.println("====***8***====");
        // 8�����գ�int indexOf(String str)
        // �ж�ĳ�����ַ����ڵ�ǰ�ַ����е�һ�γ��ִ����������±꣩��
        System.out.println("hijjkhjjh".indexOf("jjh"));

        System.out.println("====***9***====");    
        // 9�����գ�boolean isEmpty()
        // �ж�ĳ���ַ����Ƿ�Ϊ�����ַ��������ײ�Դ������õ�Ӧ�����ַ�����length()������
        //String s = "";
        String s = "a";
        System.out.println(s.isEmpty());

        System.out.println("====***10***====");
        // 10�����գ�. int length()
        // �����⣺�ж����鳤�Ⱥ��ж��ַ������Ȳ�һ��
        // �ж����鳤����length���ԣ��ж��ַ���������length()������
        System.out.println("abc".length()); // 3
        System.out.println("".length()); // 0
        
        System.out.println("====***11***====");
        // 11�����գ�int lastIndexOf(String str)
        // �ж�ĳ�����ַ����ڵ�ǰ�ַ��������һ�γ��ֵ��������±꣩
        System.out.println("hijjkhjjh".lastIndexOf("jj"));
        System.out.println("oraclejavac++javac#phpjavapython".lastIndexOf("java")); //22
        
        System.out.println("====***12***====");
        
        // 12�����գ�int length()���ش��ַ����ĳ��ȡ�
        System.out.println("hijjkhjjh".length());
        System.out.println("oraclejavac++javac#phpjavapython".length());
        
        System.out.println("====***13***====");
        // 13�����գ�String replace(CharSequence target, CharSequence replacement)
        // �滻��
        // String�ĸ��ӿھ��ǣ�CharSequence
        String newString = "http://www.baidu.com".replace("http://", "https:&&");
        System.out.println(newString);  //https://www.baidu.com
        // �������ַ����еġ�=���滻�ɡ�:��
        String newString2 = "name=zhangsan&password=123&age=20".replace("=", ":");
        System.out.println(newString2); //name:zhangsan&password:123&age:20
        
        System.out.println("====***14***====");
        // 14�����գ�String[] split(String regex)
        // ����ַ���
        String[] ymd = "1980-10-11".split("-");  //"1980-10-11"��"-"�ָ������в�֡�
        for(int i = 0; i < ymd.length; i++){
            System.out.println(ymd[i]);
        }
        String param = "name=zhangsan&password=123&age=20";
        String[] params = param.split("&");
        for(int i = 0; i <params.length; i++){
            System.out.println(params[i]);
            // ���Լ������²�֣�����ͨ����=����֡�
        }
        
        System.out.println("====***15 ***====");
        // 15�����գ�String substring(int beginIndex) ��������ʼ�±ꡣ
        // ��ȡ�ַ���
        System.out.println("http://www.baidu.com".substring(7)); //www.baidu.com
        
        System.out.println("====***16***====");
         // 16�����գ���String substring(int beginIndex, int endIndex)
        // beginIndex��ʼλ�ã�������
        // endIndex����λ�ã����������һ���������ַ���
        System.out.println("http://www.baidu.com".substring(7, 10)); //www
        
        System.out.println("====***17***====");
        // 17�����գ�boolean startsWith(String prefix)
        // �ж�ĳ���ַ����Ƿ���ĳ�����ַ�����ʼ��
        System.out.println("http://www.baidu.com".startsWith("http")); // true
        System.out.println("http://www.baidu.com".startsWith("https")); // false
        
        System.out.println("====***18***====");
        // 18(����)char[] toCharArray()
        // ���ַ���ת����char����
        char[] chars = "�����й���".toCharArray();
        for(int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }
        
        System.out.println("====***19***====");
        // 19�����գ�String toLowerCase()
        // ת��ΪСд��
        System.out.println("ABCDefKXyz".toLowerCase());
        
        System.out.println("====***20***====");
        // 20�����գ�String toUpperCase();
        System.out.println("ABCDefKXyz".toUpperCase());
        
        System.out.println("====***21***====");
        // 21�����գ�. String trim();
        // ȥ���ַ���ǰ��հ�
        System.out.println("           hello      world             ".trim());
        
        System.out.println("====***22***====");
        // 21�����գ�. String��ֻ��һ�������Ǿ�̬�ģ�����Ҫnew����
        // �����������valueOf
        // ���ã��������ַ�����ת���ɡ��ַ�����
        // valueOf �� O �Ǵ�д��ĸ��
        String s1 = String.valueOf(true);
        String s2 = String.valueOf(100);
        String s3 = String.valueOf(3.14);
        // ���¿��Ե���length()������˵���Ѿ����ɹ�ת�����ַ����ˡ�
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());
        // �����̬��valueOf()������������һ�������ʱ�򣬻��Զ����øö����toString()������
        String s4 = String.valueOf(new Customer());
        // System.out.println(s4); // û����дtoString()����֮ǰ�Ƕ����ڴ��ַ com.bjpowernode.javase.string.Customer@10f87f48
        System.out.println(s4); //����һ��VIP�ͻ���������


        // ���������̨�ϵĶ��������ַ�����
        Object obj = new Object();
        // ͨ��Դ������Կ�����Ϊʲô���һ�����õ�ʱ�򣬻����toString()����!!!!
        //��������System.out.println()�������������κ����ݵ�ʱ������ת�����ַ������������
        System.out.println(obj);

        System.out.println(new Customer());
        
    }
 
}

class Customer {
    // ��дtoString()����
    @Override
    public String toString() {
        return "����һ��VIP�ͻ���������";
    }
}
