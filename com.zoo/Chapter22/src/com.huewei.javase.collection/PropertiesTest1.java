import java.util.Properties;

/*
Ŀǰֻ��Ҫ����Properties������������ط������ɡ�
Properties��һ��Map���ϣ��̳�Hashtable��Properties��key��value����String���͡�
Properties����Ϊ���������
Properties���̰߳�ȫ�ġ�
 */
public class PropertiesTest1 {
    public static void main(String[] args) {
        // ����һ��Properties����
        Properties pro = new Properties();

        // ��Ҫ����Properties������������һ���棬һ��ȡ
        pro.setProperty("url", "jdbc:mysql://localhost:3306/bjpowernode");
        pro.setProperty("driver","com.mysql.jdbc.Driver");
        pro.setProperty("username", "root");
        pro.setProperty("password", "123");

        // ͨ��key��ȡvalue

        String url = pro.getProperty("url");
        String driver = pro.getProperty("driver");
        String userName = pro.getProperty("username");
        String password = pro.getProperty("password");

        // ͨ��key��ȡvalue
        System.out.println(url);
        System.out.println(driver);
        System.out.println(userName);
        System.out.println(password);
    }
}
