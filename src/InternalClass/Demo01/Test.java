package InternalClass.Demo01;

/**
 * @Author Naruto
 * @Date 2024/3/5 10:45
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        /*
            1.什么是内部类？
                写在一个类里面的类叫做内部类
            2.什么时候用到内部类？
                B类表示的事物是A类的一部分，且B单独存在没有意义
                比如：汽车的发动机、ArrayList的迭代器、人的心脏等等
         */




        Car car = new Car("宾利", 5, "蓝色");
        System.out.println(car.getCarName());
        System.out.println(car.getAge());
        System.out.println(car.getColor());

        car.show();
    }
}
