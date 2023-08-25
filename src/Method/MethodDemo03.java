package Method;

/**
 * 方法重载：
 * 同一个类中，方法名相同（参数个数不同，类型不同，顺序不同），与返回值无关
 */
public class MethodDemo03 {
    public static void main(String[] args) {
        byte a = 5;
        byte b = 3;
        compare(a,b);
        compare(1,2);
    }

    public static void compare(byte num1, byte num2) {
        if (num1 > num2) {
            System.out.println("第一个数大");
        } else {
            System.out.println("第二个数大");
        }
    }

    public static void compare(short num1, short num2) {
        if (num1 > num2) {
            System.out.println("第一个数大");
        } else {
            System.out.println("第二个数大");
        }
    }

    public static void compare(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("第一个数大");
        } else {
            System.out.println("第二个数大");
        }
    }

    public static void compare(long num1, long num2) {
        if (num1 > num2) {
            System.out.println("第一个数大");
        } else {
            System.out.println("第二个数大");
        }
    }
}
