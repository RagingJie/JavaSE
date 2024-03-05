package InternalClass.Demo01;

/**
 * @Author Naruto
 * @Date 2024/3/5 10:33
 * @Description:
 */
public class Car {
    /*
        需求:写一个avabean类描述汽车
        属性:汽车的品牌，车龄，颜色，发动机的品牌，使用年限

     */

    public Car() {
    }

    public Car(String carName, int age, String color) {
        this.carName = carName;
        this.age = age;
        this.color = color;
    }

    private String carName;
    private int age;
    private String color;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show() {
        Engine engine = new Engine();   // 外部类调用内部类的属性或方法，需要实例化内部类
        System.out.println(age);
        System.out.println(engine.engineName);
    }

     class Engine {

        public Engine(String engineName, int engineAge) {
            this.engineName = engineName;
            this.engineAge = engineAge;
        }

        public Engine() {
        }

        private String engineName;
        private int engineAge;

        public String getEngineName() {
            return engineName;
        }

        public void setEngineName(String engineName) {
            this.engineName = engineName;
        }

        public int getEngineAge() {
            return engineAge;
        }

        public void setEngineAge(int engineAge) {
            this.engineAge = engineAge;
        }

        public void show() {
            System.out.println(engineName);  // 内部类自己的属性
            System.out.println(age); // 外部类的属性
        }
    }
}
