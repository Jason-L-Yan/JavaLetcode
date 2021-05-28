import java.util.TreeSet;

public class TreeSetTest4 {
    public static void main(String[] args) {
        Customer c1 = new Customer(32);
        Customer c2 = new Customer(20);
        Customer c3 = new Customer(30);
        Customer c4 = new Customer(25);

        // ����TreeSet����
        TreeSet<Customer> cus = new TreeSet<>();
        // ���Ԫ��
        cus.add(c1);
        // ��ӵڶ���Ԫ��ʱ������֪���������
        // ����ClassCastException
        cus.add(c2);
        cus.add(c3);
        cus.add(c4);

        // ����
        for (Customer c : cus) {
            System.out.println(c);
        }
    }
}

// ����TreeSet�����е�Ԫ����Ҫʵ��java.lang.Comparable�ӿڡ�
// ����ʵ��compareTo������equals���Բ�д��
class Customer implements Comparable<Customer> {
    int age;

    public Customer(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer [age=" + age + "]";
    }

    // ��Ҫ����������б�д�Ƚϵ��߼�������˵�ȽϵĹ��򣬰���ʲô���бȽϣ�
    // k.compareTo(t.key)
    // ���Ų���k�ͼ����е�ÿһ��k���бȽϣ�����ֵ������>0 <0 =0
    // �ȽϹ������ջ����ɳ���Աָ���ģ����簴���������򡣻��߰������併��
    @Override
    public int compareTo(Customer c) { // c1.compareTo(c2);
        // this��c1
        // c��c2
        // c1��c2�Ƚϵ�ʱ�򣬾���this��c�Ƚϡ�
        /*int age1 = this.age;
        int age2 = c.age;
        if(age1 == age2){
            return 0;
        } else if(age1 > age2) {
            return 1;
        } else {
            return -1;
        }*/

        //return this.age - c.age; // =0 >0 <0
        // return c.age - this.age;  // ��������
        return this.age - c.age;  // ��������
    }

}