/*
java.lang.StringBuilder����ʼ������Ҳ��16
StringBuffer��StringBuilder������
    StringBuffer�еķ������У�synchronized�ؼ������Ρ���ʾStringBuffer�ڶ��̻߳����������ǰ�ȫ�ġ�
    StringBuilder�еķ�����û�У�synchronized�ؼ������Σ���ʾStringBuilder�ڶ��̻߳����������ǲ���ȫ�ġ�

    StringBuffer���̰߳�ȫ�ġ�
    StringBuilder�Ƿ��̰߳�ȫ�ġ�
    
 */

package Chapter20.com.huawei.javaSE.stringbuffer;

public class StringBuilderTest1 {
    public static void main(String[] args) {

        // ʹ��StringBuilderҲ�ǿ�������ַ�����ƴ�ӡ�
        StringBuilder sb = new StringBuilder();
        sb.append(100); 
        sb.append(true);
        sb.append("hello");
        sb.append("kitty");
        System.out.println(sb);
    }
}
