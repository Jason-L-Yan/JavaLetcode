package Chapter19.com.huawei.javaSE.array;

/*
Array
    1��Java�����е�������һ�������������͡������ڻ����������͡�����ĸ�����Object��
    2������ʵ������һ������������ͬʱ���ɶ��Ԫ�ء���������һ�����ݵļ��ϡ���
    ���飺������˼�ǡ�һ�����ݡ�
    3�����鵱�п��Դ洢�������������͡������ݣ�Ҳ���Դ洢�������������͡������ݡ�
    4��������Ϊ���������ͣ�������������Ƕ��ڴ浱�С��������Ǵ洢�ڶѵ��еģ�
    5�����鵱������洢���ǡ�java���󡱵Ļ���ʵ���ϴ洢���Ƕ���ġ����ã��ڴ��ַ�����������в���ֱ�Ӵ洢java����
    6������һ����������java�й涨�����Ȳ��ɱ䡣�����鳤�Ȳ��ɱ䣩
    7������ķ��ࣺһά���顢��ά���顢��ά���顢��ά����...��һά����϶࣬��ά����ż��ʹ�ã���
    8�����е����������length����(java�Դ���)��������ȡ������Ԫ�صĸ�����
    9��java�е�����Ҫ��������Ԫ�ص�����ͳһ������int��������ֻ�ܴ洢int���ͣ�Person��������ֻ�ܴ洢Person���͡�
    ���磺���й���������ֻ��װƻ��������ͬʱװƻ�������ӡ��������д洢��Ԫ������ͳһ��
    10���������ڴ淽��洢��ʱ�������е�Ԫ���ڴ��ַ(�洢��ÿһ��Ԫ�ض����й���İ������е�)�������ġ��ڴ��ַ������
    ��������洢Ԫ�ص��ص㣨��ɫ��������ʵ������һ�ּ򵥵����ݽṹ��
    11�����е����鶼���á���һ��С������ڴ��ַ����Ϊ�������������ڴ��ַ��
    ����������Ԫ�ص��ڴ��ַ��Ϊ�������������ڴ��ַ����
    12��������ÿһ��Ԫ�ض������±�ģ��±��0��ʼ����1���������һ��Ԫ�ص��±��ǣ�length - 1
    �±�ǳ���Ҫ����Ϊ���Ƕ�������Ԫ�ؽ��С���ȡ����ʱ�򣬶���Ҫͨ���±������С�
    13�������������ݽṹ���ŵ��ȱ����ʲô��
        �ŵ㣺��ѯ/����/����ĳ���±��ϵ�Ԫ��ʱЧ�ʼ��ߡ�����˵�ǲ�ѯЧ����ߵ�һ�����ݽṹ��
            Ϊʲô����Ч�ʸߣ�
                ��һ��ÿһ��Ԫ�ص��ڴ��ַ�ڿռ�洢���������ġ�
                �ڶ���ÿһ��Ԫ��������ͬ������ռ�ÿռ��Сһ����
                ������֪����һ��Ԫ���ڴ��ַ��֪��ÿһ��Ԫ��ռ�ÿռ�Ĵ�С����֪���±꣬����
                ͨ��һ����ѧ����ʽ�Ϳ��Լ����ĳ���±���Ԫ�ص��ڴ��ַ��ֱ��ͨ���ڴ��ַ��λ
                Ԫ�أ���������ļ���Ч������ߵġ�

                �����д洢100��Ԫ�أ����ߴ洢100���Ԫ�أ���Ԫ�ز�ѯ/�������棬Ч������ͬ�ģ�
                ��Ϊ������Ԫ�ز��ҵ�ʱ�򲻻�һ��һ���ң���ͨ����ѧ����ʽ��������ġ������һ��
                �ڴ��ַ��ֱ�Ӷ�λ�ġ���
        ȱ�㣺
            ��һ������Ϊ�˱�֤������ÿ��Ԫ�ص��ڴ��ַ���������������������ɾ����������Ԫ�ص�ʱ��
        Ч�ʽϵͣ���Ϊ�����ɾԪ�ػ��漰������Ԫ��ͳһ��ǰ�������λ�ƵĲ�����
            �ڶ������鲻�ܴ洢����������Ϊʲô��
                ��Ϊ�������ڴ�ռ����ҵ�һ���ر����������ڴ�ռ䡣

        ע�⣺�������������һ��Ԫ�ص���ɾ����û��Ч��Ӱ��ġ�
    14����ô����/����һ��һά���飿
        �﷨��ʽ��
            int[] array1;
            double[] array2;
            boolean[] array3;
            String[] array4;
            Object[] array5;
    15����ô��ʼ��һ��һά�����أ�
        �������ַ�ʽ����̬��ʼ��һά���飬��̬��ʼ��һά���顣
        ��̬��ʼ���﷨��ʽ��
            int[] array = {100, 2100, 300, 55};
        ��̬��ʼ���﷨��ʽ��
            int[] array = new int[5]; // �����5��ʾ�����Ԫ�ظ�����
                                        // ��ʼ��һ��5�����ȵ�int�������飬ÿ��Ԫ��Ĭ��ֵ0
            String[] names = new String[6]; // ��ʼ��6�����ȵ�String�������飬ÿ��Ԫ��Ĭ��ֵnull��

 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] a1 = { 1, 100, 10, 20, 55, 689 };
        int[] a2 = new int[6];
        String[] a3 = new String[6];
        System.out.println("a1������Ԫ�ظ�����" + a1.length);
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + "\t");
        }

        System.out.println();
        System.out.println("a2������Ԫ�ظ�����" + a2.length);
        a2[a2.length - 1] = 888;
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + "\t");
        }
        
        System.out.println();
        System.out.println("a3������Ԫ�ظ�����" + a3.length);
        for (int i = 0; i < a3.length; i++) {
            System.out.print(a3[i] + "\t");
        }
        System.out.println();
    }

}