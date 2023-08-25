package Method;

/**
 * 初识方法
 * return 和 break关键字的区别
 * return：其实跟循环没有什么关系，跟方法有关的，表示
 *          1结束方法
 *          2返回结果如果方法执行到了return，那么整个方法全部结束，里面的循环也会随之结束了。
 * break：关键字
 * 其实跟方法没有什么关系，结束循环或者switch的。
 */

public class Method {
    /**
     * 静态方法只能调用静态方法
     *
     * @param args
     */
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("GG");
    }
}
