/*
	��д����ʹ��һά���飬ģ��ջ���ݽṹ��
	Ҫ��
		1�����ջ���Դ洢java�е��κ��������͵����ݡ�(Object������Դ洢�κ�������������)
		2����ջ���ṩpush����ģ��ѹջ����ջ���ˣ�Ҫ����ʾ��Ϣ����
		3����ջ���ṩpop����ģ�ⵯջ����ջ���ˣ�Ҳ������ʾ��Ϣ����
		4����д���Գ���newջ���󣬵���push pop������ģ��ѹջ��ջ�Ķ�����
		5������ջ��Ĭ�ϳ�ʼ��������10.����ע���޲������췽���ı�д��ʽ����
 */

package com.huawei.javaSE.array;

public class HomeworkStack {
    private Object[] elements;
    // ջ֡����Զָ��ջ����Ԫ��
    // ��ô���Ĭ�ϳ�ʼֵӦ���Ƕ��١�ע�⣺�����ջ�ǿյģ�һ��Ԫ�ض�û�С�
    // private int index = 0; // ���index����0����ʾջָ֡���˶���Ԫ�ص��Ϸ���
    // private int index = -1; // ���index����-1����ʾջָ֡���˶���Ԫ�ء�
    private int index;

    public HomeworkStack() {
        // �޲ι������н��ж�̬��ʼ����Ҳ�����ڿ�ʼ����ʱ���ж�̬��ʼ����
        this.elements = new Object[10];
        // ��index��ʼ��
        this.index = -1;
    }

    // setter��getter������װ
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * ѹջ����
     * 
     * @param obj ��ѹ���Ԫ��
     */
    public void push(Object obj) {
        if (this.getIndex() >= this.getElements().length - 1) {
            System.out.println("ѹջʧ�ܣ�ջ������");
            return;
        }
        this.index++;
        this.elements[this.index] = obj;
        System.out.println("ѹջ"+ obj +"Ԫ�سɹ���ջָ֡��" + index);
    }

    /**
     * ��ջ�ķ�������������ȡһ��Ԫ�أ�ջ֡������һλ
     * @param obj
     * @return
     */
    public Object pop() {
        if (this.getIndex() < 0) {
            System.out.println("��ջʧ�ܣ�ջ�ѿգ�");
            // return;  // ������ΪҪ�󷵻�ֵ�� Object��
            return null;
        }
        System.out.print("��ջ"+ this.elements[this.index] +"Ԫ�سɹ���");
        this.index--;
        System.out.println("ջָ֡��" + this.index);
        // return this.elements[this.index];
        return this.elements[this.index + 1];
    }
}
