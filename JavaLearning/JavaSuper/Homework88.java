public class Homework88 {
    public static void main(String[] args){
        AA aa = new AA(100);
        BB bb = new BB(aa);
        while(true){
            java.util.Scanner s = new java.util.Scanner(System.in);
            int caice = s.nextInt();
            bb.cai(caice);
        }

    }

    
}


class AA{
    private int v;
    
    public AA(){

    }

    public AA(int v){
        this.v = v;
    }

    public void setV(int v){
        this.v = v;
    }

    public int getV(){
        return v;
    }

}


class BB{
    private AA a;

    public BB(){

    }

    public BB(AA a){
        this.a = a;
    }

    public void setA(AA a){
        this.a = a;
    }

    public AA getA(){
        return a;
    }

    // 猜测方法
    public void cai(int caiCeNum){
        int shiJiZhi = a.getV();
        if(caiCeNum == shiJiZhi){
            System.out.println("猜对了");
            System.exit(0);
        }else if(caiCeNum > shiJiZhi){
            System.out.println("猜大了");
            
        }else{
            System.out.println("猜小了");

        }
    }
}