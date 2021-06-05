package com.aoligei.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflectTest11 {
    public static void main(String[] args) throws Exception {
        // StringBuilder�Ƿ��̰߳�ȫ�ģ���ΪStringBuilder���з���û�����synchronized
        // StringBuffer���̰߳�ȫ��
        StringBuilder s = new StringBuilder();  
        Class vipClass = Class.forName("java.lang.String");
        s.append(Modifier.toString(vipClass.getModifiers()));  // 
        s.append(" class ");
        s.append(vipClass.getSimpleName());
        s.append("{\n");

        // ƴ�ӹ��췽��
        Constructor[] constructors = vipClass.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            //public Vip(int no, String name, String birth, boolean sex) {
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            s.append(vipClass.getSimpleName());
            s.append("(");
            // ƴ�Ӳ���
            Class[] parameterTypes = constructor.getParameterTypes();
            for(Class parameterType : parameterTypes){
                s.append(parameterType.getSimpleName());
                s.append(",");
            }
            // ɾ������±�λ���ϵ��ַ���,��
            // �жϲ����б��Ƿ�Ϊ�գ��վͲ���ɾ��
            if(parameterTypes.length > 0){  
                s.deleteCharAt(s.length() - 1);
            }
            s.append("){}\n");
        }

        s.append("}");
        System.out.println(s);
    }
}
