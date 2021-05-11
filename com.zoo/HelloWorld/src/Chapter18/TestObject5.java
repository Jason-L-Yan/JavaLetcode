package Chapter18;

public class TestObject5 {
    public static void main(String[] args) {
        // ��̬���Զ�����ת������
		Object o1 = new String("hello world!");
		Object o2 = new User2();
		Object o3 = new Address();

		User2 u1 = new User2("zhangsan", new Address("����","������","11111"));
		User2 u2 = new User2("zhangsan", new Address("����","������","11111"));

		System.out.println(u1.equals(u2)); // true

		User2 u3 = new User2("zhangsan", new Address("����","������","11111"));
		System.out.println(u1.equals(u3)); // false
    }
}

class User2 {
    // �û���
    String name;
    // �û�סַ
    Address addr;

    public User2() {

    }

    public User2(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    // ��дequals����
    // ��д���򣺵�һ���û����û����ͼ�ͥסַ����ͬ����ʾͬһ���û���
    // ���equals�жϵ���User�����User�����Ƿ���ȡ�
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof User2)) {
            return false;
        }

        if (this == obj) {
            return true;
        }
        User2 user2 = (User2) obj;
        return this.name.equals(user2.name) && this.addr.equals(user2.addr);
    }

}

class Address {
    String city;
    String street;
    String zipCode;

    public Address() {
    }

    public Address(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    // ע�⣺���ﲢû����дequals������
    // �����equals�����жϵ��ǣ�Address�����Address�����Ƿ���ȡ�
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Address)) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        Address addr = (Address) obj;
        return this.city.equals(addr.city) && this.street.equals(addr.street) && this.zipCode.equals(addr.zipCode);
    }

}
