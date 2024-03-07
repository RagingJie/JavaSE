package PuzzleGame.UI;

import javax.swing.*;
import java.awt.*;

/**
 * @Author Naruto
 * @Date 2024/3/7 0:22
 * @Description: 游戏主界面
 */
public class GameJFrame extends JFrame {

    public GameJFrame() throws HeadlessException {
        // 构造方法用于初始化

        // 初始化游戏界面
        initGameWindows();

        // 初始化菜单
        initGameMenu();

        // 设置窗体是否显示，默认是隐藏的
        this.setVisible(true);

    }

    private void initGameMenu() {
        // 创建 jMenuBar 对象
        JMenuBar jMenuBar = new JMenuBar();

        // 创建菜单上的面的两个选项的对象 （功能，关于我们）
        // 功能 functionJMenu
        JMenu functionJMenu = new JMenu("功能");
        // 关于我们 aboutJMenu
        JMenu aboutJMenu = new JMenu("关于我们");

        // 创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem QQItem = new JMenuItem(" QQ ");

        // 将每个选项下的条目添加到选项当中

        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(QQItem);

        // 将每个选项添加到 jMenuBar 中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        // 显示 jMenuBar
        jMenuBar.setVisible(true);

        // 将 jMenuBar 添加到窗体中
        this.setJMenuBar(jMenuBar);
    }

    private void initGameWindows() {
        // 窗体名字
        this.setTitle("拼图小游戏 V1.0");

        // 设置窗体的高、宽
        this.setSize(403, 480);

        // 设置界面置顶
        this.setAlwaysOnTop(true);

        // 设置界面居中
        this.setLocationRelativeTo(null);

        // 设置关闭模式  点击窗体的×时，程序会停止运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
