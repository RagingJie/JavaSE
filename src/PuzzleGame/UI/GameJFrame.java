package PuzzleGame.UI;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.util.Random;

/**
 * @Author Naruto
 * @Date 2024/3/7 0:22
 * @Description: 游戏主界面
 */
public class GameJFrame extends JFrame {

    int[][] tArr = new int[4][4];

    public GameJFrame() throws HeadlessException {
        // 构造方法用于初始化

        // 初始化游戏界面
        initGameWindows();

        // 初始化数据
        initData();

        // 初始化菜单
        initGameMenu();

        // 初始化图片
        initImage();

        // 设置窗体是否显示，默认是隐藏的
        this.setVisible(true);

    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/3/12 22:02
     * @description 打乱图片
     */
    private void initImage() {

        // 路径分为两种：
        // 绝对路径：一定是从盘符开始的。 C:\  D:\
        // 相对路径：不是从盘符开始的   aaa\\bbb
        // 相对路径是对当前项目而言的

        // 细节：
        // 先加载的图片在上方，后加载的图片塞在下方

        // 外循环 --
        for (int j = 0; j < 4; j++) {
            // 内循环 --
            for (int i = 0; i < 4; i++) {
                // 当前要加载的图片序号
                int num = tArr[i][j];
                // 创建管理ImageIcon的容器
                JLabel jLabel = new JLabel(new ImageIcon("image\\girl\\girl2\\" + num + ".jpg"));  // 相对路径，当前模块下的路径
//                JLabel jLabel = new JLabel(new ImageIcon("D:\\WorkSpace\\JavaSE\\image\\girl\\girl2\\" + num + ".jpg"));  // 绝对路径
                // 设置图片的位置与大小
                jLabel.setBounds(105 * i + 84, 105 * j + 154, 105, 105);
                // 给图片添加边框
                // 0：让图片凸起来
                // 1：让图片凹进去
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                // 把管理容器添加到界面中
                this.getContentPane().add(jLabel);

            }
        }

        JLabel background = new JLabel(new ImageIcon("image\\background.png")); // 相对路径，当前模块下的路径
//        JLabel background = new JLabel(new ImageIcon("D:\\WorkSpace\\JavaSE\\image\\background.png")); // 绝对路径
        background.setBounds(40,60,508,560);
        this.getContentPane().add(background);

        // 首先创建一个图片对象
//        ImageIcon imageIcon1 = new ImageIcon("D:\\WorkSpace\\JavaSE\\image\\girl\\girl1\\1.jpg");
//        ImageIcon imageIcon2 = new ImageIcon("D:\\WorkSpace\\JavaSE\\image\\girl\\girl1\\2.jpg");
//
//        // 创建管理ImageIcon的容器
//        JLabel jLabel1 = new JLabel(imageIcon1);
//        JLabel jLabel2 = new JLabel(imageIcon2);
//
//        // 设置图片坐标及大小
//        jLabel1.setBounds(0, 0, 105, 105);
//        jLabel2.setBounds(105, 0, 105, 105);
//
//        // 把管理容器添加到界面中
//        // this.add(jLabel);
//
//        this.getContentPane().add(jLabel1);
//        this.getContentPane().add(jLabel2);

//        int number = 1;

    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/3/12 22:00
     * @description 初始化数据
     */
    private void initData() {
        int[] number = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // 打乱数组顺序
        for (int i = 0; i < 15; i++) {
            Random random = new Random();
            int index = random.nextInt(number.length);
            int temp = number[i];
            number[i] = number[index];
            number[index] = temp;
        }

        // 遍历数组
       /* for (int i : number) {
            System.out.print(i + " ");
        }*/

        int count = 0;

        // 将数组 number 放入二维数组中

        for (int i = 0; i < tArr.length; i++) {
            for (int j = 0; j < tArr[i].length; j++) {
                tArr[i][j] = number[count];
                count++;
            }
        }

        // 遍历二维数组
//        for (int i = 0; i < tArr.length; i++) {
//            for (int j = 0; j < tArr[i].length; j++) {
//                System.out.print(tArr[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/3/12 22:02
     * @description 初始化菜单
     */
    private void initGameMenu() {
        // 创建 jMenuBar 对象
        JMenuBar jMenuBar = new JMenuBar();

        // 创建菜单上的面的两个选项的对象 （功能，关于我们）
        // 功能 functionJMenu
        JMenu functionJMenu = new JMenu("功能");
        // 关于我们 aboutJMenu
        JMenu aboutJMenu = new JMenu("关于我们");
        // 特此鸣谢
        JMenu thanksJMenu = new JMenu("特此鸣谢");

        // 创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");
        JMenuItem thanksItem = new JMenuItem("谢辞");

        JMenuItem QQItem = new JMenuItem(" QQ ");

        // 将每个选项下的条目添加到选项当中

        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        thanksJMenu.add(thanksItem);

        aboutJMenu.add(QQItem);

        // 将每个选项添加到 jMenuBar 中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);
        jMenuBar.add(thanksJMenu);

        // 显示 jMenuBar
        jMenuBar.setVisible(true);

        // 将 jMenuBar 添加到窗体中
        this.setJMenuBar(jMenuBar);
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/3/12 22:02
     * @description 初始化窗口
     */
    private void initGameWindows() {
        // 窗体名字
        this.setTitle("拼图小游戏 V1.0");

        this.setLayout(null);

        // 设置窗体的高、宽
        this.setSize(600, 700);

        // 设置界面置顶， 无论什么页面打开，这个界面总是在最上面
        this.setAlwaysOnTop(true);

        // 设置界面居中
        this.setLocationRelativeTo(null);

        // 设置关闭模式  点击窗体的×时，程序会停止运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
