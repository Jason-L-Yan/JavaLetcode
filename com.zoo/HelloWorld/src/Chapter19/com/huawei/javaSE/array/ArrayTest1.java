package Chapter19.com.huawei.javaSE.array;

/*
Array
    1、Java语言中的数组是一种引用数据类型。不属于基本数据类型。数组的父类是Object。
    2、数组实际上是一个容器，可以同时容纳多个元素。（数组是一个数据的集合。）
    数组：字面意思是“一组数据”
    3、数组当中可以存储“基本数据类型”的数据，也可以存储“引用数据类型”的数据。
    4、数组因为是引用类型，所以数组对象是堆内存当中。（数组是存储在堆当中的）
    5、数组当中如果存储的是“java对象”的话，实际上存储的是对象的“引用（内存地址）”，数组中不能直接存储java对象。
    6、数组一旦创建，在java中规定，长度不可变。（数组长度不可变）
    7、数组的分类：一维数组、二维数组、三维数组、多维数组...（一维数组较多，二维数组偶尔使用！）
    8、所有的数组对象都有length属性(java自带的)，用来获取数组中元素的个数。
    9、java中的数组要求数组中元素的类型统一。比如int类型数组只能存储int类型，Person类型数组只能存储Person类型。
    例如：超市购物，购物袋中只能装苹果，不能同时装苹果和橘子。（数组中存储的元素类型统一）
    10、数组在内存方面存储的时候，数组中的元素内存地址(存储的每一个元素都是有规则的挨着排列的)是连续的。内存地址连续。
    这是数组存储元素的特点（特色）。数组实际上是一种简单的数据结构。
    11、所有的数组都是拿“第一个小方框的内存地址”作为整个数组对象的内存地址。
    （数组中首元素的内存地址作为整个数组对象的内存地址。）
    12、数组中每一个元素都是有下标的，下标从0开始，以1递增。最后一个元素的下标是：length - 1
    下标非常重要，因为我们对数组中元素进行“存取”的时候，都需要通过下标来进行。
    13、数组这种数据结构的优点和缺点是什么？
        优点：查询/查找/检索某个下标上的元素时效率极高。可以说是查询效率最高的一个数据结构。
            为什么检索效率高？
                第一：每一个元素的内存地址在空间存储上是连续的。
                第二：每一个元素类型相同，所以占用空间大小一样。
                第三：知道第一个元素内存地址，知道每一个元素占用空间的大小，又知道下标，所以
                通过一个数学表达式就可以计算出某个下标上元素的内存地址。直接通过内存地址定位
                元素，所以数组的检索效率是最高的。

                数组中存储100个元素，或者存储100万个元素，在元素查询/检索方面，效率是相同的，
                因为数组中元素查找的时候不会一个一个找，是通过数学表达式计算出来的。（算出一个
                内存地址，直接定位的。）
        缺点：
            第一：由于为了保证数组中每个元素的内存地址连续，所以在数组上随机删除或者增加元素的时候，
        效率较低，因为随机增删元素会涉及到后面元素统一向前或者向后位移的操作。
            第二：数组不能存储大数据量，为什么？
                因为很难在内存空间上找到一块特别大的连续的内存空间。

        注意：对于数组中最后一个元素的增删，是没有效率影响的。
    14、怎么声明/定义一个一维数组？
        语法格式：
            int[] array1;
            double[] array2;
            boolean[] array3;
            String[] array4;
            Object[] array5;
    15、怎么初始化一个一维数组呢？
        包括两种方式：静态初始化一维数组，动态初始化一维数组。
        静态初始化语法格式：
            int[] array = {100, 2100, 300, 55};
        动态初始化语法格式：
            int[] array = new int[5]; // 这里的5表示数组的元素个数。
                                        // 初始化一个5个长度的int类型数组，每个元素默认值0
            String[] names = new String[6]; // 初始化6个长度的String类型数组，每个元素默认值null。

 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] a1 = { 1, 100, 10, 20, 55, 689 };
        int[] a2 = new int[6];
        String[] a3 = new String[6];
        System.out.println("a1数组中元素个数：" + a1.length);
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + "\t");
        }

        System.out.println();
        System.out.println("a2数组中元素个数：" + a2.length);
        a2[a2.length - 1] = 888;
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + "\t");
        }
        
        System.out.println();
        System.out.println("a3数组中元素个数：" + a3.length);
        for (int i = 0; i < a3.length; i++) {
            System.out.print(a3[i] + "\t");
        }
        System.out.println();
    }

}
