package IO_Stream.ReviewExercises;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author
 * @Date 2024/7/25 15:26
 * @Description: 制造假数据也是开发中的一个能力，在各个网上爬取数据，是其中一个方法
 */
public class ReptileExercises01 {
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

        String familyNamesStr = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String boyNamesStr = "http://mingzi.jb51.net/qiming/nanhai/68814860866.html";
        String girlNamesStr = "http://mingzi.jb51.net/qiming/nvhai/68815554142.html";

        String familyNamesResult = webCrawler(familyNamesStr);
        String boyNamesResult = webCrawler(boyNamesStr);
        String girlNamesResult = webCrawler(girlNamesStr);

        ArrayList<String> familyNamesTempList = getData(familyNamesResult, "([\\u4e00-\\u9fa5]{4})(，|。)", 1); // 定义了一个字符集，其中 \u4e00 到 \u9fa5 是 Unicode 范围内的中文字符。
//        System.out.println("姓氏集合：");
//        System.out.println(familyNamesTempList);
        ArrayList<String> boyNamesResultTempList = getData(boyNamesResult, "(\\.)(([\\u4e00-\\u9fa5]{2})、([\\u4e00-\\u9fa5]{2})、([\\u4e00-\\u9fa5]{2})、([\\u4e00-\\u9fa5]{2})、([\\u4e00-\\u9fa5]{2}))(<)", 2);
//        System.out.println("男性名字集合：");
//        System.out.println(boyNamesResultTempList);
        ArrayList<String> girlNamesResultTempList = getData(girlNamesResult, "(\\.)(([\\u4e00-\\u9fa5]{2})、([\\u4e00-\\u9fa5]{2})、([\\u4e00-\\u9fa5]{2})、([\\u4e00-\\u9fa5]{2})、([\\u4e00-\\u9fa5]{2}))(<)", 2);
//        System.out.println("女生名字集合：");
//        System.out.println(girlNamesResultTempList);

        // 将姓氏单独分开为单个字为一个元素放入list集合中
        ArrayList<String> familyNamesList = new ArrayList<>();
        for (String str : familyNamesTempList) {
            for (int i = 0; i < str.length(); i++) {
                familyNamesList.add(str.charAt(i) + "");
            }
        }
//        System.out.println("【姓氏】集合：");
//        System.out.println(familyNamesList);
//        System.out.println("\n【男生】名字集合：");
        ArrayList<String> boyNamesResultList = nameRemoveWeight(boyNamesResultTempList);
//        System.out.println(boyNamesResultList);
//        System.out.println("\n【女生】名字集合：");
        ArrayList<String> girlNamesResultList = nameRemoveWeight(girlNamesResultTempList);
//        System.out.println(girlNamesResultList);

        ArrayList<String> infos = getInfos(familyNamesList, boyNamesResultList, girlNamesResultList, 30, 20);
        Collections.shuffle(infos);
        System.out.println(infos);

        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\IO_Stream\\ExerciseFile\\假数据信息.txt"));
        for (String info : infos) {
            bw.write(info);
            bw.newLine();
            // 将缓冲区中的数据刷新到文件中
            bw.flush();
        }

        // 释放资源
        bw.close();

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

    /**
     * @param list 数据集合
     * @return java.util.ArrayList<java.lang.String>
     * @author Naruto
     * @date 2024/7/25 17:13
     * @description 名字去重【去重并返回单个名字为元素的集合】
     */
    private static ArrayList<String> nameRemoveWeight(ArrayList<String> list) {
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
     * @param str   数据源
     * @param regex 正则表达式
     * @return java.util.ArrayList<java.lang.String>
     * @author Naruto
     * @date 2024/7/25 15:58
     * @description 获取数据
     */
    private static ArrayList<String> getData(String str, String regex, int index) {
        // 创建list存放数据
        ArrayList<String> list = new ArrayList<>();
        // 获取正则表达式对象，按照正则表达式获取数据
        Pattern pattern = Pattern.compile(regex);
        // 按照pattern的规则，到str当中获取数据
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }

        return list;
    }

    /**
     * @return java.lang.String
     * @author Naruto
     * @date 2024/7/25 15:40
     * @description 网络爬取，获取页面制定网址上的数据
     */
    private static String webCrawler(String netUrl) throws IOException {
        // 创建拼接对象，拼接爬取的数据
        StringBuilder result = new StringBuilder();
        // 创建url对象
        URL url = new URL(netUrl);
        // 获取链接
        URLConnection conn = url.openConnection();
        // 获取输入流（字节输入流，考虑到可能有文字，将其转为字符输入流）
        InputStream inputStream = conn.getInputStream();
        InputStreamReader isr = new InputStreamReader(inputStream);
        int read;
        while ((read = isr.read()) != -1) {
            result.append((char) read);
        }

        // 释放资源
        isr.close();
        inputStream.close();

        return result.toString();

    }
}
