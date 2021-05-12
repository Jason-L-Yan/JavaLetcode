/*
	编写程序，使用一维数组，模拟栈数据结构。
	要求：
		1、这个栈可以存储java中的任何引用类型的数据。(Object数组可以存储任何引用数据类型)
		2、在栈中提供push方法模拟压栈。（栈满了，要有提示信息。）
		3、在栈中提供pop方法模拟弹栈。（栈空了，也有有提示信息。）
		4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
		5、假设栈的默认初始化容量是10.（请注意无参数构造方法的编写方式。）
 */

package com.huawei.javaSE.array;

public class HomeworkStack {
    private Object[] elements;
    // 栈帧，永远指向栈顶部元素
    // 那么这个默认初始值应该是多少。注意：最初的栈是空的，一个元素都没有。
    // private int index = 0; // 如果index采用0，表示栈帧指向了顶部元素的上方。
    // private int index = -1; // 如果index采用-1，表示栈帧指向了顶部元素。
    private int index;

    public HomeworkStack() {
        // 无参构造器中进行动态初始化，也可以在开始定义时进行动态初始化。
        this.elements = new Object[10];
        // 给index初始化
        this.index = -1;
    }

    // setter与getter方法封装
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
     * 压栈方法
     * 
     * @param obj 被压入的元素
     */
    public void push(Object obj) {
        if (this.getIndex() >= this.getElements().length - 1) {
            System.out.println("压栈失败，栈已满！");
            return;
        }
        this.index++;
        this.elements[this.index] = obj;
        System.out.println("压栈"+ obj +"元素成功，栈帧指向：" + index);
    }

    /**
     * 弹栈的方法，从数组中取一个元素，栈帧向下移一位
     * @param obj
     * @return
     */
    public Object pop() {
        if (this.getIndex() < 0) {
            System.out.println("弹栈失败，栈已空！");
            // return;  // 报错，因为要求返回值是 Object。
            return null;
        }
        System.out.print("弹栈"+ this.elements[this.index] +"元素成功，");
        this.index--;
        System.out.println("栈帧指向：" + this.index);
        // return this.elements[this.index];
        return this.elements[this.index + 1];
    }
}
