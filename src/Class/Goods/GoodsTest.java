package Class.Goods;

import javax.sound.midi.Soundbank;

public class GoodsTest {
    public static void main(String[] args) {
        //1.创建一个数组
        Goods[] goods = new Goods[3];

        //2.创建三个商品对象
        Goods g1 = new Goods("001","小米",3999.0,100);
        Goods g2 = new Goods("002","苹果",7999.0,80);
        Goods g3 = new Goods("003","华为",9999.0,999);

        //3.把商品放入数组中
        goods[0] = g1;
        goods[1] = g2;
        goods[2] = g3;

        for (int i = 0; i < goods.length; i++) {
            Goods good = goods[i];
            System.out.println(good.getId()+","+good.getName()+","+good.getPrice()+","+good.getCount());
        }
    }
}
