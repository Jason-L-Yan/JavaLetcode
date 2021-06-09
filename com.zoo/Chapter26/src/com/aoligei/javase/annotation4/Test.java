package com.aoligei.javase.annotation4;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception {
        // ��ȡ��
        Class userClass = Class.forName("com.aoligei.javase.annotation4.User");
        boolean isOk = false;  // ��һ��Ĭ�ϱ��
        // �ж������Ƿ����Idע��
        if (userClass.isAnnotationPresent(MustHasIdPropertyAnnotation.class)) {
            // ��һ����������@MustHasIdPropertyAnnotationע���ʱ��Ҫ�����б������int���͵�id����
            // ���û��int���͵�id�������쳣��
            // ��ȡ�������
            Field[] fields = userClass.getDeclaredFields(); 
            
            for (Field field : fields) {
                if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())) {
                    // ��ʾ������ǺϷ����ࡣ��@Idע�⣬��������б�����int���͵�id
                    isOk = true;  // ��ʾ�Ϸ�
                    break;
                }
            }
        }

        // �ж��Ƿ�Ϸ�
        if(!isOk) {
            throw new HasNotIdPropertyException("��@MustHasIdPropertyAnnotationע���ע�����б���Ҫ��һ��int���͵�id���ԣ�");
        }

    }
}
