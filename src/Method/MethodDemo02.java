package Method;

public class MethodDemo02 {
    public static void main(String[] args) {

        //第一季度营业额
        int sum1 = getSum(10, 20, 33);
        //第二季度营业额
        int sum2 = getSum(30, 50, 44);
        //第三季度营业额
        int sum3 = getSum(55, 99, 40);
        //第四季度营业额
        int sum4 = getSum(94, 35, 40);

        System.out.println("全年的营业额为："+(sum1+sum2+sum3+sum4));
    }

    public static int getSum(int num1,int num2,int num3){
        return num1+num2+num3;
    }

}
