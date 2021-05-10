package Chapter18;

/*
	����Object���е�toString()����

		1��Դ���볤ʲô����
			public String toString() {
				return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
			}
			Դ������toString()������Ĭ��ʵ���ǣ�
				����@������ڴ��ַת��Ϊʮ�����Ƶ���ʽ

		2��SUN��˾���toString()������Ŀ����ʲô��
			toString()������������ʲô��
				toString()���������Ŀ���ǣ�ͨ����������������Խ�һ����java����ת���ɡ��ַ�����ʾ��ʽ��

		3����ʵSUN��˾����java���Ե�ʱ�򣬽������е����඼ȥ��дtoString()������
		toString()����Ӧ����һ�����ġ���ʵ�ġ����Ķ���.
*/
public class TestObject {
    public static void main(String[] args) {
        MyTime myTime = new MyTime();
        String s1 = myTime.toString();
        // MyTime����дtoString()����֮ǰ��
        System.out.println(s1);
    }

}

class MyTime {
    int year;
    int month;
    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // ��дtoString()������һ�㶼Ҫ��д��
    // ���toString()������ô��д�أ�
    // Խ���Խ�ã��ɶ���ԽǿԽ�á�
    // ����ġ���ʵ�ġ����Ķ��ķ���չ
    @Override
    public String toString() {
        return "MyTime [day=" + day + ", month=" + month + ", year=" + year + "]";
    }

}
