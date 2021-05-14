
package Chapter20.com.huawei.javaSE.string;

public class StringTest2 {

    private int i;
    public StringTest2() {
        this.i = 100;
    }


    
    public int getI() {
        return i;
    }


    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args) {

        String s1 = "hello";
        // "hello"�Ǵ洢�ڷ��������ַ��������ص���
        // �������"hello"�����½�������Ϊ��������Ѿ������ˣ���
        String s2 = "hello";
        // ���������true����false��
        // == ˫�ȺűȽϵ��ǲ��Ǳ����б�����ڴ��ַ���ǵġ�
        // System.out.println(s1.toString()); // true
        System.out.println(s1 == s2); // true

        String x = new String("xyz");
        String y = new String("xyz");
        // ���������true����false��
        // == ˫�ȺűȽϵ��ǲ��Ǳ����б�����ڴ��ַ���ǵġ�
        System.out.println(x == y); //false

        // ͨ�����������ѧϰ������֪���ˣ��ַ�������֮��ıȽϲ���ʹ�á�==��
        // "=="�����ա�Ӧ�õ���String���equals������
        // String���Ѿ���д��equals���������µ�equals�������õ���String��д֮���equals������
        System.out.println(x.equals(y)); // true

        String k = new String("testString");
        //String k = null;
        // "testString"����ַ������Ժ����"."�أ�
        // ��Ϊ"testString"��һ��String�ַ�������ֻҪ�Ƕ����ܵ��÷�����
        System.out.println("testString".equals(k)); // ����ʹ�����ַ�ʽ����Ϊ������Ա����ָ���쳣��
        System.out.println(k.equals("testString")); // ���ڿ�ָ���쳣�ķ��ա�����������д��

        /* ===============================================================================*/
        System.out.println("/* ============================================================*/");  
        StringTest2 a = new StringTest2();
        System.out.println(a.to2String());
        System.out.println(a.getI());
    }

    /* ===============================================================================*/
    // �� String ��������дtoString()����ʱ
    public StringTest2 to2String() {
        return this;
    } 
    // �������Ϳ���Ϊthis������Ϊ

}
