// package JavaLearning;

public class Homework13 {
    public static void main(String[] args){
        Book b1 = new Book("高三数学人教版", 250);
        b1.detail();
        // 修改页数：
        b1.setPageNum(150);
        b1.detail();

        Book b2 = new Book();
        b2.detail();

    }
    
}

class Book{
    private String title;
    private int pageNum;

    // 构造方法
    // 无参数
    public Book(){

    }
    
    public Book(String s, int i){
        title = s;
        pageNum = i;

    }

    // 封装
    // title
    public String getTitle(){
        return title;
    }

    public void setTitle(String s){
        title = s;
    }

    // pageNum
    public int getPageNum(){
        return pageNum;
    }

    public void setPageNum(int s){
        if(s <= 200){  // 也可以把这句话放在有参的构造方法中。
            System.out.println("本书页数不能少于200页！默认赋值200。");
            pageNum = 200;
            return;
        }
        pageNum = s;
    }

    // detail方法
    public void detail(){
        System.out.println("教材：" + title + "," + "总页数为" + pageNum);
    }
}
