package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 面试的机试题
 */
public class Test05 {
    public static void main(String[] args) {
        System.out.println("第一题的答案为：");
        question1();
        System.out.println("==================================");
        System.out.println("第二题的答案为：");
        question2();
        System.out.println("==================================");
        System.out.println("第三题的答案为：");
        question3();
        System.out.println("==================================");
        System.out.println("第四题的答案为：");
        question4();
        System.out.println("==================================");
        System.out.println("第五题的答案为：");
        question5();
        System.out.println("==================================");
    }

    /**
     * String a = "欢迎来发这里，积极热爱的学习的求职者！";
     * 截取 “，”与“！“之间的字符串
     * 输出结果为：积极热爱的学习的求职者
     */
    private static void question1() {
        String a = "欢迎来发这里，积极热爱学习的求职者！";
        //补全代码
        int start = a.indexOf("，") + 1;
        int end = a.indexOf("！");
        String result = a.substring(start, end);
        System.out.println(result);

    }

    /**
     * String shu = "5,6,8,1,2,50,40,35,85,45,61,36,100"
     * 将串字符串按照从大到小的顺序排列
     * 输出的结果为："100,85,61,50,45,40,36,35,8,6,5,2,1"
     */
    private static void question2() {
        String shu = "5,6,8,1,2,50,40,35,85,45,61,36,100";
        //补全代码
        String[] split = shu.split(",");
        int[] intArray = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            intArray[i] = Integer.parseInt(split[i]);
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

        System.out.println("\"" + stringBuilder + "\"");

    }

    /**
     * 根据路径找到相应的文件，并在控制台输出该文件的内容
     */
    private static void question3() {
        //路径自己根据自己创建的文件路径填写
        String filePath = "D:\\WorkSpace\\TestDocument\\words.txt";
        //补全代码
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

    /**
     * 下面有两个路径对应的文件，
     * 需求：
     * 用代码实现将文件 words 的内容复制到文件 copy 中
     */
    private static void question4() {
        //这个也是路径自己根据自己创建的文件路径填写
        String filePathA = "D:\\WorkSpace\\TestDocument\\words.txt";
        String filePathB = "D:\\WorkSpace\\TestDocument\\copy.txt";
        //补全代码
        try {
            FileInputStream fis = new FileInputStream(filePathA);
            FileOutputStream fio = new FileOutputStream(filePathB);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0){
                fio.write(buffer,0,length);
            }
            System.out.println("复制成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 有一个 Student对象，用反射的思想将其中的set方法全部打印出来
     * 注：
     * 这个Student对象需要自己创建，里面的属性值和set、get方法自己创建即可
     */
    private static void question5() {
        //补全代码
        Student1 student1 = new Student1();
        Class aClass = student1.getClass();
        int count = 0;
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            String methodName = method.getName();
            if (methodName.startsWith("set")) {
                System.out.print(methodName + " ");
                count++;
            }
        }
        System.out.println(" ");
        System.out.println("set方法的总个数为：" + count);
    }

}
