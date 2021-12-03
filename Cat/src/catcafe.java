import java.util.ArrayList;

public interface catcafe {//接口中所有的都是抽象方法
     void buy(cat c);//省略掉abstract 都是公开公共的
     void serve(Customer customer, cat c);//招待
     void close(Customer customer,cat c,MyCatCafe m1);//歇业

    }


