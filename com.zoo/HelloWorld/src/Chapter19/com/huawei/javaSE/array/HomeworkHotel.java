/*
酒店对象，酒店中有二维数组，二维数组模拟大厦。
 */

package com.huawei.javaSE.array;

public class HomeworkHotel {
    // 二维数组，模拟大厦所有的房间
    private Room[][] rooms;

    public HomeworkHotel() {
        String type = null;
        // 创建对象时，在构造器中进行初始化
        this.rooms = new Room[3][6]; // 3层楼，每层10个房间。

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0)
                    type = "单人间";
                if (i == 1)
                    type = "标准间";
                if (i == 2)
                    type = "总统套房";

                rooms[i][j] = new Room(((i + 1) * 100 + j + 1), type, true);
            }
        }
    }

    public HomeworkHotel(Room[][] rooms) {
        this.rooms = rooms;
    }

    // setter 与getter 方法
    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    // 在酒店对象上提供一个打印房间列表的方法
    public void print() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                // Room的 toString 方法已经重写过了。
                System.out.print(rooms[i][j]);
            }
            System.out.println();
        }
    }
    
    /**
     * 订房方法。
     * @param roomNo 调用此方法时需要传递一个房间编号过来。这个房间编号是前台小姐姐输入的。
     */
    public void order(int roomNo) {
        // 订房最主要的是将房间对象的status修改为false。
        // Room对象的status修改为false。
        // 假设房间编号207（下标是 rooms[1][6] ）
        // 通过房间编号演算出下标。获取房间对象。
        rooms[roomNo / 100 - 1][roomNo % 100 -1].setStatus(false);
    }

    /**
     * 退房方法
     * @param roomNo
     */
    public void exit(int roomNo) {
        rooms[roomNo / 100 - 1][roomNo % 100 -1].setStatus(true);
    }
}
