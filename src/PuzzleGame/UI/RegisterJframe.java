package PuzzleGame.UI;

import javax.swing.*;
import java.awt.*;

/**
 * @Author Naruto
 * @Date 2024/3/7 0:27
 * @Description:
 */
public class RegisterJframe extends JFrame {

    public RegisterJframe() throws HeadlessException {
//        super("注册");
//        this.setSize(488, 500);

        // 窗体名字
        this.setTitle("拼图 注册");

        // 设置窗体的高、宽
        this.setSize(388, 400);

        // 设置界面置顶
        this.setAlwaysOnTop(true);

        // 设置界面居中
        this.setLocationRelativeTo(null);

        // 设置关闭模式  点击窗体的×时，程序会停止运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        // 设置窗体是否显示，默认是隐藏的
        this.setVisible(true);
    }
}
