import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class MyCatCafe implements catcafe {
    double balance=0;//余额
    double profit=0;//利润
    int rua=0;
    Random random=new Random();
   ArrayList<cat>catLists=new ArrayList<cat>();
   ArrayList<cat>numbers=new ArrayList<cat>();
   ArrayList<Customer>customerList=new ArrayList<Customer>();
   ArrayList<Customer>CustomerListToday=new ArrayList<Customer>();

//实现抽象方法

    @Override//重写
    public void buy(cat c) throws InsufficientBalanceException{
        if(balance<c.price){
            throw new InsufficientBalanceException();
        }else{

            balance=balance-c.price;
            catLists.add(c);
            System.out.println("余额充足，顾客可以购买猫猫");
        }
    }




    @Override
    public void serve(Customer customer,cat c) throws CatNotFoundException {
        if (catLists.isEmpty() == true) {
            throw new CatNotFoundException("店内没有猫咪。");
        } else {
            System.out.println("顾客 " + customer.customerName + "  rua了 " + catLists);
            //列表中加入新顾客
            customerList.add(customer);
            if (customer.arrival.equals(LocalDate.now())){
                CustomerListToday.add(customer);
            }
            balance = balance+(customer.rua) * 15;
        }
        //随机挑选猫，用random找
        int size = catLists.size();
        for (int i = 0; i < size; i++) {
            int myRand = random.nextInt(catLists.size());
            numbers.add(catLists.get(myRand));
        }
        customer.rua(c);
        rua += customer.rua;
        //toString输出猫咪信息
        System.out.println("猫猫信息" + c);
    }
    @Override
    public void close(Customer customer,cat c,MyCatCafe m1) {
        LocalDate closetime=LocalDate.now();
        System.out.println("猫咖在"+closetime+"歇业");
        //输出当天顾客信息列表
            if (CustomerListToday.isEmpty()==false){
                System.out.println("今日顾客信息 "+CustomerListToday);
            }else{
                System.out.println("今日无顾客光顾");
            }
        profit=(customer.rua)*15-(c.price)+balance;
        System.out.println("今日的利润为"+profit);
    }














}