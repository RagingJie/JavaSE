package ExecutionFlow;

import java.util.zip.CheckedOutputStream;

/*需求:世界最高山峰是珠穆朗玛峰(8844,43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。
请问，我折叠多少次，可以折成珠穆朗玛峰的高度?*/
public class OrderDemo04_While_Test01 {
    public static void main(String[] args) {
        double i = 0.1;
        int cout = 0;
        while ( i < 8844430 ){
            i *=2;
            cout++;
        }
        System.out.println(cout);
        System.out.println(i);
    }
}
