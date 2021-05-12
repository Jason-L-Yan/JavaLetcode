package com.huawei.javaSE.array;

public class Room {
    /**
     * 房间编号
     * 1楼：101 102 103 104 105 106..
     * 2楼：201 202 203 204 205 206..
     * 3楼：301 302 303 304 305 306..
     */
    private int no;
    /**
     * 房间类型：标准间 单人间 总统套房
     */
    private String type;
    /**
     * 房间状态。 true表示空闲，房间可以被预定。 false表示占用，房间不能被预定。
     */
    private boolean status;

    // 构造方法
    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    // setter 与 getter 方法
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

    // equals()方法重写
    // equals方法重写
    // equals是用来比较两个对象是否相同的。
    // 至于怎么比较，这个还是程序员自己定。
    // 你认为两个房间的编号相同，就表示同一个房间，那么你写代码比较房间编号就行。
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Room) || obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }
        Room room = (Room) obj;
        // 当前房间编号 等于 传过来的房间对象的房间编号。认为是同一个房间。
        return this.getNo() == room.getNo();
    }

    // toString方法重写
    @Override
    public String toString() {
        return "[" + no + "," + (status ? "空闲" : "占用") + "," + type + "]";
    }

    // 编写一个临时程序测试以下
    // 一会可以删除这个main方法
    /* public static void main(String[] args) {
        Room room = new Room(101, "单人间", false);
        Room room2 = new Room(101, "单人间", false);
        // 以下两句话同样功能
        // System.out.println(room.toString());
        // “引用” 默认调用 toString() 方法
        System.out.println(room);
        System.out.println(room.equals(room2));
    } */

}
