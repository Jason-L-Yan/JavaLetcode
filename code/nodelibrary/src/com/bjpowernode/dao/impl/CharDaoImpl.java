package com.bjpowernode.dao.impl;

import com.bjpowernode.bean.Book;
import com.bjpowernode.bean.PathConstant;
import com.bjpowernode.dao.CharDao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;
import java.util.stream.Collectors;

public class CharDaoImpl implements CharDao {
    /**
     * 统计图书分类的数量
     * @return
     */
    @Override
    public Map<String, Integer> bookTypeCount() {
        // 是一个查询的操作，只用读，不用写，所以可以用自动关闭
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PathConstant.BOOK_PATH))) {
            // 读取数据
            List<Book> list = (List<Book>) ois.readObject();
            // 遍历集合
//            for(int i = 0; i < list.size(); i++){
//                Object obj = list.get(i);
//                System.out.println("呵呵" + obj);
//            }
            // 集合转成Stream流，使用Stream流进行分来统计
            Map<String, List<Book>> collect = list.stream().collect(Collectors.groupingBy(Book::getType));


            // ********************遍历分类之后的collect中的数据********************************
//            Set<Map.Entry<String, List<Book>>> set= collect.entrySet();
//            // 遍历Set集合，每一次取出一个Node
//            // 迭代器
//            Iterator<Map.Entry<String, List<Book>>> it2 = set.iterator();
//            while (it2.hasNext()) {
//                Map.Entry<String, List<Book>> node = it2.next();
//                String key = node.getKey();
//                List<Book> value = node.getValue();
//                System.out.println(key + "=" + value);
//            }
            // 输出结果：计算机=[com.bjpowernode.bean.Book@1a0dd73f, com.bjpowernode.bean.Book@6a16554c]
            // ***************************************************


            // 处理结果
            HashMap<String, Integer> map = new HashMap<>();

            // entrySet()将Map集合转换成Set集合。Map集合通过entrySet()方法转换成的这个Set集合，Set集合中
            //元素的类型是 Map.Entry<K,V>。Map.Entry和String一样，都是一种类型的名字，只不过：Map.Entry
            //是静态内部类，是Map中的静态内部类。
            // 4 = zhaoliu ---> 这个东西是个什么？Map.Entry
            Iterator<Map.Entry<String, List<Book>>> iterator = collect.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, List<Book>> next = iterator.next();
                // 计算机=[com.bjpowernode.bean.Book@1a0dd73f, com.bjpowernode.bean.Book@6a16554c]
                map.put(next.getKey(), next.getValue() == null ? 0 : next.getValue().size());
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
