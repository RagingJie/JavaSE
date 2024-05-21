package PuzzleGame.UI;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 * @Author Naruto
 * @Date 2024/3/7 0:22
 * @Description: 游戏主界面
 */
public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    // 二维数组，存放拼图--图片位置
    int[][] tArr = new int[4][4];

    // 记录空白方块在二维数组中的位置
    // x:横坐标  y:纵坐标
    int x = 0;
    int y = 0;

    // 定义图片全局路径
    // 默认美女地址
    String path = "image\\girl\\girl1";

    // 定义一个胜利数组，判断使用顺利通关
    int[][] winArr = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    // 移动步数
    int stepCount = 0;

    // 创建选项下面的条目对象 （全局变量，为了监听动作事件）
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem thanksItem = new JMenuItem("谢辞");
    JMenuItem QQItem = new JMenuItem(" QQ ");

    JMenuItem girlItem = new JMenuItem("美女");
    JMenuItem animalItem = new JMenuItem("动物");
    JMenuItem sportItem = new JMenuItem("运动");

    public GameJFrame() throws HeadlessException {
        // 构造方法用于初始化

        // 初始化游戏界面（窗口）
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
     * @description 渲染图片
     */
    private void initImage() {

        // 首先清空画布中的图片，不清空的话，图片无法正常显示渲染效果
        this.getContentPane().removeAll();

//        System.out.println("空白图横坐标：" + x);
//        System.out.println("空白图纵坐标：" + y);

        // 路径分为两种：
        // 绝对路径：一定是从盘符开始的。 C:\  D:\
        // 相对路径：不是从盘符开始的   aaa\\bbb
        // 相对路径是对当前项目而言的

        // 细节：
        // 先加载的图片在上方，后加载的图片塞在下方

        // 步数显示
        JLabel stepNumber = new JLabel("步数：" + stepCount);
        Font customFont = new Font("黑体", Font.PLAIN, 20);
        stepNumber.setFont(customFont);

        stepNumber.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepNumber);

        if (isWin()) {
            JLabel win = new JLabel(new ImageIcon("image\\win.png"));
            win.setBounds(200, 320, 197, 73);
            this.getContentPane().add(win);
        }

        // 外循环 --
        for (int j = 0; j < 4; j++) {
            // 内循环 --
            for (int i = 0; i < 4; i++) {
                // 当前要加载的图片序号
                int num = tArr[j][i];
                // 创建管理ImageIcon的容器
                JLabel jLabel = new JLabel(new ImageIcon(path + "\\" + num + ".jpg"));  // 相对路径，当前模块下的路径
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
        background.setBounds(40, 60, 508, 560);
        this.getContentPane().add(background);

        // 刷新，重新加载画布中的图片，实现图片移动的效果
        this.getContentPane().repaint();

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
                if (number[count] == 0) {
                    x = i;
                    y = j;
                }
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
        // 更多图片
        JMenu moreImageJMenu = new JMenu("更多图片");


        // 添加动作监听事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        thanksItem.addActionListener(this);
        QQItem.addActionListener(this);
        girlItem.addActionListener(this);
        sportItem.addActionListener(this);
        animalItem.addActionListener(this);

        // 将每个选项下的条目添加到选项当中

        // 更多图片
        moreImageJMenu.add(girlItem);
        moreImageJMenu.add(animalItem);
        moreImageJMenu.add(sportItem);
        // 功能
        functionJMenu.add(moreImageJMenu);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        // 特此鸣谢
        thanksJMenu.add(thanksItem);
        // 关于我们
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

        // 禁用窗口最大化
        this.setResizable(false);

        // 监听键盘输入
        this.addKeyListener(this);

        // 设置关闭模式  点击窗体的×时，程序会停止运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    /**
     * @return boolean
     * @author Naruto
     * @date 2024/5/6 16:17
     * @description 判断是否闯关成功
     */
    private boolean isWin() {

        for (int i = 0; i < tArr.length; i++) {
            for (int j = 0; j < tArr.length; j++) {
                // 只用有一个不满足要求，就返回false
                if (winArr[i][j] != tArr[i][j]) return false;
            }
        }

        // 全部满足返回 true
        return true;

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * @param e
     * @return void
     * @author Naruto
     * @date 2024/5/6 14:05
     * @description 按下按键触发, 长按重复触发
     */
    @Override
    public void keyPressed(KeyEvent e) {
        // 如果已经胜利，就不能再继续玩这一把游戏了
        if (isWin()) return;  // return 两种含义：1.结束方法 2.返回结果

        int keyCode = e.getKeyCode();

        if (keyCode == 65) {
            System.out.println("按下的键是：A  ||  看完整图");

            this.getContentPane().removeAll();

            JLabel all = new JLabel(new ImageIcon(path + "\\" + "all.jpg"));
            all.setBounds(84, 154, 420, 420);

            JLabel background = new JLabel(new ImageIcon("image\\background.png"));
            background.setBounds(40, 60, 508, 560);

            this.getContentPane().add(all);
            this.getContentPane().add(background);
            this.getContentPane().repaint();

        }

    }

    /**
     * @param e
     * @return void
     * @author Naruto
     * @date 2024/5/6 14:05
     * @description 松开按键触发
     */
    @Override
    public void keyReleased(KeyEvent e) {
        // 如果已经胜利，就不能再继续玩这一把游戏了
        if (isWin()) return;

        int keyCode = e.getKeyCode();
//        System.out.println("按键的编号是：" + keyCode);

        // 向左移动
        if (keyCode == 37) {
            System.out.println("按下的键是：←  ||  向左移动");

            if (y == 3) return;  // 防止数组索引越界

            tArr[x][y] = tArr[x][y + 1];
            tArr[x][y + 1] = 0;
            y++;
            // 每按下一次，步数+1
            stepCount++;
            initImage();
        }

        // 向上移动
        if (keyCode == 38) {
            System.out.println("按下的键是：↑  ||  向上移动");

            if (x == 3) return; // 防止数组索引越界

            tArr[x][y] = tArr[x + 1][y];
            tArr[x + 1][y] = 0;
            x++;
            // 没按下一次，步数+1
            stepCount++;
            initImage();
        }

        // 向右移动
        if (keyCode == 39) {
            System.out.println("按下的键是：→  ||  向右移动");

            if (y == 0) return; // 防止数组索引越界

            tArr[x][y] = tArr[x][y - 1];
            tArr[x][y - 1] = 0;
            y--;
            // 没按下一次，步数+1
            stepCount++;
            initImage();
        }

        // 向下移动
        if (keyCode == 40) {
            System.out.println("按下的键是：↓  ||  向下移动");

            if (x == 0) return;  // 防止数组索引越界

            tArr[x][y] = tArr[x - 1][y];
            tArr[x - 1][y] = 0;
            x--;
            // 没按下一次，步数+1
            stepCount++;
            initImage();
        }

        if (keyCode == 65) {
            initImage();
        }

        if (keyCode == 87) {
            // 作弊码 W：一件通关
            tArr = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };

            x = 3;
            y = 3;

            initImage();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == replayItem) {
            System.out.println("重新游戏");
            // 初始化数据
            initData();
            // 移动步数清零
            stepCount = 0;
            // 渲染图片
            initImage();
        }

        if (source == closeItem) {
            System.out.println("关闭游戏");
            // 直接关闭虚拟机
            System.exit(0);
        }

        if (source == reLoginItem) {
            System.out.println("重新登录");
            // 隐藏游戏主界面
            this.setVisible(false);
            // 显示登录界面
            new LoginJframe();
        }

        if (source == QQItem) {
            System.out.println("关于我们");

            JLabel QQ = new JLabel(new ImageIcon("image\\about.jpg"));
            QQ.setBounds(0, 0, 350, 350);

            // 创建一个弹窗对象
            JDialog jDialog = new JDialog();
            // 标题信息
            jDialog.setTitle("QQ");
            // 将QQ添加到弹窗的画布中
            jDialog.getContentPane().add(QQ);
            // 显示弹窗
            jDialog.setVisible(true);
            // 总是置顶
            jDialog.setAlwaysOnTop(true);
            // 居中显示
            jDialog.setLocationRelativeTo(null);
            // 只有关闭了弹窗，才能进行其他操作
            jDialog.setModal(true);
            // 设置弹窗的大小
            jDialog.setSize(320, 320);

        }

        if (source == thanksItem) {
            System.out.println("谢辞");
        }

        if (source == girlItem) {
            System.out.println("美女");
            Random random = new Random();
            int index = random.nextInt(13) + 1;

            // 美女图片地址
            path = "image\\girl\\girl" + index;

            // 初始化图片数据
            initImage();
        }

        if (source == animalItem) {
            System.out.println("动物");

            Random random = new Random();
            int index = random.nextInt(8) + 1;

            // 动物图片地址
            path = "image\\animal\\animal" + index;

            // 初始化图片数据
            initImage();
        }

        if (source == sportItem) {
            System.out.println("运动");

            Random random = new Random();
            int index = random.nextInt(10) + 1;

            // 运动图片地址
            path = "image\\sport\\sport" + index;

            // 初始化图片数据
            initImage();
        }
    }
}
