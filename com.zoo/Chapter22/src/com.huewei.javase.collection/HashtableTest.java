import java.util.Hashtable;
import java.util.Map;

/*
Hashtable��key����Ϊnull��
    Hashtable��key��value���ǲ���Ϊnull�ġ�
    HashMap���ϵ�key��value���ǿ���Ϊnull�ġ�

Hashtable����������synchronized���̰߳�ȫ�ġ�
�̰߳�ȫ�������ķ��������Hashtable���̵߳Ĵ���
����Ч�ʽϵͣ�ʹ�ý����ˡ�

Hashtable��HashMapһ�����ײ㶼�ǹ�ϣ�����ݽṹ��
Hashtable�ĳ�ʼ��������11��Ĭ�ϼ��������ǣ�0.75f
Hashtable�������ǣ�ԭ���� * 2 + 1
 */
public class HashtableTest {
    public static void main(String[] args) {
        Map map = new Hashtable();
        // map.put(null, "123");  // ����NullPointerException
        map.put(100, null);  // ����NullPointerException

    }
}
