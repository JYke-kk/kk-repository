import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        MyCatCafe m1=new MyCatCafe();
        m1.balance=1800;//余额
        cat c1=new OrangeCat("花花",3,"母",250,true);
        cat c2=new BlackCat("小花",2,"母",350);
        cat c3=new cat("大花",4,"公",170);

        Customer p1 = new Customer("小林",6, LocalDate.now());
        Customer p2= new Customer("77",3,LocalDate.now());
        Customer p3=new Customer("小兰",1,LocalDate.now());




//
      //测试 异常 买猫
        try{
            m1.buy(c1);
        }catch (InsufficientBalanceException e){
            System.out.println("余额不足购买失败");
        }

        try{
            m1.buy(c3);
        }catch (CatNotFoundException e){
            System.out.println("余额不足，购买失败");
        }
         cat cc=m1.catLists.get(m1.random.nextInt(m1.catLists.size()));

        //测试 招待顾客
        try {
            p1.arrival(p1);
            m1.serve(p1, cc);
        }catch (CatNotFoundException e){
            System.out.println("店内无猫，rua猫失败");
        }

        try {
            p2.arrival(p3);
            m1.serve(p3,cc);
        }catch (CatNotFoundException e){
            System.out.println("店里无猫，rua猫失败");
        }
        //歇业
        m1.close(p1,c1,m1);






    }
}
