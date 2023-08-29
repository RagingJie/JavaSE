package ArrayList;

import java.util.ArrayList;

/**
 * 需求:
 * 定义Javabean类:
 *      Phone
 *      属性: 品牌，价格。
 *      main方法中定义一个集合，
 *      存入三个手机对象分别为:
 *              小米，1000。苹果，8000。锤子，2999
 *      定义一个方法，将价格低于3000的手机信息返回
 */
public class ArrayListDemo10 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<Phone>();
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> phones = getPhoneByPriceLow(3000, list);
        print(phones);

    }

    public static ArrayList<Phone> getPhoneByPriceLow(double price, ArrayList<Phone> list){
        ArrayList<Phone> phones = new ArrayList<Phone>();
        for (int i = 0; i < list.size(); i++) {
            double priceP = list.get(i).getPrice();
            if (priceP < price){
                phones.add(list.get(i));
            }
        }
        return phones;
    }

    public static void print(ArrayList<Phone> phones){
        System.out.print("[");
        for (int i = 0; i < phones.size(); i++) {
            Phone s = phones.get(i);
            if (i!=phones.size()-1){
                System.out.print(s.getBrand()+","+s.getPrice());
                System.out.print(", ");
            }else {
                System.out.print(s.getBrand()+","+s.getPrice());
            }

        }

        System.out.println("]");
    }
}
