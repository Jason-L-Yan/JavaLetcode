/*
�Ƶ���󣬾Ƶ����ж�ά���飬��ά����ģ����á�
 */

package com.huawei.javaSE.array;

public class HomeworkHotel {
    // ��ά���飬ģ��������еķ���
    private Room[][] rooms;

    public HomeworkHotel() {
        String type = null;
        // ��������ʱ���ڹ������н��г�ʼ��
        this.rooms = new Room[3][6]; // 3��¥��ÿ��10�����䡣

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0)
                    type = "���˼�";
                if (i == 1)
                    type = "��׼��";
                if (i == 2)
                    type = "��ͳ�׷�";

                rooms[i][j] = new Room(((i + 1) * 100 + j + 1), type, true);
            }
        }
    }

    public HomeworkHotel(Room[][] rooms) {
        this.rooms = rooms;
    }

    // setter ��getter ����
    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    // �ھƵ�������ṩһ����ӡ�����б�ķ���
    public void print() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                // Room�� toString �����Ѿ���д���ˡ�
                System.out.print(rooms[i][j]);
            }
            System.out.println();
        }
    }
    
    /**
     * ����������
     * @param roomNo ���ô˷���ʱ��Ҫ����һ�������Ź����������������ǰ̨С�������ġ�
     */
    public void order(int roomNo) {
        // ��������Ҫ���ǽ���������status�޸�Ϊfalse��
        // Room�����status�޸�Ϊfalse��
        // ���跿����207���±��� rooms[1][6] ��
        // ͨ��������������±ꡣ��ȡ�������
        rooms[roomNo / 100 - 1][roomNo % 100 -1].setStatus(false);
    }

    /**
     * �˷�����
     * @param roomNo
     */
    public void exit(int roomNo) {
        rooms[roomNo / 100 - 1][roomNo % 100 -1].setStatus(true);
    }
}
