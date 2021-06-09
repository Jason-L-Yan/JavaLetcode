package com.bjpowernode.util;

import java.lang.reflect.Field;

public class BeanUtil {
    /**
     * ��������ֵ�ÿ������÷���Ӧ�þ߱�ͨ���ԣ����������ĳһ������İ�����
     * ��ʱ�������÷��䣬��ȡ�������������ԡ���ΪObject��û����ȡ������ͬ���Ͳ��������ԡ�
     * ���÷�����ԡ�
     * @param origin  ����ֵ���ԵĲ���
     * @param dest  ȡ��dest������ֵ����ֵ��origin
     */
    public static void populate(Object origin, Object dest) {
        try {
            // ʹ�÷����ȡ����ֵ
            // �ж����������Ƿ���ͬһ������
            if (origin.getClass() != dest.getClass()) {
                throw new RuntimeException("�������������ͬһ����");
            }

            Class<?> clazz = origin.getClass();
            // ��ȡorigin�е�����
            Field[] fields = clazz.getDeclaredFields();
            for (Field f : fields) {
                // �ų�serialVersionUID�����������в�����
                if ("serialVersionUID".equals(f.getName())) {
                    continue;
                }
                // ����˽�л���װ
                f.setAccessible(true);
                // ��ֵ
                f.set(origin, f.get(dest));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
