import java.util.Properties;

/*
目前只需要掌握Properties属性类对象的相关方法即可。
Properties是一个Map集合，继承Hashtable，Properties的key和value都是String类型。
Properties被称为属性类对象。
Properties是线程安全的。
 */
public class PropertiesTest1 {
    public static void main(String[] args) {
        // 创建一个Properties对象
        Properties pro = new Properties();

        // 需要掌握Properties的两个方法，一个存，一个取
        pro.setProperty("url", "jdbc:mysql://localhost:3306/bjpowernode");
        pro.setProperty("driver","com.mysql.jdbc.Driver");
        pro.setProperty("username", "root");
        pro.setProperty("password", "123");

        // 通过key获取value

        String url = pro.getProperty("url");
        String driver = pro.getProperty("driver");
        String userName = pro.getProperty("username");
        String password = pro.getProperty("password");

        // 通过key获取value
        System.out.println(url);
        System.out.println(driver);
        System.out.println(userName);
        System.out.println(password);
    }
}
