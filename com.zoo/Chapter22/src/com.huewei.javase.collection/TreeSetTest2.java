import java.util.TreeSet;

/*
1��TreeSet���ϵײ�ʵ������һ��TreeMap
2��TreeMap���ϵײ���һ����������
3���ŵ�TreeSet�����е�Ԫ�أ���ͬ�ڷŵ�TreeMap����key�����ˡ�
4��TreeSet�����е�Ԫ�أ����򲻿��ظ������ǿ��԰���Ԫ�صĴ�С˳���Զ�����
��Ϊ�������򼯺ϡ�
 */
public class TreeSetTest2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        // ���String
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wangwu");
        ts.add("zhangsi");
        ts.add("wangliu");
        // ����
        for(String s : ts){
            // �����ֵ�˳������
            System.out.println(s);
        }

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(100);
        ts2.add(200);
        ts2.add(900);
        ts2.add(800);
        ts2.add(600);
        ts2.add(10);
        for(Integer elt : ts2){
            // ����
            System.out.println(elt);
        }
    }
}
/*
���ݿ����кܶ����ݣ�
    userid  name     birth
    -------------------------------------
    1       zs          1980-11-11
    2       ls          1980-10-11
    3       ww          1981-11-11
    4       zl          1979-11-11

    ��д��������ݿ⵱��ȡ�����ݣ���ҳ��չʾ�û���Ϣ��ʱ��������������߽���
    ���ʱ�����ʹ��TreeSet���ϣ���ΪTreeSet���ϷŽ�ȥ���ó���������˳��ġ�
 */