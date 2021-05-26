import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
1��JDK5.0֮���Ƴ��������ԣ�����
2�����������﷨���ƣ�ֻ�ڳ������׶������ã�ֻ�Ǹ��������ο��ġ������н׶η���û�ã���
3��ʹ���˷��ͺô���ʲô��
    ��һ�������д洢��Ԫ������ͳһ�ˡ�
    �ڶ����Ӽ�����ȡ����Ԫ�������Ƿ���ָ�������ͣ�����Ҫ���д����ġ�����ת�͡���

4�����͵�ȱ����ʲô��
    ���¼����д洢��Ԫ��ȱ�������ԣ�
    �����ҵ���У�������Ԫ�ص����ͻ���ͳһ�ġ��������ַ������Ա�������Ͽɡ�
 */
public class GenericTest1 {
    public static void main(String[] args) {
        // ��ʹ�÷��ͻ��ƣ������������ȱ��
        // List myList = new ArrayList();
        // // ׼������
        // Cat c = new Cat();
        // Bird b = new Bird();

        // // ��������ӵ�������
        // myList.add(c);
        // myList.add(b);

        // // �������ϣ�ȡ��ÿ��Animal������move
        // Iterator it = myList.iterator();
        // while (it.hasNext()) {
        //     // û������﷨��ͨ��������ȡ���ľ���Object
        //     // Animal a = it.next();
        //     Object obj = it.next();
        //     if (obj instanceof Bird) {
        //         Bird b2 = (Bird) obj;
        //         b2.fly();
        //     } else if (obj instanceof Cat) {
        //         Cat c2 = (Cat) obj;
        //         c2.catchMouse();
        //     } else if (obj instanceof Animal) {
        //         Animal a2 = (Animal) obj;
        //         a2.move();
        //     }
        // }

        // ʹ��JDK5֮��ķ��ͻ���
        // ʹ�÷���List<Animal>֮�󣬱�ʾList������ֻ����洢Animal���͵����ݡ�
        // �÷�����ָ�������д洢���������͡�
        List<Animal>myList = new ArrayList<Animal>();

        // ָ��List������ֻ�ܴ洢Animal����ô�洢String�ͱ��뱨���ˡ�
        // �������˷���֮�󣬼�����Ԫ�ص��������͸���ͳһ�ˡ�
        // myList.add("abc");  // ������Ϊ�Ϸ��Ѿ��涨�洢�����ݡ�
        Cat c = new Cat();
        Bird b = new Bird();
        myList.add(c);
        myList.add(b);

        // ��ȡ������
        // �����ʾ��������������Animal���͡�
        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()) {
            // ʹ�÷���֮��ÿһ�ε������ص����ݶ���Animal���͡�
            //Animal a = it.next();
            // ���ﲻ��Ҫ����ǿ������ת���ˡ�ֱ�ӵ��á�
            //a.move();

            // �������������еķ���������Ҫ����ת���ģ�
            Animal a = it.next();
            if(a instanceof Cat) {
                Cat x = (Cat)a;
                x.catchMouse();
            }
            if(a instanceof Bird) {
                Bird y = (Bird)a;
                y.fly();
            }
        }

    }
}

class Animal {
    public void move() {
        System.out.println("�������ƶ�");
    }
}

class Cat extends Animal {
    public void catchMouse() {
        System.out.println("èץ����");
    }
}

class Bird extends Animal {
    public void fly() {
        System.out.println("����ڷ���");
    }

}