/*
�����ࡣ(��������)
 */
public class LinkTest1<E> {
    
    Node header = null;
    int size = 0;

    public int size() {
        return size;
    }

    public void add(E data) {
        // ����һ���µĽڵ����
        // ��֮ǰ�������ĩβ�ڵ�nextָ���½ڵ����
        // �п������Ԫ���ǵ�һ����Ҳ�����ǵڶ�����Ҳ�����ǵ�������
        if(header == null) {
            // ˵����û�нڵ㡣
            // newһ���µĽڵ������Ϊͷ�ڵ����
            // ���ʱ���ͷ�ڵ����һ��ͷ�ڵ㣬����һ��ĩβ�ڵ㡣
            header = new Node(data, null);
        } else {
            // ˵��ͷ���ǿգ�
            // ͷ�ڵ��Ѿ������ˣ�
            // �ҳ���ǰĩβ�ڵ㣬�õ�ǰĩβ�ڵ��next���½ڵ㡣
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data, null);
        }
        size++;
    }

    /**
     * ר�Ų���ĩβ�ڵ�ķ�����
     */
    private Node findLast(Node node) {
        if(node.next == null){
            // ���һ���ڵ��next��null
            // ˵������ڵ����ĩβ�ڵ㡣
            return node;
        }
        // �����ܹ�������˵����node����ĩβ�ڵ�
        return findLast(node.next);  // �ݹ��㷨��
    }

    // ����������ĳ��Ԫ�صķ�����
    public int find(Object data) {
        return 1;
    }
}
