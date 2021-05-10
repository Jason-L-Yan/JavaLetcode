package Chapter18;

/*
	����Object���е�equals����
		1��equals������Դ����
			public boolean equals(Object obj) {
				return (this == obj);
			}
			�������������Object���Ĭ��ʵ�֡�
				
		
		2��SUN��˾���equals������Ŀ����ʲô��
			�Ժ��̵Ĺ��̵��У���Ҫͨ��equals�������ж����������Ƿ���ȡ�
			equals�������ж����������Ƿ���ȵġ�
		
		3��������Ҫ�о�һ��Object��������Ĭ�ϵ�equals�����������ã�������
				��Object���е�equals�������У�Ĭ�ϲ��õ��ǡ�==���ж�����java����
				�Ƿ���ȡ�����==���жϵ�������java������ڴ��ַ������Ӧ���ж�
				����java����������Ƿ���ȡ����������ڵ�equals���������ã�
				��Ҫ������дequals��
		
		4���ж�����java�����Ƿ���ȣ�����ʹ�á�==������Ϊ��==���Ƚϵ�������
		������ڴ��ַ��
*/
public class TestObject2 {
    public static void main(String[] args) {
        // �������Ŀ��������ӿ���̨���������
        System.setProperty("file.encoding", "GBK");
        // �ж����������������͵������Ƿ����ֱ��ʹ�á�==�����С�
        int a = 100;
        int b = 100;
        // �����==�����ж�a�б����100��b�б����100�Ƿ���ȡ�
        System.out.println(a == b);

        // �ж�����java�����Ƿ���ȣ�������ô�죿��ֱ��ʹ�á�==����
        // ����һ�����ڶ����ǣ�2008��8��8�ա�
        MyTime2 t1 = new MyTime2(2008, 8, 8);
        // System.out.println("t1���ڴ��ַ" + t1);
        // ������һ���µ����ڶ��󣬵���ʾ������Ҳ�ǣ�2008��8��8�ա�
        MyTime2 t2 = new MyTime2(2008, 8, 8);
        // System.out.println("t2���ڴ��ַ" + t2);

        MyTime2 t3 = new MyTime2(2008, 8, 9);
        // System.out.println("t3���ڴ��ַ" + t3);
        // �������£��Ƚ����������Ƿ���ȣ��ܲ���ʹ�á�==��������
        // ����ġ�==���жϵ��ǣ�t1�б���Ķ����ڴ��ַ��t2�б���Ķ����ڴ��ַ�Ƿ���ȡ�
        System.out.println(t1 == t2); // false
        // ��д֮ǰ���Ǻ��Ϸ��Ĺ���һ�����жϵ�ַ�Ƿ���ͬ,�������仰��Ϊfalse����д֮��flag = true��
        boolean flag = t1.equals(t2);
        System.out.println("flag:" + flag);
        System.out.println(t1.equals(t3));

        MyTime2 t4 = null; // ����bug
        System.out.println(t1.equals(t4));
    }

}

class MyTime2 {
    int year;
    int month;
    int day;

    public MyTime2() {
    }

    public MyTime2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyTime [day=" + day + ", month=" + month + ", year=" + year + "]";
    }

    // @Override
    // public boolean equals(Object obj) {
    // //������ͬ������ͬ��������Ҳ��ͬ��ʱ�򣬱�ʾ����������ͬ������������ȡ�
    // // ��ȡ��һ�����ڵ�������
    // int year1 = this.year;
    // int month1 = this.month;
    // int day1 = this.day;

    // // ��ȡ�ڶ������ڵ������գ�����д���ԣ���Ϊ����ʱobj��Object�࣬û��year��month��day������
    // // �����������еķ�����������ת�͡�
    // // int year2 = obj.year;
    // // int month2 = obj.month;
    // // int day2 = obj.day;

    // if (obj instanceof MyTime2) {
    // System.out.println("����");
    // MyTime2 t = (MyTime2)obj;
    // int year2 = t.year;
    // int month2 = t.month;
    // int day2 = t.day;
    // if (year1 ==year2 && month1 == month2 && day1 == day2) {
    // return true;
    // }
    // }
    // return false;
    // }

    // ����equals����
    // @Override
    // public boolean equals(Object obj) {
    // // ���obj�ǿգ�ֱ�ӷ���false
    // if (obj == null) {
    // return false;
    // }
    // // ���obj����һ��MyTime��û��Ҫ�Ƚ��� ��ֱ�ӷ���false
    // if (!(obj instanceof MyTime2)) {
    // return false;
    // }
    // // ���this��obj������ڴ��ַ��ͬ��û��Ҫ�Ƚ��ˣ�ֱ�ӷ���true��
    // // �ڴ��ַ��ͬ��ʱ��ָ��Ķ��ڴ�Ķ���϶���ͬһ����
    // if (obj == this) {
    // return true;
    // }
    // // �����ܹ�ִ�е��˴�˵��ʲô��
    // // ˵��obj����null��obj��MyTime���͡�
    // MyTime2 t = (MyTime2) obj;
    // if (this.year == t.year && this.month == t.month && this.day == t.day){
    // return true;
    // }
    // return false;

    // }

    // �ٴθ�����
    @Override
    public boolean equals(Object obj) {
        
        if (obj == null || !(obj instanceof MyTime2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        // �����ܹ�ִ�е��˴�˵��ʲô��
        // ˵��obj����null��obj��MyTime���͡�
        MyTime2 t = (MyTime2) obj;
        return this.year == t.year && this.month == t.month && this.day == t.day;
    }

}
