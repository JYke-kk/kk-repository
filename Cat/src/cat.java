public class cat {
    String name;
    int age;
    String gender;
    double price;

    //构造一个全参方法
    public cat(String name,int aga,String gender,double price){
        this.name =name;
        this.age=age;
        this.gender=gender;
        this.price=price;
    }

    //一个抽象的toString方法
    @Override
    public String toString() {
        return "cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", price=" + price +
                '}';
    }
}

