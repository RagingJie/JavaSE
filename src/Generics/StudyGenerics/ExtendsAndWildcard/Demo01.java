package Generics.StudyGenerics.ExtendsAndWildcard;

import java.util.ArrayList;

/**
 * @Author
 * @Date 2024/9/6 11:07
 * @Description:
 */
public class Demo01 {

    /*
            泛型不具备继承性，但是数据具备继承性
    */

    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        method(list1);
//        method(list2);
//        method(list3);
    }


    /*
            此时，泛型里面写的是什么类型，那么只能传递什么类型的数据
            因为泛型不具备继承性
    */
    public static void method(ArrayList<Ye> list) {

    }

    class Ye {
    }

    class Fu extends Ye {
    }

    class Zi extends Fu {
    }
}
