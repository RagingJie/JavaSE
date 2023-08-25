package BasisStudy;

public class Demo10 {
    public static void main(String[] args) {
        //练习StringBuffer的三个方法  append   deleteCharAt   delete
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("stttudent");
        System.out.println(stringBuffer);
        stringBuffer.deleteCharAt(1);
        System.out.println(stringBuffer);
        stringBuffer.delete(1,5);
        System.out.println(stringBuffer);
    }
}
