package com.huawei.javaSE.array;

import java.util.Scanner;

public class HomeworkHotelManagementSystem {
    public static void main(String[] args) {
        HomeworkHotel hotel = new HomeworkHotel();
        // // 打印房间状态
        // hotel.print();
        System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用说明");
        System.out.println("功能编号对应的功能：[1]表示查看房间列表。[2]表示订房。[3]表示退房。[0]表示退出系统。");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入功能编号：");
            int i = sc.nextInt();
            if (i == 1) {
                // 查看房间列表
                hotel.print();
            } else if (i == 2) {
                // 订房
                System.out.print("请输入订房编号：");
                int roomNo = sc.nextInt();
                hotel.order(roomNo);
                System.out.println("成功订房" + roomNo);
            } else if (i == 3) {
                // 退房
                System.out.print("请输入退房编号：");
                int roomNo = sc.nextInt();
                hotel.exit(roomNo);
                System.out.println("成功退房" + roomNo);
            } else if (i == 0) {
                System.out.println("再见，欢迎下次再来！");
                sc.close();
                return;
            } else {
                // 出错了！
                System.out.println("输入功能编号有误，请重新输入！");
            }
        }

    }
}
