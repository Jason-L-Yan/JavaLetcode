// ����ö�ٵķ�ʽ�������
/*
�ܽ᣺
    1��ö����һ��������������
    2��ö��������ô���壬�﷨�ǣ�
        enum ö��������{
            ö��ֵ1,ö��ֵ2
        }
    3�����ֻ����������ģ�����ʹ�ò������͡�
    ����������ֲ��һ��ǿ���һöһö�оٳ����ģ�����ʹ��ö�����͡�
        ���磺��ɫ���ļ������ڵȶ�����ʹ��ö�����͡�
 */
package Chapter20.com.huawei.javaSE.enum2;

public class enumTest2 {
    public static void main(String[] args) {
        Result r = divide(10, 0);
        System.out.println(r == Result.SUCCESS ? "����ɹ�" : "����ʧ��");
    }

    /**
     * ��������int�������ݵ��̡�
     * @param a int����
     * @param b int����
     * @return Result.SUCCESS��ʾ�ɹ���Result.FAIL��ʾʧ�ܣ�
     */
    public static Result divide(int a, int b){
        try {
            int c = a / b;
            return Result.SUCCESS;
        } catch (Exception e){
            return Result.FAIL;
        }
    }
}


// ö�٣�һöһö�����оٳ����ģ��Ž���ʹ��ö�����͡�
// ö�ٱ���֮��Ҳ������class�ļ���
// ö��Ҳ��һ�������������͡�
// ö���е�ÿһ��ֵ���Կ����ǳ�����
enum Result {
    // SUCCESS ��ö��Result�����е�һ��ֵ
    // FAIL ��ö��Result�����е�һ��ֵ
    // ö���е�ÿһ��ֵ�����Կ����ǡ�������
    SUCCESS,FAIL
}