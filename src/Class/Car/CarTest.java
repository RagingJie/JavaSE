package Class.Car;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++) {
            Car car = new Car();
            System.out.println("请输入第"+(i+1)+"辆车的品牌：");
            car.setBrand(scanner.next());
            System.out.println("请输入第"+(i+1)+"辆车的价格：");
            car.setPrice(scanner.nextDouble());
            System.out.println("请输入第"+(i+1)+"辆车的颜色：");
            car.setColor(scanner.next());
            cars[i] = car;
        }

        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println(car.getBrand()+","+car.getPrice()+","+car.getColor());
        }
    }
}
