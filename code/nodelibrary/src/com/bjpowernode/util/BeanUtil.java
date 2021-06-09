package com.bjpowernode.util;

import java.lang.reflect.Field;

public class BeanUtil {
    /**
     * 对象属性值得拷贝，该方法应该具备通用性，而不是针对某一个特殊的案例。
     * 此时可以运用反射，获取各个参数的属性。因为Object中没法获取各个不同类型参数的属性。
     * 运用反射可以。
     * @param origin  被赋值属性的参数
     * @param dest  取出dest的属性值，赋值给origin
     */
    public static void populate(Object origin, Object dest) {
        try {
            // 使用反射获取属性值
            // 判断两个对象是否是同一个类型
            if (origin.getClass() != dest.getClass()) {
                throw new RuntimeException("两个对象必须是同一类型");
            }

            Class<?> clazz = origin.getClass();
            // 获取origin中的属性
            Field[] fields = clazz.getDeclaredFields();
            for (Field f : fields) {
                // 排除serialVersionUID，对它不进行操作。
                if ("serialVersionUID".equals(f.getName())) {
                    continue;
                }
                // 打破私有化封装
                f.setAccessible(true);
                // 赋值
                f.set(origin, f.get(dest));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
