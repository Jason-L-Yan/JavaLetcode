/**
 * ˼����������ʵ�ʵĿ����У������Ҫ�����ַ�����Ƶ��ƴ�ӣ�����ʲô���⣿
 *      ��Ϊjava�е��ַ����ǲ��ɱ�ģ�ÿһ��ƴ�Ӷ���������ַ�����
 *      ������ռ�ô����ķ������ڴ档����ڴ�ռ���˷ѡ�
 *          String s = "abc";
 *          s += "hello";
 *          ���������д��룬�͵����ڷ������ַ��������ص��д�����3������
 *              "abc"
 *              "hello"
 *              "abchello"
 * 
 * 
 *
 * ����Ժ���Ҫ���д����ַ�����ƴ�Ӳ���������ʹ��JDK���Դ��ģ�
 *      java.lang.StringBuffer
 *      java.lang.StringBuilder
 *
 * ����Ż�StringBuffer�����ܣ�
 *      �ڴ���StringBuffer��ʱ�򾡿��ܸ���һ����ʼ��������
 *      ��ü��ٵײ���������ݴ�����Ԥ����һ�£���һ����һЩ��ʼ��������
 *      �ؼ��㣺��һ�����ʵĳ�ʼ��������������߳����ִ��Ч�ʡ�
 */
package Chapter20.com.huawei.javaSE.stringbuffer;

public class StringBuffer1 {
    public static void main(String[] args) {
        // ����һ����ʼ������Ϊ16��byte[] ���顣���ַ�������������
        // ƴ���ַ������Ժ�ƴ���ַ���ͳһ���� append()������
        // append��׷�ӵ���˼��
        StringBuffer buffer = new StringBuffer();
        // append�����ײ��ڽ���׷�ӵ�ʱ�����byte�������ˣ����Զ����ݡ�
        System.out.println(buffer.append(100L));
        System.out.println(buffer.append(1003333333));
        System.out.println(buffer.append(66.3));
        System.out.println(buffer.append(true));
        System.out.println(buffer.append("���"));

        // ָ����ʼ��������StringBuffer�����ַ�������������
        StringBuffer sb = new StringBuffer(100);  // ָ��������СΪ100
        sb.append("hello");
        sb.append("world");
        sb.append("hello");
        sb.append("kitty");

        System.out.println(sb);
        
    }
}
