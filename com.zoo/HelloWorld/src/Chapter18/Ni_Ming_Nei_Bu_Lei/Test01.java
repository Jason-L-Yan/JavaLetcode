/*
	�����ڲ��ࣺ

		1��ʲô���ڲ��ࣿ
			�ڲ��ࣺ������ڲ��ֶ�����һ���µ��ࡣ����Ϊ�ڲ��ࡣ

		2���ڲ���ķ��ࣺ
			��̬�ڲ��ࣺ�����ھ�̬����
			ʵ���ڲ��ࣺ������ʵ������
			�ֲ��ڲ��ࣺ�����ھֲ�����

		3��ʹ���ڲ����д�Ĵ��룬�ɶ��Ժܲ�ܲ��þ������á�

		4�������ڲ����Ǿֲ��ڲ����һ�֡�
			��Ϊ�����û�����ֶ����������������ڲ��ࡣ
		
		5��ѧϰ�����ڲ�����Ҫ���ô���Ժ����Ķ����˴����ʱ���ܹ���⡣
		���������Ժ�Ҫ����д����Ϊ�����ڲ���������ȱ�㣺
			ȱ��1��̫���ӣ�̫�ң��ɶ��Բ
			ȱ��2����û�����֣��Ժ����ظ�ʹ�ã������á�
		
		6����������ˣ���ֻҪ��ס����д�����С�
*/

package Chapter18.Ni_Ming_Nei_Bu_Lei; // �����ڲ��ࡣ

public class Test01 {
    // ����������ڲ������Գ�Ϊ�ڲ���
    // ����ǰ����static�����Գ�Ϊ����̬�ڲ��ࡱ
    static class Inner {

    }

    // ����������ڲ������Գ�Ϊ�ڲ���
    // û��static����ʵ���ڲ��ࡣ
    class Inner2 {

    }

    public void doSome() {
        // ����������ڲ������Գ�Ϊ�ڲ���
        // �ֲ��ڲ��ࡣ���˷����㲻��ʹ�á�
        class Inner3 {

        }
    }

    public void doOther() {
        new Test01().new Inner2(); // ���ַ������������á�
        // ������䱨����Ϊ Inner1() �Ǿ�̬��������������ʵ��������
        // new Test01().new Inner1();

    }

    public static void main(String[] args) {
        // ����MyMath�е�mySum����
        MyMath mm = new MyMath();
        // �ӿڲ���new������ʵ��������ˣ��������д�ӿڵ�ʵ���ࡣ
        // �ϲ�������д���룬��ʾ����������еġ������ǣ�ComputeImpl��
        // mm.mySum(new ComputerImpl(), 100, 200);

        /* �����ڲ��� */
        // ʹ�������ڲ��࣬��ʾ���ComputeImpl�����û�����ˡ�
        // ������濴��ȥ�����ǽӿڿ���ֱ��new�ˣ�ʵ���ϲ����ǽӿڿ���new�ˡ�
        // �����{} �����˶Խӿڵ�ʵ�֡�
        // ������ʹ�������ڲ��࣬Ϊʲô��
        // ��Ϊһ����û�����֣�û�а취�ظ�ʹ�á��������̫�ң��ɶ���̫�
        mm.mySum(new Computer() {
            public int sum(int a, int b) {
                return a + b;
            }
        }, 600, 200);

    }

}

interface Computer {
    // ���󷽷�
    int sum(int a, int b);
}

// �ӿڵ�ʵ���ࡣ
// class ComputerImpl implements Computer {

//     @Override
//     public int sum(int a, int b) {
//         return a + b;
//     }

// }

// ��ѧ��
class MyMath {
    // ��ѧ��ͷ���
    public void mySum(Computer c, int x, int y) {
        int retValue = c.sum(x, y);
        System.out.println(x + "+" + y + "=" + retValue);
    }
}
