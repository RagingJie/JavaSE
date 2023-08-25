package ExecutionFlow;

/**
 * 分支结构：swith 判断语句
 */

/*
default的位置和省略:
    1.位置 : defaule不一定是写在最下面的，我们可以写在任意位置。只不过习惯会写在最下面
    2.省略 : defaule可以省略，语法不会有问题，但是不建议省略。
 */

/*
case穿透:
    就是语句体中没有写break导致的。执行流程:
    首先还是会拿着小括号中表达式的值跟下面每一个case进行匹配。
    如果匹配上了，就会执行对应的语句体，如果此时发现了break，那么结束整个switch语句。
    如果没有发现break，那么程序会继续执行下一个case的语句体，一直遇到break或者右大括号为止。
使用场景:
    如果多个case的语句体重复了，那么我们考虑利用case穿透去简化代码
 */

public class OrderDemo03_Switch {
    public static void main(String[] args) {
        String noodles = "武汉热干面";
        switch (noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}
