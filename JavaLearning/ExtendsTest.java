// 继承解决代码复用的问题
// 除了构造方法，其余皆会继承。
public class ExtendsTest {  
    public static void main(String[] args){
        // 创建普通账户
        Account act = new Account();
        act.setActno("11111");
        act.setBalance(10000);
        System.out.println(act.getActno() + "余额" + act.getBalance());
        // 创建信用账户
        CreditAccount ca = new CreditAccount();
        ca.setActno("22222");
        ca.setBalance(-10000);
        ca.setCredit(0.999);
        System.out.println(ca.getActno() + "余额" + ca.getBalance() + ", 信誉度" + ca.getCredit());



    }
    
}


// 账户属性：账号、余额
class Account{  // 父类
    private String actno;
    private double balance;

    // 构造方法
    public Account(){

    }

    public Account(String actno, double balance){
        this.actno = actno;
        this.balance = balance;
    }

    // 属性封装
    public void setActno(String actno){
        this.actno = actno;    
    }

    public String getActno(){
        return this.actno;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }
}


// 其他类型的账户，信用卡账户
// 代码臃肿
// class CreditAccount{
//     private String actno;
//     private double balance;
//     private double credit;

//     public CreditAccount(){

//     }

//     // 属性封装
//     public void setActno(String actno){
//         this.actno = actno;    
//     }

//     public String getActno(){
//         return this.actno;
//     }
    
//     public void setBalance(double balance){
//         this.balance = balance;
//     }

//     public double getBalance(){
//         return this.balance;
//     }

    // public void setCredit(double credit){
    //     this.credit = credit;
    // }

    // public double getCredit(){
    //     return this.credit;
    // }
// }
class CreditAccount extends Account{
    private double credit;

    public CreditAccount(){

    }

    public void setCredit(double credit){
        this.credit = credit;
    }

    public double getCredit(){
        return this.credit;
    }

}

