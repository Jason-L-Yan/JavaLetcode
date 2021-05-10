package Chapter18;

public class TestObject4 {
    public static void main(String[] args) {
        Student a1 = new Student(190131049, "�����ʵ��ѧ");
        Student a2 = new Student(190131049, "�����ѧ");
        Student a3 = new Student(190131049, "�����ʵ��ѧ");
        System.out.println(a1.equals(a2));
        System.out.println(a1 == a3);
        System.out.println(a1.equals(a3));
        System.out.println("--------------------------------------------");
        System.out.println("���".equals("���"));

        System.out.println("********************************************");
        Student a4 = new Student(190131049, new String("�����ʵ��ѧ"));
        // ��������˵��Ӧ����� true
        // ���ǵ� equals���ж����д�� return this.no == t.no && this.school == t.school;����false
        // ��ȷд��Ӧ���ǣ�return this.no == t.no && this.school.equals(t.school);
        // String��������п���ʹ��
        // String a = "nihao"; String b = "nihao";
        // ��ʱ�ж�a == b �Ƿ���true��
        // ������ʹ�� String a = new String("nihao"); String b = new String("nihao");
        // ��ʱ�ж�a == b ����������ĵ�ַ������false��
        // ��ʹ��String�е���д����equals����ʱ���������ֱ������巽ʽ���ȽϵĶ������ݡ�
        System.out.println(a1.equals(a4));

        
    }

}

class Student {
    int no;
    String school;

    public Student(int no, String school) {
        this.no = no;
        this.school = school;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "ѧ�ţ�" + no + ", ����ѧУ���ƣ�" + school;
    }

    // ���󣺵�һ��ѧ����ѧ����ȣ�����ѧУ��ͬʱ����ʾͬһ��ѧ����
	// ˼�������equals����ô��д�أ�
	// equals�����ı�дģʽ���ǹ̶��ġ����Ӳ�ࡣ
    @Override
    public boolean equals(Object obj) {
        
        if (obj == null || !(obj instanceof Student)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        // �����ܹ�ִ�е��˴�˵��ʲô��
        // ˵��obj����null��obj��MyTime���͡�
        Student t = (Student) obj;
        // return this.no == t.no && this.school == t.school;  // ����
        // this.school.equals(t.school)���ַ������ַ����Ƚϣ�������˫�Ⱥ�==��
        return this.no == t.no && this.school.equals(t.school);

        //�ַ�����˫�ȺűȽϿ�����
		// ������
		//return this.no == t.no && this.school == t.school;
    }

}
