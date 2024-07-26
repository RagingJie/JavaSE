package IO_Stream.ReviewExercises;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.*;
import java.util.*;


/**
 * @Author
 * @Date 2024/7/25 15:26
 * @Description: 使用hutool包，制造假数据也是开发中的一个能力，在各个网上爬取数据，是其中一个方法
 */
public class ReptileExercises02 {
    /*
           网址：
                获取姓氏(百家姓)：
                    https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d
                男生名字：
                    http://mingzi.jb51.net/qiming/nanhai/68814860866.html
                获取女生名字：
                    http://mingzi.jb51.net/qiming/nvhai/68815554142.html
     */

    public static void main(String[] args) throws IOException {

        // 定义网址
        String familyNamesNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String boyNamesNet = "http://mingzi.jb51.net/qiming/nanhai/68814860866.html";
        String girlNamesNet = "http://mingzi.jb51.net/qiming/nvhai/68815554142.html";

        // 爬取数据
        String familyNamesStr = HttpUtil.get(familyNamesNet);
        String boyNamesStr = HttpUtil.get(boyNamesNet);
        String girlNamesStr = HttpUtil.get(girlNamesNet);

        List<String> familyNamesTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{4})(，|。)", familyNamesStr, 1);
        List<String> boyNamesTempList = ReUtil.findAll("(\\.)([\\u4E00-\\u9FA5]{2}、[\\u4E00-\\u9FA5]{2}、[\\u4E00-\\u9FA5]{2}、[\\u4E00-\\u9FA5]{2}、[\\u4E00-\\u9FA5]{2})(<)", boyNamesStr, 2);
        List<String> girlNamesTempList = ReUtil.findAll("(\\.)([\\u4E00-\\u9FA5]{2}、[\\u4E00-\\u9FA5]{2}、[\\u4E00-\\u9FA5]{2}、[\\u4E00-\\u9FA5]{2}、[\\u4E00-\\u9FA5]{2})(<)", girlNamesStr, 2);
        System.out.println("姓氏：" + familyNamesTempList);
        System.out.println("男生名字：" + boyNamesTempList);
        System.out.println("女生名字：" + girlNamesTempList);

        // 将姓氏单独分开为单个字为一个元素放入list集合中
        ArrayList<String> familyNamesList = new ArrayList<>();
        for (String str : familyNamesTempList) {
            for (int i = 0; i < str.length(); i++) {
                familyNamesList.add(str.charAt(i) + "");
            }
        }

        ArrayList<String> boyNamesList = nameRemoveWeight(boyNamesTempList);
        ArrayList<String> girlNamesList = nameRemoveWeight(girlNamesTempList);

        ArrayList<String> infos = getInfos(familyNamesList, boyNamesList, girlNamesList, 100, 60);
        // 打乱数据
        Collections.shuffle(infos);

        // 路径相当于class文件的
        FileUtil.writeLines(infos, "src\\IO_Stream\\ExerciseFile\\hutool假数据信息.txt", "UTF-8");
    }

    /**
     * @param list 数据集合
     * @return java.util.ArrayList<java.lang.String>
     * @author Naruto
     * @date 2024/7/25 17:13
     * @description 名字去重【去重并返回单个名字为元素的集合】
     */
    private static ArrayList<String> nameRemoveWeight(List<String> list) {
        // 创建返回结果集合
        ArrayList<String> result = new ArrayList<>();

        for (String str : list) {
            String[] arr = str.split("、");
            for (String name : arr) {
                if (!result.contains(name)) {
                    result.add(name);
                }
            }
        }

        // 返回结果
        return result;
    }

    /**
     * @param familyNamesList 姓氏集合
     * @param boyNamesList    男生姓名集合
     * @param girlNamesList   女生姓名集合
     * @param boyCount        男生数
     * @param girlCount       女生数
     * @return java.util.ArrayList<java.lang.String>
     * @author Naruto
     * @date 2024/7/25 17:33
     * @description 获取男女信息
     */
    private static ArrayList<String> getInfos(ArrayList<String> familyNamesList, ArrayList<String> boyNamesList, ArrayList<String> girlNamesList, int boyCount, int girlCount) {
        // 创建返回结果list
        ArrayList<String> result = new ArrayList<>();

        // 创建存储男生信息的单列集合
        HashSet<String> boyNames = new HashSet<>();
        while (true) {
            if (boyNames.size() == boyCount) break;
            // 打乱集合顺序
            Collections.shuffle(familyNamesList);
            Collections.shuffle(boyNamesList);

            // 男生姓名
            boyNames.add(familyNamesList.get(0) + boyNamesList.get(0));
        }

        // 创建存储女生信息的单列集合
        HashSet<String> girlNames = new HashSet<>();
        while (true) {
            if (girlNames.size() == girlCount) break;
            // 打乱集合顺序
            Collections.shuffle(familyNamesList);
            Collections.shuffle(girlNamesList);

            // 女生姓名
            girlNames.add(familyNamesList.get(0) + girlNamesList.get(0));
        }

        // 创建随机数对象
        Random random = new Random();
        // 男生
        // 年龄  18~35
        // 35 - 18 = 17
        for (String boyName : boyNames) {
            int age = random.nextInt(18) + 18;
            result.add(boyName + "-男-" + age);
        }

        // 女生
        // 年龄  18~25
        // 25 - 18 = 7
        for (String girlName : girlNames) {
            int age = random.nextInt(8) + 18;
            result.add(girlName + "-女-" + age);
        }

        // 返回结果
        return result;
    }
}
