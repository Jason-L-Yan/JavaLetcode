import java.util.TreeSet;

public class TreeSetTest4 {
    public static void main(String[] args) {
        Customer c1 = new Customer(32);
        Customer c2 = new Customer(20);
        Customer c3 = new Customer(30);
        Customer c4 = new Customer(25);

        // 创建TreeSet集合
        TreeSet<Customer> cus = new TreeSet<>();
        // 添加元素
        cus.add(c1);
        // 添加第二个元素时报错，不知道排序规则。
        // 报错：ClassCastException
        cus.add(c2);
        cus.add(c3);
        cus.add(c4);

        // 遍历
        for (Customer c : cus) {
            System.out.println(c);
        }
    }
}

// 放在TreeSet集合中的元素需要实现java.lang.Comparable接口。
// 并且实现compareTo方法。equals可以不写。
class Customer implements Comparable<Customer> {
    int age;

    public Customer(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer [age=" + age + "]";
    }

    // 需要在这个方法中编写比较的逻辑，或者说比较的规则，按照什么进行比较！
    // k.compareTo(t.key)
    // 拿着参数k和集合中的每一个k进行比较，返回值可能是>0 <0 =0
    // 比较规则最终还是由程序员指定的：例如按照年龄升序。或者按照年龄降序。
    @Override
    public int compareTo(Customer c) { // c1.compareTo(c2);
        // this是c1
        // c是c2
        // c1和c2比较的时候，就是this和c比较。
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
        // return c.age - this.age;  // 降序排列
        return this.age - c.age;  // 升序排列
    }

}