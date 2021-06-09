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
     * ͳ��ͼ����������
     * @return
     */
    @Override
    public Map<String, Integer> bookTypeCount() {
        // ��һ����ѯ�Ĳ�����ֻ�ö�������д�����Կ������Զ��ر�
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PathConstant.BOOK_PATH))) {
            // ��ȡ����
            List<Book> list = (List<Book>) ois.readObject();
            // ��������
//            for(int i = 0; i < list.size(); i++){
//                Object obj = list.get(i);
//                System.out.println("�Ǻ�" + obj);
//            }
            // ����ת��Stream����ʹ��Stream�����з���ͳ��
            Map<String, List<Book>> collect = list.stream().collect(Collectors.groupingBy(Book::getType));


            // ********************��������֮���collect�е�����********************************
//            Set<Map.Entry<String, List<Book>>> set= collect.entrySet();
//            // ����Set���ϣ�ÿһ��ȡ��һ��Node
//            // ������
//            Iterator<Map.Entry<String, List<Book>>> it2 = set.iterator();
//            while (it2.hasNext()) {
//                Map.Entry<String, List<Book>> node = it2.next();
//                String key = node.getKey();
//                List<Book> value = node.getValue();
//                System.out.println(key + "=" + value);
//            }
            // �������������=[com.bjpowernode.bean.Book@1a0dd73f, com.bjpowernode.bean.Book@6a16554c]
            // ***************************************************


            // ������
            HashMap<String, Integer> map = new HashMap<>();

            // entrySet()��Map����ת����Set���ϡ�Map����ͨ��entrySet()����ת���ɵ����Set���ϣ�Set������
            //Ԫ�ص������� Map.Entry<K,V>��Map.Entry��Stringһ��������һ�����͵����֣�ֻ������Map.Entry
            //�Ǿ�̬�ڲ��࣬��Map�еľ�̬�ڲ��ࡣ
            // 4 = zhaoliu ---> ��������Ǹ�ʲô��Map.Entry
            Iterator<Map.Entry<String, List<Book>>> iterator = collect.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, List<Book>> next = iterator.next();
                // �����=[com.bjpowernode.bean.Book@1a0dd73f, com.bjpowernode.bean.Book@6a16554c]
                map.put(next.getKey(), next.getValue() == null ? 0 : next.getValue().size());
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
