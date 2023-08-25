package Test;

import Array.Array;
import Class.Car.Car;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        System.out.println("******************************");
        question1();
        System.out.println("******************************");
        question2();
        System.out.println("******************************");
        question3();
        System.out.println("******************************");
        question4();
        System.out.println("******************************");
        question5();
        System.out.println("******************************");
    }

    public static void question1() {
        Car car = new Car();
        Class clazz = car.getClass();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            if (declaredMethods[i].getName().startsWith("set")) {
                System.out.print(declaredMethods[i].getName() + " ");
            }
        }
        System.out.println();
    }

    public static void question2() {
        String a = "欢迎来发这里，积极热爱的学习的求职者！";
        int start = a.indexOf("，") + 1;
        int end = a.indexOf("！");

//        String info = JOptionPane.showInputDialog("请输入一个字符串","");
//        System.out.println(info);

        /**
         * 其中，string是要操作的字符串，startIndex是子字符串的起始位置，endIndex是子字符串的结束位置（不包括该位置的字符）。
         * 如果省略endIndex，则提取从startIndex开始到字符串末尾的所有字符。
         */
        String substring = a.substring(start, end);
        System.out.println(substring);
    }

    public static void question3() {
        String shu = "5,6,8,1,2,50,40,35,85,45,61,36,100";
        String[] split = shu.split(",");
        int[] ints = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            if (split[i] != null) {
                int number = Integer.parseInt(split[i]);
                ints[i] = number;
            }
        }
        Arrays.sort(ints);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
        System.out.println();
        for (int i = 0, j = ints.length - 1; i < j; i++, j--) {
            int num = ints[i];
            ints[i] = ints[j];
            ints[j] = num;
        }
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
        System.out.println();
    }

    public static void question4() {
        String filePath = "D:\\WorkSpace\\TestDocument\\words.txt";
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void question5() {
        String filePathA = "D:\\WorkSpace\\TestDocument\\words.txt";
        String filePathB = "D:\\WorkSpace\\TestDocument\\copy.txt";

        try {
            //创建输入流和输出流
            FileInputStream fileInputStream = new FileInputStream(filePathA);
            FileOutputStream fileOutputStream = new FileOutputStream(filePathB);

            // 读取和写入文件内容
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fileInputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, length);
            }

            ////关闭输入和输出流
            fileOutputStream.close();
            fileInputStream.close();

            System.out.println("文件复制成功！");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
