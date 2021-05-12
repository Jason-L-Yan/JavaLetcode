package com.huawei.javaSE.array;

public class Room {
    /**
     * ������
     * 1¥��101 102 103 104 105 106..
     * 2¥��201 202 203 204 205 206..
     * 3¥��301 302 303 304 305 306..
     */
    private int no;
    /**
     * �������ͣ���׼�� ���˼� ��ͳ�׷�
     */
    private String type;
    /**
     * ����״̬�� true��ʾ���У�������Ա�Ԥ���� false��ʾռ�ã����䲻�ܱ�Ԥ����
     */
    private boolean status;

    // ���췽��
    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    // setter �� getter ����
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // equals()������д
    // equals������д
    // equals�������Ƚ����������Ƿ���ͬ�ġ�
    // ������ô�Ƚϣ�������ǳ���Ա�Լ�����
    // ����Ϊ��������ı����ͬ���ͱ�ʾͬһ�����䣬��ô��д����ȽϷ����ž��С�
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Room) || obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }
        Room room = (Room) obj;
        // ��ǰ������ ���� �������ķ������ķ����š���Ϊ��ͬһ�����䡣
        return this.getNo() == room.getNo();
    }

    // toString������д
    @Override
    public String toString() {
        return "[" + no + "," + (status ? "����" : "ռ��") + "," + type + "]";
    }

    // ��дһ����ʱ�����������
    // һ�����ɾ�����main����
    /* public static void main(String[] args) {
        Room room = new Room(101, "���˼�", false);
        Room room2 = new Room(101, "���˼�", false);
        // �������仰ͬ������
        // System.out.println(room.toString());
        // �����á� Ĭ�ϵ��� toString() ����
        System.out.println(room);
        System.out.println(room.equals(room2));
    } */

}
