package Chapter18;

public class TestObject5 {
    public static void main(String[] args) {
        // 多态（自动类型转换。）
		Object o1 = new String("hello world!");
		Object o2 = new User2();
		Object o3 = new Address();

		User2 u1 = new User2("zhangsan", new Address("北京","大兴区","11111"));
		User2 u2 = new User2("zhangsan", new Address("北京","大兴区","11111"));

		System.out.println(u1.equals(u2)); // true

		User2 u3 = new User2("zhangsan", new Address("北京","朝阳区","11111"));
		System.out.println(u1.equals(u3)); // false
    }
}

class User2 {
    // 用户名
    String name;
    // 用户住址
    Address addr;

    public User2() {

    }

    public User2(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    // 重写equals方法
    // 重写规则：当一个用户的用户名和家庭住址都相同，表示同一个用户。
    // 这个equals判断的是User对象和User对象是否相等。
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

    // 注意：这里并没有重写equals方法。
    // 这里的equals方法判断的是：Address对象和Address对象是否相等。
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
