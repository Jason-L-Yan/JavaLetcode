package com.huawei.javaSE.array;

import java.util.Scanner;

public class HomeworkHotelManagementSystem {
    public static void main(String[] args) {
        HomeworkHotel hotel = new HomeworkHotel();
        // // ��ӡ����״̬
        // hotel.print();
        System.out.println("��ӭʹ�þƵ����ϵͳ���������Ķ�����ʹ��˵��");
        System.out.println("���ܱ�Ŷ�Ӧ�Ĺ��ܣ�[1]��ʾ�鿴�����б�[2]��ʾ������[3]��ʾ�˷���[0]��ʾ�˳�ϵͳ��");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("�����빦�ܱ�ţ�");
            int i = sc.nextInt();
            if (i == 1) {
                // �鿴�����б�
                hotel.print();
            } else if (i == 2) {
                // ����
                System.out.print("�����붩����ţ�");
                int roomNo = sc.nextInt();
                hotel.order(roomNo);
                System.out.println("�ɹ�����" + roomNo);
            } else if (i == 3) {
                // �˷�
                System.out.print("�������˷���ţ�");
                int roomNo = sc.nextInt();
                hotel.exit(roomNo);
                System.out.println("�ɹ��˷�" + roomNo);
            } else if (i == 0) {
                System.out.println("�ټ�����ӭ�´�������");
                sc.close();
                return;
            } else {
                // �����ˣ�
                System.out.println("���빦�ܱ���������������룡");
            }
        }

    }
}
