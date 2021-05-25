public class Test {
    public static void main(String[] args) {
        LinkTest1 link = new LinkTest1();

        // 往集合中添加元素
        link.add("abc");
        link.add("def");
        link.add("xyz");

        // 获取元素个数
        System.out.println(link.size());

    }
}
