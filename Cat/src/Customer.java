import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Customer {
    String customerName;
    int rua;
//    LocalDate arrival=LocalDate.now();
    LocalDate arrival = LocalDate.now();

    public Customer(String customerName, int rua,LocalDate arrival) {
        this.customerName = customerName;
        this.rua = rua;
        this.arrival=arrival;


    }
    public void arrival(Customer customer){
        System.out.println(this.arrival);

    }


    //toString重写
    @Override
    public String toString() {
        return "顾客的名字" + this.customerName + "run猫的次数" + this.rua + "到店的时间" + this.arrival;
    }

    public void rua(cat c) {
        System.out.println(this.customerName +"rua了" +rua+"次猫");
    }



}
