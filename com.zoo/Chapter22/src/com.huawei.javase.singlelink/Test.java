public class Test {
    public static void main(String[] args) {
        LinkTest1 link = new LinkTest1();

        // �����������Ԫ��
        link.add("abc");
        link.add("def");
        link.add("xyz");

        // ��ȡԪ�ظ���
        System.out.println(link.size());

    }
}
