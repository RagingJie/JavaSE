package Test;

import java.io.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 面试的机试题
 */
public class Test04 {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
    }

    /**
     * 有一个 Student1对象，用反射的思想将其中的set方法全部打印出来
     */
    private static void question5() {
        Student1 student1 = new Student1();
        Class clazz = student1.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        int count = 0;
        System.out.println("第五题的答案为：");
        System.out.print("Student1对象的set方法有：");
        for (Method method : methods) {
            String methodName = method.getName();
            if (methodName.startsWith("set")) {
                System.out.print(methodName + "  ");
                count++;
            }
        }
        System.out.println(" ");
        System.out.println("共有" + count + "个set方法");
    }

    /**
     * 根据路径找到相应的文件，并在控制台输出该文件的内容
     */
    private static void question4() {
        System.out.println("第四题的答案为：");
        String filePath = "D:\\WorkSpace\\TestDocument\\words.txt";
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(" ");
    }

    /**
     * 下面有两个路径对应的文件，
     * 需求：
     * 用代码实现将文件 words 的内容复制到文件 copy 中
     */
    private static void question3() {
        String filePathA = "D:\\WorkSpace\\TestDocument\\words.txt";
        String filePathB = "D:\\WorkSpace\\TestDocument\\copy.txt";
        File file1 = new File(filePathA);
        File file2 = new File(filePathB);
        System.out.println("第三题的答案为：");
        try {
            System.out.println("复制操作触发前：两个文件的内容为：");
            Scanner scanner1 = new Scanner(file1);
            Scanner scanner2 = new Scanner(file2);
            System.out.println("============words.txt的原内容为：================");
            while (scanner1.hasNextLine()) {
                String line1 = scanner1.nextLine();
                System.out.println(line1);
            }
            System.out.println("=============copy.txt的原内容为：================");
            while (scanner2.hasNextLine()) {
                String line2 = scanner2.nextLine();
                System.out.println(line2);
            }
            System.out.println("************************************************");

            //测试了 while 与 if 显示内容的区别
            /*System.out.println("==================================");
            while (scanner1.hasNextLine()){
                String line1 = scanner1.nextLine();
                System.out.println(line1);
            }
            System.out.println("==================================");
            if (scanner2.hasNextLine()){
                String line2 = scanner2.nextLine();
                System.out.println(line2);
            }
            System.out.println("==================================");*/
            // 创建输入流和输出流
            FileInputStream fileInputStream = new FileInputStream(filePathA);
            FileOutputStream fileOutputStream = new FileOutputStream(filePathB);

            // 读取和写入文件内容
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fileInputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, length);
            }

            //关闭输入和输出流
            fileInputStream.close();
            fileOutputStream.close();
            System.out.println("\t\t\t\t文件复制成功！");
            System.out.println("************************************************");

            System.out.println("复制操作触发后：两个文件的内容为：");
            Scanner scanner3 = new Scanner(file1);
            Scanner scanner4 = new Scanner(file2);
            System.out.println("============words.txt的原内容为：================");
            while (scanner3.hasNextLine()) {
                String line3 = scanner3.nextLine();
                System.out.println(line3);
            }
            System.out.println("=============copy.txt的原内容为：================");
            while (scanner4.hasNextLine()) {
                String line4 = scanner4.nextLine();
                System.out.println(line4);
            }
            System.out.println("================================================");
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(" ");
    }

    /**
     * String shu = "5,6,8,1,2,50,40,35,85,45,61,36,100"
     * 将串字符串按照从大到小的顺序排列
     * 输出的结果为："100,85,61,50,45,40,36,35,8,6,5,2,1"
     */
    private static void question2() {
        String shu = "5,6,8,1,2,50,40,35,85,45,61,36,100";
        String[] shuArray = shu.split(",");
        int[] intArray = new int[shuArray.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(shuArray[i]);
        }
        Arrays.sort(intArray);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = intArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                stringBuilder.append(intArray[i]);
            } else {
                stringBuilder.append(intArray[i] + ",");
            }
        }
        System.out.println("第二题的答案为:");
        System.out.println(stringBuilder);
        System.out.println(" ");


    }

    /**
     * String a = "欢迎来发这里，积极热爱的学习的求职者！";
     * 截取 “，”与“！“之间的字符串
     * 输出结果为：积极热爱的学习的求职者
     */
    private static void question1() {
        String a = "欢迎来发这里，积极热爱的学习的求职者！";
        int i = a.indexOf("，") + 1;
//        System.out.println(i);
        int j = a.indexOf("！");
//        System.out.println(j);
        String substring = a.substring(i, j);
        System.out.println("第一题的答案：");
        System.out.println(substring + '\n');
    }

}
